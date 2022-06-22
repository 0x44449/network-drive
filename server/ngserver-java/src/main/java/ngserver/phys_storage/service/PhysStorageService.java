package ngserver.phys_storage.service;

import com.google.protobuf.ByteString;
import drive_common.dokan_port.constants.microsoft.*;
import drive_common.drive_storage.NStorage;
import drive_protocol.request.*;
import drive_protocol.response.*;
import ngserver.phys_storage.repository.ObjectsRepository;
import ngserver.phys_storage.repository.OplocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.ZoneId;

@Service
public class PhysStorageService implements NStorage {
    @Autowired
    ObjectsRepository objectsRepository;
    @Autowired
    OplocksRepository oplocksRepository;

    @Override
    public CreateFileResponse createFile(CreateFileRequest request) {
        var responseBuilder = CreateFileResponse.newBuilder();

        // https://docs.microsoft.com/en-us/windows-hardware/drivers/ddi/ntifs/nf-ntifs-ntcreatefile
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();
        var createDisposition = CreateDisposition.fromInt(request.getCreateDisposition());
        var desiredAccess = request.getDesiredAccess();
        var fileShare = FileShare.maskValueSet(request.getShareAccess());
        var fileAttributes = FileAttribute.maskValueSet(request.getFileAttributes());
        var createOptions = CreateOption.maskValueSet(request.getCreateOptions());
        var fileMode = FileMode.fromInt(request.getFileMode());
        var isDirectory = requestInfo.getIsDirectory();

        var objectInfo = objectsRepository.findObjectByFullPath(fileName);

        /*
        If the file is a directory, CreateFile is also called.
        In this case, CreateFile should return STATUS_SUCCESS when that directory can be opened and DOKAN_FILE_INFO.IsDirectory has to be set to TRUE.
        On the other hand, if DOKAN_FILE_INFO.IsDirectory is set to TRUE but the path targets a file, STATUS_NOT_A_DIRECTORY must be returned.
         */
        if (isDirectory) { // assume file is directory
            if (objectInfo == null) { // if object not exists
                switch (fileMode) {
                    case OPEN -> {
                        return CreateFileResponse.newBuilder()
                                .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue())
                                .build();
                    }
                }
            }
            else { // if object exists
                if (objectInfo.isFile()) { // if object is file * unmatched
                    switch (fileMode) {
                        case OPEN_OR_CREATE, OPEN, CREATE -> {
                            return CreateFileResponse.newBuilder()
                                    .setStatus(NtStatus.NOT_A_DIRECTORY.intValue())
                                    .build();
                        }
                    }
                }
                else { // if object is directory
                    switch (fileMode) {
                        case CREATE_NEW -> {
                            return CreateFileResponse.newBuilder()
                                    .setStatus(NtStatus.OBJECT_NAME_COLLISION.intValue())
                                    .build();
                        }
                    }
                }
            }
        }
        else { // assume file is file
            // check file exists with FileMode
            if (objectInfo == null) { // if object is not exists
                switch (fileMode) {
                    case OPEN, TRUNCATE -> {
                        return CreateFileResponse.newBuilder()
                                .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue())
                                .build();
                    }
                }
            }
            else { // if object is exists
                if (objectInfo.isFile()) { // if object is file
                    switch (fileMode) {
                        case OPEN, CREATE_NEW -> {
                            return CreateFileResponse.newBuilder()
                                    .setStatus(NtStatus.OBJECT_NAME_COLLISION.intValue())
                                    .build();
                        }
                    }
                }
                else { // if object is directory * unmatched
                    switch (fileMode) {
                        case CREATE_NEW -> {
                            return CreateFileResponse.newBuilder()
                                    .setStatus(NtStatus.OBJECT_NAME_COLLISION.intValue())
                                    .build();
                        }
                        case OPEN, OPEN_OR_CREATE, CREATE -> {
                            return CreateFileResponse.newBuilder()
                                    .setStatus(NtStatus.FILE_IS_A_DIRECTORY.intValue())
                                    .build();
                        }
                    }
                }
            }

            /*
            In case OPEN_ALWAYS & CREATE_ALWAYS are successfully opening an existing file,
            STATUS_OBJECT_NAME_COLLISION should be returned instead of STATUS_SUCCESS.
             */
        }

        // if file is not directory, check oplock
        // related with desiredAccess, shareAccess
        if (objectInfo != null && objectInfo.isFile()) {
            if (fileShare.intValue() != 0) {
                var machineId = credentialInfo.getMachineId();
                var acquireResult = oplocksRepository.acquireOplockLockBit(fileName, machineId, fileShare.intValue());

                switch (acquireResult) {
                    case -1 -> {
                        return CreateFileResponse.newBuilder()
                                .setStatus(NtStatus.SHARING_VIOLATION.intValue())
                                .build();
                    }
                    case -2 -> {
                        return CreateFileResponse.newBuilder()
                                .setStatus(NtStatus.ACCESS_DENIED.intValue())
                                .build();
                    }
                }
            }
        }

        // oplocked file is requested, callback to locking client for unlock (closeFile)

        // check createDisposition option
        // - TRUNCATE_EXISTING

        // check PagingIO option

        // check SynchronousIO option

        return CreateFileResponse.newBuilder()
                .setStatus(NtStatus.SUCCESS.intValue())
                .build();
    }

    @Override
    public CloseFileResponse closeFile(CloseFileRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();
        var fileShare = FileShare.maskValueSet(request.getShareAccess());
        var deleteOnClose = requestInfo.getDeleteOnClose();

        // release oplock
        var machineId = credentialInfo.getMachineId();
        var releaseResult = oplocksRepository.releaseOplockLockBit(fileName, machineId, fileShare.intValue());

        if (deleteOnClose) {
            // TODO: delete file
        }

        return CloseFileResponse.newBuilder()
                .setStatus(NtStatus.SUCCESS.intValue())
                .build();
    }

    @Override
    public ReadFileResponse readFile(ReadFileRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();
        var length = request.getLength();
        var offset = request.getOffset();
        // var fileMode = FileMode.fromInt(request.getFileMode());

        // TODO: read from object cache
        var objectInfo = objectsRepository.findObjectByFullPath(fileName);
        if (objectInfo == null) { // unexpected
            return ReadFileResponse.newBuilder()
                    .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue())
                    .build();
        }
        else if (objectInfo.isDirectory()) { // unexpected
            return ReadFileResponse.newBuilder()
                    .setStatus(NtStatus.FILE_IS_A_DIRECTORY.intValue())
                    .build();
        }

        var underlyingPath = objectInfo.getUnderlyingPath();
        // TODO: read from read cache block
        try {
            // TODO: write to ByteString directly
            byte[] readBuffer = new byte[(int)length];

            try (var fileInputStream = new FileInputStream(underlyingPath)) {
                // TODO: get byte block from pool
                var skippedBytes = fileInputStream.skip(offset);
                var readBytes = fileInputStream.read(readBuffer);
            }

           return ReadFileResponse.newBuilder()
                   .setBuffer(ByteString.copyFrom(readBuffer))
                   .setStatus(NtStatus.SUCCESS.intValue())
                   .build();
        }
        catch (FileNotFoundException fnfe) {
            return ReadFileResponse.newBuilder()
                    .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue())
                    .build();
        }
        catch (IOException ioe) {
            return ReadFileResponse.newBuilder()
                    .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue()) // TODO: find correct code
                    .build();
        }
    }

    @Override
    public WriteFileResponse writeFile(WriteFileRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();
        var length = request.getLength();
        var offset = request.getOffset();
        var buffer = request.getBuffer();
        var fileMode = FileMode.fromInt(request.getFileMode());

        // TODO: read from object cache
        var objectInfo = objectsRepository.findObjectByFullPath(fileName);
        if (objectInfo == null) { // unexpected
            return WriteFileResponse.newBuilder()
                    .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue())
                    .build();
        }
        else if (objectInfo.isDirectory()) { // unexpected
            return WriteFileResponse.newBuilder()
                    .setStatus(NtStatus.FILE_IS_A_DIRECTORY.intValue())
                    .build();
        }

        var underlyingPath = objectInfo.getUnderlyingPath();
        try {
            // TODO: check fileMode, for find write offset position and determine that modify file size
            try (var fileOutputStream = new FileOutputStream(underlyingPath)) {
                var fileChannel = fileOutputStream.getChannel();
                fileChannel.position(offset);
                var writtenBytes = fileChannel.write(buffer.asReadOnlyByteBuffer());
            }

            return WriteFileResponse.newBuilder()
                    .setStatus(NtStatus.SUCCESS.intValue())
                    .build();
        }
        catch (FileNotFoundException fnfe) {
            return WriteFileResponse.newBuilder()
                    .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue())
                    .build();
        }
        catch (IOException ioe) {
            return WriteFileResponse.newBuilder()
                    .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue()) // TODO: find correct code
                    .build();
        }
    }

    @Override
    public GetFileInformationResponse getFileInformation(GetFileInformationRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();

        // TODO: read from object cache
        var objectInfo = objectsRepository.findObjectByFullPath(fileName);
        if (objectInfo == null) { // unexpected
            return GetFileInformationResponse.newBuilder()
                    .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue())
                    .build();
        }

        var underlyingPath = objectInfo.getFullPath();
        // TODO: get information from object cache
        try {
            return GetFileInformationResponse.newBuilder()
                    .setFileSize(objectInfo.getFileSize())
                    .setFileAttributes(objectInfo.getFileAttributes())
                    .setFileCreationTime(objectInfo.getFileCreationTime().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli())
                    .setFileLastWriteTime(objectInfo.getFileLastWriteTime().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli())
                    .setFileLastAccessTime(objectInfo.getFileLastAccessTime().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli())
                    .setStatus(NtStatus.SUCCESS.intValue())
                    .build();
        }
        catch (Exception ex) {
            return GetFileInformationResponse.newBuilder()
                    .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue()) // TODO: find correct code
                    .build();
        }
    }

    @Override
    public DeleteFileResponse deleteFile(DeleteFileRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();

        // TODO: read from object cache
        var objectInfo = objectsRepository.findObjectByFullPath(fileName);
        if (objectInfo == null) { // unexpected
            return DeleteFileResponse.newBuilder()
                    .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue())
                    .build();
        }
        if (!objectInfo.isFile()) {
            return DeleteFileResponse.newBuilder()
                    .setStatus(NtStatus.FILE_IS_A_DIRECTORY.intValue())
                    .build();
        }

        objectsRepository.removeObjectByFullPath(fileName);

        // TODO: delete from object cache

        var underlyingPath = Paths.get(objectInfo.getUnderlyingPath());
        try {
            Files.deleteIfExists(underlyingPath);
        }
        catch (IOException ioe) {
            // TODO: delete next time...? use scheduler or service
        }

        return DeleteFileResponse.newBuilder()
                .setStatus(NtStatus.SUCCESS.intValue())
                .build();
    }

    @Override
    public DeleteDirectoryResponse deleteDirectory(DeleteDirectoryRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();

        // TODO: read from object cache
        var objectInfo = objectsRepository.findObjectByFullPath(fileName);
        if (objectInfo == null) { // unexpected
            return DeleteDirectoryResponse.newBuilder()
                    .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue())
                    .build();
        }
        if (!objectInfo.isDirectory()) {
            return DeleteDirectoryResponse.newBuilder()
                    .setStatus(NtStatus.NOT_A_DIRECTORY.intValue())
                    .build();
        }

        // check directory is empty
        var isDirectoryEmpty = objectsRepository.hasChildObjectByFullPath(fileName);
        if (!isDirectoryEmpty) {
            return DeleteDirectoryResponse.newBuilder()
                    .setStatus(NtStatus.DIRECTORY_NOT_EMPTY.intValue())
                    .build();
        }

        objectsRepository.removeObjectByFullPath(fileName);

        // TODO: delete from object cache

        return DeleteDirectoryResponse.newBuilder()
                .setStatus(NtStatus.SUCCESS.intValue())
                .build();
    }

    @Override
    public MoveFileResponse moveFile(MoveFileRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();
        var newFileName = request.getNewFileName();
        var replaceIfExisting = request.getReplaceIfExisting();

        // TODO: read from object cache
        var objectInfo = objectsRepository.findObjectByFullPath(fileName);
        if (objectInfo == null) { // unexpected
            return MoveFileResponse.newBuilder()
                    .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue())
                    .build();
        }
        var newObjectInfo = objectsRepository.findObjectByFullPath(newFileName);
        if (newObjectInfo != null) {
            if (replaceIfExisting) { // only apply that overwrite file to file, directory to directory
                if (objectInfo.isFile() && !newObjectInfo.isFile()) {
                    return MoveFileResponse.newBuilder()
                            .setStatus(NtStatus.FILE_IS_A_DIRECTORY.intValue()) // TODO: find correct code
                            .build();
                }
                else if (objectInfo.isDirectory() && !newObjectInfo.isDirectory()) {
                    return MoveFileResponse.newBuilder()
                            .setStatus(NtStatus.NOT_A_DIRECTORY.intValue()) // TODO: find correct code
                            .build();
                }

                if (newObjectInfo.isDirectory()) { // target directory must empty
                    var targetDirectoryIsEmpty = objectsRepository.hasChildObjectByFullPath(newFileName);
                    if (!targetDirectoryIsEmpty) {
                        return MoveFileResponse.newBuilder()
                                .setStatus(NtStatus.DIRECTORY_NOT_EMPTY.intValue()) // TODO: find correct code
                                .build();
                    }
                }
            }
            else { // target is exists, failure
                return MoveFileResponse.newBuilder()
                        .setStatus(NtStatus.OBJECT_NAME_COLLISION.intValue()) // TODO: find correct code
                        .build();
            }
        }

        objectsRepository.updateObjectFullPathWithReplace(fileName, newFileName);

        // TODO: update path from object cache

        return MoveFileResponse.newBuilder()
                .setStatus(NtStatus.SUCCESS.intValue())
                .build();
    }

    @Override
    public FlushFileBufferResponse flushFileBuffer(FlushFileBufferRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();

        return FlushFileBufferResponse.newBuilder()
                .setStatus(NtStatus.SUCCESS.intValue())
                .build();
    }

    @Override
    public SetAllocationSizeResponse setAllocationSize(SetAllocationSizeRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();

        return SetAllocationSizeResponse.newBuilder()
                .setStatus(NtStatus.SUCCESS.intValue())
                .build();
    }

    @Override
    public SetEndOfFileResponse setEndOfFile(SetEndOfFileRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();

        return SetEndOfFileResponse.newBuilder()
                .setStatus(NtStatus.SUCCESS.intValue())
                .build();
    }

    @Override
    public SetFileAttributesResponse setFileAttributes(SetFileAttributesRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();
        var fileAttributes = request.getFileAttributes();

        return SetFileAttributesResponse.newBuilder()
                .setStatus(NtStatus.SUCCESS.intValue())
                .build();
    }

    @Override
    public LockFileResponse lockFile(LockFileRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();
        var offset = request.getOffset();
        var length = request.getLength();

        return LockFileResponse.newBuilder()
                .setStatus(NtStatus.SUCCESS.intValue())
                .build();
    }

    @Override
    public UnlockFileResponse unlockFile(UnlockFileRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();
        var offset = request.getOffset();
        var length = request.getLength();

        return UnlockFileResponse.newBuilder()
                .setStatus(NtStatus.SUCCESS.intValue())
                .build();
    }
}
