package drive_protocol;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0)",
    comments = "Source: DriveProcedure.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DriveProcedureGrpc {

  private DriveProcedureGrpc() {}

  public static final String SERVICE_NAME = "drive_protocol.DriveProcedure";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.CreateFileRequest,
      drive_protocol.response.CreateFileResponse> getCreateFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFile",
      requestType = drive_protocol.request.CreateFileRequest.class,
      responseType = drive_protocol.response.CreateFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.CreateFileRequest,
      drive_protocol.response.CreateFileResponse> getCreateFileMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.CreateFileRequest, drive_protocol.response.CreateFileResponse> getCreateFileMethod;
    if ((getCreateFileMethod = DriveProcedureGrpc.getCreateFileMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getCreateFileMethod = DriveProcedureGrpc.getCreateFileMethod) == null) {
          DriveProcedureGrpc.getCreateFileMethod = getCreateFileMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.CreateFileRequest, drive_protocol.response.CreateFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.CreateFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.CreateFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("CreateFile"))
              .build();
        }
      }
    }
    return getCreateFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.CloseFileRequest,
      drive_protocol.response.CloseFileResponse> getCloseFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseFile",
      requestType = drive_protocol.request.CloseFileRequest.class,
      responseType = drive_protocol.response.CloseFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.CloseFileRequest,
      drive_protocol.response.CloseFileResponse> getCloseFileMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.CloseFileRequest, drive_protocol.response.CloseFileResponse> getCloseFileMethod;
    if ((getCloseFileMethod = DriveProcedureGrpc.getCloseFileMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getCloseFileMethod = DriveProcedureGrpc.getCloseFileMethod) == null) {
          DriveProcedureGrpc.getCloseFileMethod = getCloseFileMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.CloseFileRequest, drive_protocol.response.CloseFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.CloseFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.CloseFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("CloseFile"))
              .build();
        }
      }
    }
    return getCloseFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.ReadFileRequest,
      drive_protocol.response.ReadFileResponse> getReadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadFile",
      requestType = drive_protocol.request.ReadFileRequest.class,
      responseType = drive_protocol.response.ReadFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.ReadFileRequest,
      drive_protocol.response.ReadFileResponse> getReadFileMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.ReadFileRequest, drive_protocol.response.ReadFileResponse> getReadFileMethod;
    if ((getReadFileMethod = DriveProcedureGrpc.getReadFileMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getReadFileMethod = DriveProcedureGrpc.getReadFileMethod) == null) {
          DriveProcedureGrpc.getReadFileMethod = getReadFileMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.ReadFileRequest, drive_protocol.response.ReadFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.ReadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.ReadFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("ReadFile"))
              .build();
        }
      }
    }
    return getReadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.WriteFileRequest,
      drive_protocol.response.WriteFileResponse> getWriteFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteFile",
      requestType = drive_protocol.request.WriteFileRequest.class,
      responseType = drive_protocol.response.WriteFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.WriteFileRequest,
      drive_protocol.response.WriteFileResponse> getWriteFileMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.WriteFileRequest, drive_protocol.response.WriteFileResponse> getWriteFileMethod;
    if ((getWriteFileMethod = DriveProcedureGrpc.getWriteFileMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getWriteFileMethod = DriveProcedureGrpc.getWriteFileMethod) == null) {
          DriveProcedureGrpc.getWriteFileMethod = getWriteFileMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.WriteFileRequest, drive_protocol.response.WriteFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.WriteFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.WriteFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("WriteFile"))
              .build();
        }
      }
    }
    return getWriteFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.FlushFileBufferRequest,
      drive_protocol.response.FlushFileBufferResponse> getFlushFileBufferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FlushFileBuffer",
      requestType = drive_protocol.request.FlushFileBufferRequest.class,
      responseType = drive_protocol.response.FlushFileBufferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.FlushFileBufferRequest,
      drive_protocol.response.FlushFileBufferResponse> getFlushFileBufferMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.FlushFileBufferRequest, drive_protocol.response.FlushFileBufferResponse> getFlushFileBufferMethod;
    if ((getFlushFileBufferMethod = DriveProcedureGrpc.getFlushFileBufferMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getFlushFileBufferMethod = DriveProcedureGrpc.getFlushFileBufferMethod) == null) {
          DriveProcedureGrpc.getFlushFileBufferMethod = getFlushFileBufferMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.FlushFileBufferRequest, drive_protocol.response.FlushFileBufferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FlushFileBuffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.FlushFileBufferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.FlushFileBufferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("FlushFileBuffer"))
              .build();
        }
      }
    }
    return getFlushFileBufferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.GetFileInformationRequest,
      drive_protocol.response.GetFileInformationResponse> getGetFileInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFileInformation",
      requestType = drive_protocol.request.GetFileInformationRequest.class,
      responseType = drive_protocol.response.GetFileInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.GetFileInformationRequest,
      drive_protocol.response.GetFileInformationResponse> getGetFileInformationMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.GetFileInformationRequest, drive_protocol.response.GetFileInformationResponse> getGetFileInformationMethod;
    if ((getGetFileInformationMethod = DriveProcedureGrpc.getGetFileInformationMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getGetFileInformationMethod = DriveProcedureGrpc.getGetFileInformationMethod) == null) {
          DriveProcedureGrpc.getGetFileInformationMethod = getGetFileInformationMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.GetFileInformationRequest, drive_protocol.response.GetFileInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFileInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.GetFileInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.GetFileInformationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("GetFileInformation"))
              .build();
        }
      }
    }
    return getGetFileInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.DeleteFileRequest,
      drive_protocol.response.DeleteFileResponse> getDeleteFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFile",
      requestType = drive_protocol.request.DeleteFileRequest.class,
      responseType = drive_protocol.response.DeleteFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.DeleteFileRequest,
      drive_protocol.response.DeleteFileResponse> getDeleteFileMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.DeleteFileRequest, drive_protocol.response.DeleteFileResponse> getDeleteFileMethod;
    if ((getDeleteFileMethod = DriveProcedureGrpc.getDeleteFileMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getDeleteFileMethod = DriveProcedureGrpc.getDeleteFileMethod) == null) {
          DriveProcedureGrpc.getDeleteFileMethod = getDeleteFileMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.DeleteFileRequest, drive_protocol.response.DeleteFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.DeleteFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.DeleteFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("DeleteFile"))
              .build();
        }
      }
    }
    return getDeleteFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.DeleteDirectoryRequest,
      drive_protocol.response.DeleteDirectoryResponse> getDeleteDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDirectory",
      requestType = drive_protocol.request.DeleteDirectoryRequest.class,
      responseType = drive_protocol.response.DeleteDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.DeleteDirectoryRequest,
      drive_protocol.response.DeleteDirectoryResponse> getDeleteDirectoryMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.DeleteDirectoryRequest, drive_protocol.response.DeleteDirectoryResponse> getDeleteDirectoryMethod;
    if ((getDeleteDirectoryMethod = DriveProcedureGrpc.getDeleteDirectoryMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getDeleteDirectoryMethod = DriveProcedureGrpc.getDeleteDirectoryMethod) == null) {
          DriveProcedureGrpc.getDeleteDirectoryMethod = getDeleteDirectoryMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.DeleteDirectoryRequest, drive_protocol.response.DeleteDirectoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.DeleteDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.DeleteDirectoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("DeleteDirectory"))
              .build();
        }
      }
    }
    return getDeleteDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.MoveFileRequest,
      drive_protocol.response.MoveFileResponse> getMoveFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveFile",
      requestType = drive_protocol.request.MoveFileRequest.class,
      responseType = drive_protocol.response.MoveFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.MoveFileRequest,
      drive_protocol.response.MoveFileResponse> getMoveFileMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.MoveFileRequest, drive_protocol.response.MoveFileResponse> getMoveFileMethod;
    if ((getMoveFileMethod = DriveProcedureGrpc.getMoveFileMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getMoveFileMethod = DriveProcedureGrpc.getMoveFileMethod) == null) {
          DriveProcedureGrpc.getMoveFileMethod = getMoveFileMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.MoveFileRequest, drive_protocol.response.MoveFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.MoveFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.MoveFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("MoveFile"))
              .build();
        }
      }
    }
    return getMoveFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.LockFileRequest,
      drive_protocol.response.LockFileResponse> getLockFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LockFile",
      requestType = drive_protocol.request.LockFileRequest.class,
      responseType = drive_protocol.response.LockFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.LockFileRequest,
      drive_protocol.response.LockFileResponse> getLockFileMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.LockFileRequest, drive_protocol.response.LockFileResponse> getLockFileMethod;
    if ((getLockFileMethod = DriveProcedureGrpc.getLockFileMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getLockFileMethod = DriveProcedureGrpc.getLockFileMethod) == null) {
          DriveProcedureGrpc.getLockFileMethod = getLockFileMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.LockFileRequest, drive_protocol.response.LockFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LockFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.LockFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.LockFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("LockFile"))
              .build();
        }
      }
    }
    return getLockFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.SetEndOfFileRequest,
      drive_protocol.response.SetEndOfFileResponse> getSetEndOfFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetEndOfFile",
      requestType = drive_protocol.request.SetEndOfFileRequest.class,
      responseType = drive_protocol.response.SetEndOfFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.SetEndOfFileRequest,
      drive_protocol.response.SetEndOfFileResponse> getSetEndOfFileMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.SetEndOfFileRequest, drive_protocol.response.SetEndOfFileResponse> getSetEndOfFileMethod;
    if ((getSetEndOfFileMethod = DriveProcedureGrpc.getSetEndOfFileMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getSetEndOfFileMethod = DriveProcedureGrpc.getSetEndOfFileMethod) == null) {
          DriveProcedureGrpc.getSetEndOfFileMethod = getSetEndOfFileMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.SetEndOfFileRequest, drive_protocol.response.SetEndOfFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetEndOfFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.SetEndOfFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.SetEndOfFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("SetEndOfFile"))
              .build();
        }
      }
    }
    return getSetEndOfFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.SetAllocationSizeRequest,
      drive_protocol.response.SetAllocationSizeResponse> getSetAllocationSizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAllocationSize",
      requestType = drive_protocol.request.SetAllocationSizeRequest.class,
      responseType = drive_protocol.response.SetAllocationSizeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.SetAllocationSizeRequest,
      drive_protocol.response.SetAllocationSizeResponse> getSetAllocationSizeMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.SetAllocationSizeRequest, drive_protocol.response.SetAllocationSizeResponse> getSetAllocationSizeMethod;
    if ((getSetAllocationSizeMethod = DriveProcedureGrpc.getSetAllocationSizeMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getSetAllocationSizeMethod = DriveProcedureGrpc.getSetAllocationSizeMethod) == null) {
          DriveProcedureGrpc.getSetAllocationSizeMethod = getSetAllocationSizeMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.SetAllocationSizeRequest, drive_protocol.response.SetAllocationSizeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAllocationSize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.SetAllocationSizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.SetAllocationSizeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("SetAllocationSize"))
              .build();
        }
      }
    }
    return getSetAllocationSizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.SetFileAttributesRequest,
      drive_protocol.response.SetFileAttributesResponse> getSetFileAttributesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetFileAttributes",
      requestType = drive_protocol.request.SetFileAttributesRequest.class,
      responseType = drive_protocol.response.SetFileAttributesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.SetFileAttributesRequest,
      drive_protocol.response.SetFileAttributesResponse> getSetFileAttributesMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.SetFileAttributesRequest, drive_protocol.response.SetFileAttributesResponse> getSetFileAttributesMethod;
    if ((getSetFileAttributesMethod = DriveProcedureGrpc.getSetFileAttributesMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getSetFileAttributesMethod = DriveProcedureGrpc.getSetFileAttributesMethod) == null) {
          DriveProcedureGrpc.getSetFileAttributesMethod = getSetFileAttributesMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.SetFileAttributesRequest, drive_protocol.response.SetFileAttributesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetFileAttributes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.SetFileAttributesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.SetFileAttributesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("SetFileAttributes"))
              .build();
        }
      }
    }
    return getSetFileAttributesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.UnlockFileRequest,
      drive_protocol.response.UnlockFileResponse> getUnlockFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnlockFile",
      requestType = drive_protocol.request.UnlockFileRequest.class,
      responseType = drive_protocol.response.UnlockFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<drive_protocol.request.UnlockFileRequest,
      drive_protocol.response.UnlockFileResponse> getUnlockFileMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.UnlockFileRequest, drive_protocol.response.UnlockFileResponse> getUnlockFileMethod;
    if ((getUnlockFileMethod = DriveProcedureGrpc.getUnlockFileMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getUnlockFileMethod = DriveProcedureGrpc.getUnlockFileMethod) == null) {
          DriveProcedureGrpc.getUnlockFileMethod = getUnlockFileMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.UnlockFileRequest, drive_protocol.response.UnlockFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnlockFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.UnlockFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.UnlockFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("UnlockFile"))
              .build();
        }
      }
    }
    return getUnlockFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<drive_protocol.request.SubMessage,
      drive_protocol.response.PubMessage> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = drive_protocol.request.SubMessage.class,
      responseType = drive_protocol.response.PubMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<drive_protocol.request.SubMessage,
      drive_protocol.response.PubMessage> getSubscribeMethod() {
    io.grpc.MethodDescriptor<drive_protocol.request.SubMessage, drive_protocol.response.PubMessage> getSubscribeMethod;
    if ((getSubscribeMethod = DriveProcedureGrpc.getSubscribeMethod) == null) {
      synchronized (DriveProcedureGrpc.class) {
        if ((getSubscribeMethod = DriveProcedureGrpc.getSubscribeMethod) == null) {
          DriveProcedureGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<drive_protocol.request.SubMessage, drive_protocol.response.PubMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.request.SubMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  drive_protocol.response.PubMessage.getDefaultInstance()))
              .setSchemaDescriptor(new DriveProcedureMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DriveProcedureStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriveProcedureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriveProcedureStub>() {
        @java.lang.Override
        public DriveProcedureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriveProcedureStub(channel, callOptions);
        }
      };
    return DriveProcedureStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DriveProcedureBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriveProcedureBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriveProcedureBlockingStub>() {
        @java.lang.Override
        public DriveProcedureBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriveProcedureBlockingStub(channel, callOptions);
        }
      };
    return DriveProcedureBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DriveProcedureFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DriveProcedureFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DriveProcedureFutureStub>() {
        @java.lang.Override
        public DriveProcedureFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DriveProcedureFutureStub(channel, callOptions);
        }
      };
    return DriveProcedureFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DriveProcedureImplBase implements io.grpc.BindableService {

    /**
     */
    public void createFile(drive_protocol.request.CreateFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.CreateFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFileMethod(), responseObserver);
    }

    /**
     */
    public void closeFile(drive_protocol.request.CloseFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.CloseFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseFileMethod(), responseObserver);
    }

    /**
     */
    public void readFile(drive_protocol.request.ReadFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.ReadFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadFileMethod(), responseObserver);
    }

    /**
     */
    public void writeFile(drive_protocol.request.WriteFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.WriteFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteFileMethod(), responseObserver);
    }

    /**
     */
    public void flushFileBuffer(drive_protocol.request.FlushFileBufferRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.FlushFileBufferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFlushFileBufferMethod(), responseObserver);
    }

    /**
     */
    public void getFileInformation(drive_protocol.request.GetFileInformationRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.GetFileInformationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFileInformationMethod(), responseObserver);
    }

    /**
     */
    public void deleteFile(drive_protocol.request.DeleteFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.DeleteFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFileMethod(), responseObserver);
    }

    /**
     */
    public void deleteDirectory(drive_protocol.request.DeleteDirectoryRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.DeleteDirectoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDirectoryMethod(), responseObserver);
    }

    /**
     */
    public void moveFile(drive_protocol.request.MoveFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.MoveFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveFileMethod(), responseObserver);
    }

    /**
     */
    public void lockFile(drive_protocol.request.LockFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.LockFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockFileMethod(), responseObserver);
    }

    /**
     */
    public void setEndOfFile(drive_protocol.request.SetEndOfFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.SetEndOfFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetEndOfFileMethod(), responseObserver);
    }

    /**
     */
    public void setAllocationSize(drive_protocol.request.SetAllocationSizeRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.SetAllocationSizeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAllocationSizeMethod(), responseObserver);
    }

    /**
     */
    public void setFileAttributes(drive_protocol.request.SetFileAttributesRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.SetFileAttributesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetFileAttributesMethod(), responseObserver);
    }

    /**
     */
    public void unlockFile(drive_protocol.request.UnlockFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.UnlockFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnlockFileMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<drive_protocol.request.SubMessage> subscribe(
        io.grpc.stub.StreamObserver<drive_protocol.response.PubMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSubscribeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.CreateFileRequest,
                drive_protocol.response.CreateFileResponse>(
                  this, METHODID_CREATE_FILE)))
          .addMethod(
            getCloseFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.CloseFileRequest,
                drive_protocol.response.CloseFileResponse>(
                  this, METHODID_CLOSE_FILE)))
          .addMethod(
            getReadFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.ReadFileRequest,
                drive_protocol.response.ReadFileResponse>(
                  this, METHODID_READ_FILE)))
          .addMethod(
            getWriteFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.WriteFileRequest,
                drive_protocol.response.WriteFileResponse>(
                  this, METHODID_WRITE_FILE)))
          .addMethod(
            getFlushFileBufferMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.FlushFileBufferRequest,
                drive_protocol.response.FlushFileBufferResponse>(
                  this, METHODID_FLUSH_FILE_BUFFER)))
          .addMethod(
            getGetFileInformationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.GetFileInformationRequest,
                drive_protocol.response.GetFileInformationResponse>(
                  this, METHODID_GET_FILE_INFORMATION)))
          .addMethod(
            getDeleteFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.DeleteFileRequest,
                drive_protocol.response.DeleteFileResponse>(
                  this, METHODID_DELETE_FILE)))
          .addMethod(
            getDeleteDirectoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.DeleteDirectoryRequest,
                drive_protocol.response.DeleteDirectoryResponse>(
                  this, METHODID_DELETE_DIRECTORY)))
          .addMethod(
            getMoveFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.MoveFileRequest,
                drive_protocol.response.MoveFileResponse>(
                  this, METHODID_MOVE_FILE)))
          .addMethod(
            getLockFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.LockFileRequest,
                drive_protocol.response.LockFileResponse>(
                  this, METHODID_LOCK_FILE)))
          .addMethod(
            getSetEndOfFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.SetEndOfFileRequest,
                drive_protocol.response.SetEndOfFileResponse>(
                  this, METHODID_SET_END_OF_FILE)))
          .addMethod(
            getSetAllocationSizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.SetAllocationSizeRequest,
                drive_protocol.response.SetAllocationSizeResponse>(
                  this, METHODID_SET_ALLOCATION_SIZE)))
          .addMethod(
            getSetFileAttributesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.SetFileAttributesRequest,
                drive_protocol.response.SetFileAttributesResponse>(
                  this, METHODID_SET_FILE_ATTRIBUTES)))
          .addMethod(
            getUnlockFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                drive_protocol.request.UnlockFileRequest,
                drive_protocol.response.UnlockFileResponse>(
                  this, METHODID_UNLOCK_FILE)))
          .addMethod(
            getSubscribeMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                drive_protocol.request.SubMessage,
                drive_protocol.response.PubMessage>(
                  this, METHODID_SUBSCRIBE)))
          .build();
    }
  }

  /**
   */
  public static final class DriveProcedureStub extends io.grpc.stub.AbstractAsyncStub<DriveProcedureStub> {
    private DriveProcedureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriveProcedureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriveProcedureStub(channel, callOptions);
    }

    /**
     */
    public void createFile(drive_protocol.request.CreateFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.CreateFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void closeFile(drive_protocol.request.CloseFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.CloseFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readFile(drive_protocol.request.ReadFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.ReadFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void writeFile(drive_protocol.request.WriteFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.WriteFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void flushFileBuffer(drive_protocol.request.FlushFileBufferRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.FlushFileBufferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFlushFileBufferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFileInformation(drive_protocol.request.GetFileInformationRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.GetFileInformationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFileInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFile(drive_protocol.request.DeleteFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.DeleteFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDirectory(drive_protocol.request.DeleteDirectoryRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.DeleteDirectoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDirectoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void moveFile(drive_protocol.request.MoveFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.MoveFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lockFile(drive_protocol.request.LockFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.LockFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setEndOfFile(drive_protocol.request.SetEndOfFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.SetEndOfFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetEndOfFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setAllocationSize(drive_protocol.request.SetAllocationSizeRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.SetAllocationSizeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAllocationSizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setFileAttributes(drive_protocol.request.SetFileAttributesRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.SetFileAttributesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetFileAttributesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unlockFile(drive_protocol.request.UnlockFileRequest request,
        io.grpc.stub.StreamObserver<drive_protocol.response.UnlockFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnlockFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<drive_protocol.request.SubMessage> subscribe(
        io.grpc.stub.StreamObserver<drive_protocol.response.PubMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class DriveProcedureBlockingStub extends io.grpc.stub.AbstractBlockingStub<DriveProcedureBlockingStub> {
    private DriveProcedureBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriveProcedureBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriveProcedureBlockingStub(channel, callOptions);
    }

    /**
     */
    public drive_protocol.response.CreateFileResponse createFile(drive_protocol.request.CreateFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public drive_protocol.response.CloseFileResponse closeFile(drive_protocol.request.CloseFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public drive_protocol.response.ReadFileResponse readFile(drive_protocol.request.ReadFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public drive_protocol.response.WriteFileResponse writeFile(drive_protocol.request.WriteFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public drive_protocol.response.FlushFileBufferResponse flushFileBuffer(drive_protocol.request.FlushFileBufferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFlushFileBufferMethod(), getCallOptions(), request);
    }

    /**
     */
    public drive_protocol.response.GetFileInformationResponse getFileInformation(drive_protocol.request.GetFileInformationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFileInformationMethod(), getCallOptions(), request);
    }

    /**
     */
    public drive_protocol.response.DeleteFileResponse deleteFile(drive_protocol.request.DeleteFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public drive_protocol.response.DeleteDirectoryResponse deleteDirectory(drive_protocol.request.DeleteDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDirectoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public drive_protocol.response.MoveFileResponse moveFile(drive_protocol.request.MoveFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public drive_protocol.response.LockFileResponse lockFile(drive_protocol.request.LockFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public drive_protocol.response.SetEndOfFileResponse setEndOfFile(drive_protocol.request.SetEndOfFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetEndOfFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public drive_protocol.response.SetAllocationSizeResponse setAllocationSize(drive_protocol.request.SetAllocationSizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAllocationSizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public drive_protocol.response.SetFileAttributesResponse setFileAttributes(drive_protocol.request.SetFileAttributesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetFileAttributesMethod(), getCallOptions(), request);
    }

    /**
     */
    public drive_protocol.response.UnlockFileResponse unlockFile(drive_protocol.request.UnlockFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnlockFileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DriveProcedureFutureStub extends io.grpc.stub.AbstractFutureStub<DriveProcedureFutureStub> {
    private DriveProcedureFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DriveProcedureFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DriveProcedureFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.CreateFileResponse> createFile(
        drive_protocol.request.CreateFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.CloseFileResponse> closeFile(
        drive_protocol.request.CloseFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.ReadFileResponse> readFile(
        drive_protocol.request.ReadFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.WriteFileResponse> writeFile(
        drive_protocol.request.WriteFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.FlushFileBufferResponse> flushFileBuffer(
        drive_protocol.request.FlushFileBufferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFlushFileBufferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.GetFileInformationResponse> getFileInformation(
        drive_protocol.request.GetFileInformationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFileInformationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.DeleteFileResponse> deleteFile(
        drive_protocol.request.DeleteFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.DeleteDirectoryResponse> deleteDirectory(
        drive_protocol.request.DeleteDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDirectoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.MoveFileResponse> moveFile(
        drive_protocol.request.MoveFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.LockFileResponse> lockFile(
        drive_protocol.request.LockFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.SetEndOfFileResponse> setEndOfFile(
        drive_protocol.request.SetEndOfFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetEndOfFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.SetAllocationSizeResponse> setAllocationSize(
        drive_protocol.request.SetAllocationSizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAllocationSizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.SetFileAttributesResponse> setFileAttributes(
        drive_protocol.request.SetFileAttributesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetFileAttributesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<drive_protocol.response.UnlockFileResponse> unlockFile(
        drive_protocol.request.UnlockFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnlockFileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FILE = 0;
  private static final int METHODID_CLOSE_FILE = 1;
  private static final int METHODID_READ_FILE = 2;
  private static final int METHODID_WRITE_FILE = 3;
  private static final int METHODID_FLUSH_FILE_BUFFER = 4;
  private static final int METHODID_GET_FILE_INFORMATION = 5;
  private static final int METHODID_DELETE_FILE = 6;
  private static final int METHODID_DELETE_DIRECTORY = 7;
  private static final int METHODID_MOVE_FILE = 8;
  private static final int METHODID_LOCK_FILE = 9;
  private static final int METHODID_SET_END_OF_FILE = 10;
  private static final int METHODID_SET_ALLOCATION_SIZE = 11;
  private static final int METHODID_SET_FILE_ATTRIBUTES = 12;
  private static final int METHODID_UNLOCK_FILE = 13;
  private static final int METHODID_SUBSCRIBE = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DriveProcedureImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DriveProcedureImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_FILE:
          serviceImpl.createFile((drive_protocol.request.CreateFileRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.CreateFileResponse>) responseObserver);
          break;
        case METHODID_CLOSE_FILE:
          serviceImpl.closeFile((drive_protocol.request.CloseFileRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.CloseFileResponse>) responseObserver);
          break;
        case METHODID_READ_FILE:
          serviceImpl.readFile((drive_protocol.request.ReadFileRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.ReadFileResponse>) responseObserver);
          break;
        case METHODID_WRITE_FILE:
          serviceImpl.writeFile((drive_protocol.request.WriteFileRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.WriteFileResponse>) responseObserver);
          break;
        case METHODID_FLUSH_FILE_BUFFER:
          serviceImpl.flushFileBuffer((drive_protocol.request.FlushFileBufferRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.FlushFileBufferResponse>) responseObserver);
          break;
        case METHODID_GET_FILE_INFORMATION:
          serviceImpl.getFileInformation((drive_protocol.request.GetFileInformationRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.GetFileInformationResponse>) responseObserver);
          break;
        case METHODID_DELETE_FILE:
          serviceImpl.deleteFile((drive_protocol.request.DeleteFileRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.DeleteFileResponse>) responseObserver);
          break;
        case METHODID_DELETE_DIRECTORY:
          serviceImpl.deleteDirectory((drive_protocol.request.DeleteDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.DeleteDirectoryResponse>) responseObserver);
          break;
        case METHODID_MOVE_FILE:
          serviceImpl.moveFile((drive_protocol.request.MoveFileRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.MoveFileResponse>) responseObserver);
          break;
        case METHODID_LOCK_FILE:
          serviceImpl.lockFile((drive_protocol.request.LockFileRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.LockFileResponse>) responseObserver);
          break;
        case METHODID_SET_END_OF_FILE:
          serviceImpl.setEndOfFile((drive_protocol.request.SetEndOfFileRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.SetEndOfFileResponse>) responseObserver);
          break;
        case METHODID_SET_ALLOCATION_SIZE:
          serviceImpl.setAllocationSize((drive_protocol.request.SetAllocationSizeRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.SetAllocationSizeResponse>) responseObserver);
          break;
        case METHODID_SET_FILE_ATTRIBUTES:
          serviceImpl.setFileAttributes((drive_protocol.request.SetFileAttributesRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.SetFileAttributesResponse>) responseObserver);
          break;
        case METHODID_UNLOCK_FILE:
          serviceImpl.unlockFile((drive_protocol.request.UnlockFileRequest) request,
              (io.grpc.stub.StreamObserver<drive_protocol.response.UnlockFileResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subscribe(
              (io.grpc.stub.StreamObserver<drive_protocol.response.PubMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DriveProcedureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DriveProcedureBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return drive_protocol.DriveProcedureOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DriveProcedure");
    }
  }

  private static final class DriveProcedureFileDescriptorSupplier
      extends DriveProcedureBaseDescriptorSupplier {
    DriveProcedureFileDescriptorSupplier() {}
  }

  private static final class DriveProcedureMethodDescriptorSupplier
      extends DriveProcedureBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DriveProcedureMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DriveProcedureGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DriveProcedureFileDescriptorSupplier())
              .addMethod(getCreateFileMethod())
              .addMethod(getCloseFileMethod())
              .addMethod(getReadFileMethod())
              .addMethod(getWriteFileMethod())
              .addMethod(getFlushFileBufferMethod())
              .addMethod(getGetFileInformationMethod())
              .addMethod(getDeleteFileMethod())
              .addMethod(getDeleteDirectoryMethod())
              .addMethod(getMoveFileMethod())
              .addMethod(getLockFileMethod())
              .addMethod(getSetEndOfFileMethod())
              .addMethod(getSetAllocationSizeMethod())
              .addMethod(getSetFileAttributesMethod())
              .addMethod(getUnlockFileMethod())
              .addMethod(getSubscribeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
