package ngserver;

import drive_protocol.DriveProcedureGrpc;
import drive_protocol.request.*;
import drive_protocol.response.*;
import drive_common.drive_storage.NStorage;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiConsumer;

@GrpcService
public class DriveProcedureService extends DriveProcedureGrpc.DriveProcedureImplBase {
    @Autowired
    NStorage storage;

    final Map<String, StreamObserver<PubMessage>> connectionMap = new HashMap<String, StreamObserver<PubMessage>>();
    final ReentrantReadWriteLock connectionLock = new ReentrantReadWriteLock();
    final Lock connectionReadLock = connectionLock.readLock();
    final Lock connectionWriteLock = connectionLock.writeLock();

    @Override
    public StreamObserver<SubMessage> subscribe(StreamObserver<PubMessage> responseObserver) {
        return new StreamObserver<SubMessage>() {
            @Override
            public void onNext(SubMessage value) {
                var command = value.getCommand();
                var machineId = value.getCred().getMachineId();

                if (command == SubMessage.Command.Handshake) {
                    connectionWriteLock.lock();
                    try {
                        if (!connectionMap.containsKey(machineId)) {
                            connectionMap.put(machineId, responseObserver);
                        }
                    }
                    finally {
                        connectionWriteLock.unlock();
                    }

                    PubMessage response = PubMessage.newBuilder()
                            .setCommand(PubMessage.Command.Handshake)
                            .build();
                    responseObserver.onNext(response);
                    return;
                }

                var otherResponses = new ArrayList<StreamObserver<PubMessage>>();
                connectionReadLock.lock();
                try {
                    connectionMap.forEach((kMachineId, vResponse) -> {
                        if (!machineId.equals(kMachineId)) {
                            otherResponses.add(vResponse);
                        }
                    });
                }
                finally {
                    connectionReadLock.unlock();
                }

                if (otherResponses.size() > 0) {
                    PubMessage broadcastResponse = PubMessage.newBuilder()
                            .setCommand(PubMessage.Command.Test)
                            .build();
                    for (var otherResponse : otherResponses) {
                        otherResponse.onNext(broadcastResponse);
                    }
                }
                PubMessage response = PubMessage.newBuilder()
                        .setCommand(PubMessage.Command.Test)
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void createFile(CreateFileRequest request, StreamObserver<CreateFileResponse> responseObserver) {
        CreateFileResponse response = storage.createFile(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void closeFile(CloseFileRequest request, StreamObserver<CloseFileResponse> responseObserver) {
        CloseFileResponse response = storage.closeFile(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteDirectory(DeleteDirectoryRequest request, StreamObserver<DeleteDirectoryResponse> responseObserver) {
        DeleteDirectoryResponse response = storage.deleteDirectory(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteFile(DeleteFileRequest request, StreamObserver<DeleteFileResponse> responseObserver) {
        DeleteFileResponse response = storage.deleteFile(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void flushFileBuffer(FlushFileBufferRequest request, StreamObserver<FlushFileBufferResponse> responseObserver) {
        FlushFileBufferResponse response = storage.flushFileBuffer(request);
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
        GetFileInformationResponse response = storage.getFileInformation(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void lockFile(LockFileRequest request, StreamObserver<LockFileResponse> responseObserver) {
        LockFileResponse response = storage.lockFile(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void readFile(ReadFileRequest request, StreamObserver<ReadFileResponse> responseObserver) {
        ReadFileResponse response = storage.readFile(request);
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
        SetEndOfFileResponse response = storage.setEndOfFile(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setFileAttributes(SetFileAttributesRequest request, StreamObserver<SetFileAttributesResponse> responseObserver) {
        SetFileAttributesResponse response = storage.setFileAttributes(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void unlockFile(UnlockFileRequest request, StreamObserver<UnlockFileResponse> responseObserver) {
        UnlockFileResponse response = storage.unlockFile(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void writeFile(WriteFileRequest request, StreamObserver<WriteFileResponse> responseObserver) {
        WriteFileResponse response = storage.writeFile(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
