package com.ngserver.storage.minimal;

import com.ngserver.storage.NStorage;
import drive_protocol.request.*;
import drive_protocol.response.*;
import org.springframework.stereotype.Service;

@Service
public class MinimalStorage implements NStorage {
    @Override
    public CreateFileResponse createFile(CreateFileRequest request) {
        var requestInfo = request.getReq();
        var credentialInfo = request.getCred();

        var fileName = request.getFileName();
        var createDisposition = request.getCreateDisposition();
        var desiredAccess = request.getDesiredAccess();
        var shareAccess = request.getShareAccess();
        var fileAttributes = request.getFileAttributes();
        var createOptions = request.getCreateOptions();

        var isDirectory = requestInfo.getIsDirectory();

        // check file exists

        // check file is directory

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
