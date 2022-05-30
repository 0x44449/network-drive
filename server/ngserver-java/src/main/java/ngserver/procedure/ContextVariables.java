package ngserver.procedure;

import io.grpc.Context;

public class ContextVariables {
    public static final Context.Key<String> CONNECTION_ID = Context.key("CONNECTION_ID");
}
