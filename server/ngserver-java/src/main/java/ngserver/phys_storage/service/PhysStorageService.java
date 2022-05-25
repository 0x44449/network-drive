package ngserver.phys_storage.service;

import drive_common.dokan_port.constants.microsoft.*;
import drive_common.drive_storage.NStorage;
import drive_protocol.request.*;
import drive_protocol.response.*;
import ngserver.phys_storage.repository.ObjectsRepository;
import ngserver.phys_storage.repository.OplocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        var objectEntities = objectsRepository.findObjectByFullPath(fileName);
        var objectInfo = objectEntities.size() > 0 ? objectEntities.get(0) : null;

        /*
        If the file is a directory, CreateFile is also called.
        In this case, CreateFile should return STATUS_SUCCESS when that directory can be opened and DOKAN_FILE_INFO.IsDirectory has to be set to TRUE.
        On the other hand, if DOKAN_FILE_INFO.IsDirectory is set to TRUE but the path targets a file, STATUS_NOT_A_DIRECTORY must be returned.
         */
        if (isDirectory) {
            if (objectInfo == null) {
                if (fileMode == FileMode.OPEN) {
                    return CreateFileResponse.newBuilder()
                            .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue())
                            .build();
                }
            }
            else {
                if (objectInfo.isFile()) {
                    if (fileMode == FileMode.OPEN_OR_CREATE || fileMode == FileMode.OPEN || fileMode == FileMode.CREATE) {
                        return CreateFileResponse.newBuilder()
                                .setStatus(NtStatus.NOT_A_DIRECTORY.intValue())
                                .build();
                    }
                }
                else {
                    if (fileMode == FileMode.CREATE_NEW) {
                        return CreateFileResponse.newBuilder()
                                .setStatus(NtStatus.OBJECT_NAME_COLLISION.intValue())
                                .build();
                    }
                }
            }
        }
        else {
            // check file exists with FileMode
            if (objectInfo == null) {
                if (fileMode == FileMode.OPEN || fileMode == FileMode.TRUNCATE) {
                    return CreateFileResponse.newBuilder()
                            .setStatus(NtStatus.OBJECT_NAME_NOT_FOUND.intValue())
                            .build();
                }
            }
            else {
                if (objectInfo.isFile()) {
                    if (fileMode == FileMode.OPEN || fileMode == FileMode.CREATE_NEW) {
                        return CreateFileResponse.newBuilder()
                                .setStatus(NtStatus.OBJECT_NAME_COLLISION.intValue())
                                .build();
                    }
                }
                else {
                    if (fileMode == FileMode.CREATE_NEW) {
                        return CreateFileResponse.newBuilder()
                                .setStatus(NtStatus.OBJECT_NAME_COLLISION.intValue())
                                .build();
                    }
                    else if (fileMode == FileMode.OPEN || fileMode == FileMode.OPEN_OR_CREATE || fileMode == FileMode.CREATE) {
                        return CreateFileResponse.newBuilder()
                                .setStatus(NtStatus.FILE_IS_A_DIRECTORY.intValue())
                                .build();
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
            var oplockEntities = oplocksRepository.findOplockByFullPath(fileName);
            var oplockInfo = oplockEntities.size() > 0 ? oplockEntities.get(0) : null;

            if (oplockInfo != null) {
                var lockBit = oplockInfo.getLockBit();

                /*if (fileShare.contains(FileShare.WRITE)) {
                    if (lockBit.contains("W") || lockBit.contains("D")) {

                    }
                }*/
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
        var deleteOnClose = requestInfo.getDeleteOnClose();

        // release oplock

        return CloseFileResponse.newBuilder()
                .setStatus(0)
                .build();
    }

    @Override
    public ReadFileResponse readFile(ReadFileRequest request) {
        return ReadFileResponse.newBuilder()
                .setStatus(0)
                .build();
    }

    @Override
    public WriteFileResponse writeFile(WriteFileRequest request) {
        return WriteFileResponse.newBuilder()
                .setStatus(0)
                .build();
    }

    @Override
    public GetFileInformationResponse getFileInformation(GetFileInformationRequest request) {
        return GetFileInformationResponse.newBuilder()
                .setStatus(0)
                .build();
    }

    @Override
    public DeleteFileResponse deleteFile(DeleteFileRequest request) {
        return DeleteFileResponse.newBuilder()
                .setStatus(0)
                .build();
    }

    @Override
    public DeleteDirectoryResponse deleteDirectory(DeleteDirectoryRequest request) {
        return DeleteDirectoryResponse.newBuilder()
                .setStatus(0)
                .build();
    }

    @Override
    public MoveFileResponse moveFile(MoveFileRequest request) {
        return MoveFileResponse.newBuilder()
                .setStatus(0)
                .build();
    }

    @Override
    public FlushFileBufferResponse flushFileBuffer(FlushFileBufferRequest request) {
        return FlushFileBufferResponse.newBuilder()
                .setStatus(0)
                .build();
    }

    @Override
    public SetAllocationSizeResponse setAllocationSize(SetAllocationSizeRequest request) {
        return SetAllocationSizeResponse.newBuilder()
                .setStatus(0)
                .build();
    }

    @Override
    public SetEndOfFileResponse setEndOfFile(SetEndOfFileRequest request) {
        return SetEndOfFileResponse.newBuilder()
                .setStatus(0)
                .build();
    }

    @Override
    public SetFileAttributesResponse setFileAttributes(SetFileAttributesRequest request) {
        return SetFileAttributesResponse.newBuilder()
                .setStatus(0)
                .build();
    }

    @Override
    public LockFileResponse lockFile(LockFileRequest request) {
        return LockFileResponse.newBuilder()
                .setStatus(0)
                .build();
    }

    @Override
    public UnlockFileResponse unlockFile(UnlockFileRequest request) {
        return UnlockFileResponse.newBuilder()
                .setStatus(0)
                .build();
    }
}
