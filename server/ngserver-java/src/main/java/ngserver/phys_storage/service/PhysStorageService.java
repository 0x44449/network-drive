package ngserver.phys_storage.service;

import drive_common.dokan_port.constants.microsoft.*;
import drive_common.drive_storage.NStorage;
import drive_protocol.request.*;
import drive_protocol.response.*;
import ngserver.phys_storage.repository.PhysStorageRepository;
import org.springframework.stereotype.Service;

@Service
public class PhysStorageService implements NStorage {
    PhysStorageRepository repository = new PhysStorageRepository();

    @Override
    public CreateFileResponse createFile(CreateFileRequest request) {
        // https://docs.microsoft.com/en-us/windows-hardware/drivers/ddi/ntifs/nf-ntifs-ntcreatefile
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();
        var createDisposition = CreateDisposition.fromInt((int)request.getCreateDisposition());
        var desiredAccess = request.getDesiredAccess();
        var shareAccess = request.getShareAccess();
        var fileAttributes = FileAttribute.maskValueSet((int)request.getFileAttributes());
        var createOptions = CreateOption.maskValueSet((int)request.getCreateOptions());
        var isDirectory = requestInfo.getIsDirectory();

        // check file exists

        // check file is directory
        /*
        If the file is a directory, CreateFile is also called.
        In this case, CreateFile should return STATUS_SUCCESS when that directory can be opened and DOKAN_FILE_INFO.IsDirectory has to be set to TRUE.
        On the other hand, if DOKAN_FILE_INFO.IsDirectory is set to TRUE but the path targets a file, STATUS_NOT_A_DIRECTORY must be returned.
         */

        /*
        In case OPEN_ALWAYS & CREATE_ALWAYS are successfully opening an existing file,
        STATUS_OBJECT_NAME_COLLISION should be returned instead of STATUS_SUCCESS.
         */

        // if file is not directory, check oplock
        // related with desiredAccess, shareAccess

        // oplocked file is requested, callback to locking client for unlock (closeFile)

        // check createDisposition option
        // - TRUNCATE_EXISTING

        // check PagingIO option

        // check SynchronousIO option

        return CreateFileResponse.newBuilder()
                .setStatus(0)
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
