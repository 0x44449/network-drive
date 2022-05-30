package ngserver.procedure;

import io.grpc.*;

import java.util.UUID;

public class ContextVariableInterceptor implements ServerInterceptor {
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
        var connectionId = UUID.randomUUID().toString();
        var context = Context.current().withValue(ContextVariables.CONNECTION_ID, connectionId);
        return Contexts.interceptCall(context, call, headers, next);
    }
}
