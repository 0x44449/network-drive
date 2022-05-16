package com.ngserver.ServiceImpl;

import drive_protocol.DriveProcedureGrpc;
import drive_protocol.request.*;
import drive_protocol.response.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class DriveProcedureService extends DriveProcedureGrpc.DriveProcedureImplBase {
    @Override
    public void createFile(CreateFileRequest request, StreamObserver<CreateFileResponse> responseObserver) {
        // super.createFile(request, responseObserver);
        CreateFileResponse response = CreateFileResponse.newBuilder()
                .setStatus(0)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void closeFile(CloseFileRequest request, StreamObserver<CloseFileResponse> responseObserver) {
        super.closeFile(request, responseObserver);
    }

    @Override
    public void deleteDirectory(DeleteDirectoryRequest request, StreamObserver<DeleteDirectoryResponse> responseObserver) {
        super.deleteDirectory(request, responseObserver);
    }

    @Override
    public void deleteFile(DeleteFileRequest request, StreamObserver<DeleteFileResponse> responseObserver) {
        super.deleteFile(request, responseObserver);
    }

    @Override
    public void flushFileBuffer(FlushFileBufferRequest request, StreamObserver<FlushFileBufferResponse> responseObserver) {
        super.flushFileBuffer(request, responseObserver);
    }

    @Override
    public void moveFile(MoveFileRequest request, StreamObserver<MoveFileResponse> responseObserver) {
        super.moveFile(request, responseObserver);
    }

    @Override
    public void getFileInformation(GetFileInformationRequest request, StreamObserver<GetFileInformationResponse> responseObserver) {
        super.getFileInformation(request, responseObserver);
    }

    @Override
    public void lockFile(LockFileRequest request, StreamObserver<LockFileResponse> responseObserver) {
        super.lockFile(request, responseObserver);
    }

    @Override
    public void readFile(ReadFileRequest request, StreamObserver<ReadFileResponse> responseObserver) {
        super.readFile(request, responseObserver);
    }

    @Override
    public void setAllocationSize(SetAllocationSizeRequest request, StreamObserver<SetAllocationSizeResponse> responseObserver) {
        super.setAllocationSize(request, responseObserver);
    }

    @Override
    public void setEndOfFile(SetEndOfFileRequest request, StreamObserver<SetEndOfFileResponse> responseObserver) {
        super.setEndOfFile(request, responseObserver);
    }

    @Override
    public void setFileAttributes(SetFileAttributesRequest request, StreamObserver<SetFileAttributesResponse> responseObserver) {
        super.setFileAttributes(request, responseObserver);
    }

    @Override
    public void unlockFile(UnlockFileRequest request, StreamObserver<UnlockFileResponse> responseObserver) {
        super.unlockFile(request, responseObserver);
    }

    @Override
    public void writeFile(WriteFileRequest request, StreamObserver<WriteFileResponse> responseObserver) {
        super.writeFile(request, responseObserver);
    }
}
