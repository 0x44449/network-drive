package ngserver.procedure;

import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class InterceptorConfiguration {
    @GrpcGlobalServerInterceptor
    ContextVariableInterceptor getDriveProcedureInterceptor() {
        return new ContextVariableInterceptor();
    }
}
