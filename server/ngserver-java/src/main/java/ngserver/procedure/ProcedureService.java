package ngserver.procedure;

import drive_common.drive_storage.NStorage;
import drive_protocol.DriveProcedureGrpc;
import drive_protocol.request.*;
import drive_protocol.response.*;
import io.grpc.Context;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import ngserver.procedure.connection.ConnectionManager;
import ngserver.procedure.connection.ConnectionState;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class ProcedureService extends DriveProcedureGrpc.DriveProcedureImplBase {
    @Autowired
    NStorage storage;
    static final ConnectionManager<PubMessage> connectionManager = new ConnectionManager<PubMessage>();

    @Override
    public StreamObserver<SubMessage> subscribe(StreamObserver<PubMessage> responseObserver) {
        return new StreamObserver<SubMessage>() {
            @Override
            public void onNext(SubMessage value) {
                var command = value.getCommand();
                var machineId = value.getConnection().getMachineId();

                switch (command) {
                    case Handshake -> {
                        var connectionId = ContextVariables.CONNECTION_ID.get(Context.current());
                        var state = new ConnectionState<PubMessage>(connectionId, responseObserver, Context.current());
                        connectionManager.addOrReplace(connectionId, state);

                        PubMessage response = PubMessage.newBuilder()
                                .setCommand(command)
                                .setStatus(0)
                                .build();
                        responseObserver.onNext(response);
                        return;
                    }
                    default -> {
                        var connectionId = ContextVariables.CONNECTION_ID.get(Context.current());
                        var states = connectionManager.getAllExcept(connectionId);
                        if (states.size() > 0) {
                            PubMessage broadcastResponse = PubMessage.newBuilder()
                                    .setCommand(command)
                                    .setStatus(1)
                                    .build();
                            for (var state : states) {
                                if (!state.getContext().isCancelled()) {
                                    state.getStream().onNext(broadcastResponse);
                                }
                            }
                        }

                        PubMessage response = PubMessage.newBuilder()
                                .setCommand(command)
                                .setStatus(0)
                                .build();
                        responseObserver.onNext(response);
                        return;
                    }
                }
            }

            @Override
            public void onError(Throwable t) {
                if (t instanceof StatusException gse) {
                    var code = gse.getStatus().getCode();
                    if (code == Status.Code.CANCELLED) {
                        var connectionId = ContextVariables.CONNECTION_ID.get(Context.current());
                        connectionManager.remove(connectionId);
                    }
                }
                else if (t instanceof StatusRuntimeException gsre) {
                    var code = gsre.getStatus().getCode();
                    if (code == Status.Code.CANCELLED) {
                        var connectionId = ContextVariables.CONNECTION_ID.get(Context.current());
                        connectionManager.remove(connectionId);
                    }
                }
            }

            @Override
            public void onCompleted() {
                var connectionId = ContextVariables.CONNECTION_ID.get(Context.current());
                connectionManager.remove(connectionId);

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
