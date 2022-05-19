package com.ngserver;

import com.ngserver.storage.NStorage;
import drive_protocol.DriveProcedureGrpc;
import drive_protocol.request.*;
import drive_protocol.response.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class DriveProcedureService extends DriveProcedureGrpc.DriveProcedureImplBase {
    @Autowired
    NStorage storage;

    @Override
    public void createFile(CreateFileRequest request, StreamObserver<CreateFileResponse> responseObserver) {
        var response = storage.createFile(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void closeFile(CloseFileRequest request, StreamObserver<CloseFileResponse> responseObserver) {
        CloseFileResponse response = CloseFileResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteDirectory(DeleteDirectoryRequest request, StreamObserver<DeleteDirectoryResponse> responseObserver) {
        DeleteDirectoryResponse response = DeleteDirectoryResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteFile(DeleteFileRequest request, StreamObserver<DeleteFileResponse> responseObserver) {
        DeleteFileResponse response = DeleteFileResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void flushFileBuffer(FlushFileBufferRequest request, StreamObserver<FlushFileBufferResponse> responseObserver) {
        FlushFileBufferResponse response = FlushFileBufferResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void moveFile(MoveFileRequest request, StreamObserver<MoveFileResponse> responseObserver) {
        MoveFileResponse response = MoveFileResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getFileInformation(GetFileInformationRequest request, StreamObserver<GetFileInformationResponse> responseObserver) {
        GetFileInformationResponse response = GetFileInformationResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void lockFile(LockFileRequest request, StreamObserver<LockFileResponse> responseObserver) {
        LockFileResponse response = LockFileResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void readFile(ReadFileRequest request, StreamObserver<ReadFileResponse> responseObserver) {
        ReadFileResponse response = ReadFileResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setAllocationSize(SetAllocationSizeRequest request, StreamObserver<SetAllocationSizeResponse> responseObserver) {
        SetAllocationSizeResponse response = SetAllocationSizeResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setEndOfFile(SetEndOfFileRequest request, StreamObserver<SetEndOfFileResponse> responseObserver) {
        SetEndOfFileResponse response = SetEndOfFileResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setFileAttributes(SetFileAttributesRequest request, StreamObserver<SetFileAttributesResponse> responseObserver) {
        SetFileAttributesResponse response = SetFileAttributesResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void unlockFile(UnlockFileRequest request, StreamObserver<UnlockFileResponse> responseObserver) {
        UnlockFileResponse response = UnlockFileResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void writeFile(WriteFileRequest request, StreamObserver<WriteFileResponse> responseObserver) {
        WriteFileResponse response = WriteFileResponse.newBuilder()
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
