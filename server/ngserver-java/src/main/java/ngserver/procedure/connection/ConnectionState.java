package ngserver.procedure.connection;

import io.grpc.Context;
import io.grpc.stub.StreamObserver;

public class ConnectionState<T> {
    private final String connectionId;
    private final StreamObserver<T> stream;
    private final Context context;

    public ConnectionState(String connectionId, StreamObserver<T> stream, Context context) {
        this.connectionId = connectionId;
        this.stream = stream;
        this.context = context;
    }

    public String getConnectionId() {
        return connectionId;
    }

    public StreamObserver<T> getStream() {
        return stream;
    }

    public Context getContext() {
        return context;
    }
}
