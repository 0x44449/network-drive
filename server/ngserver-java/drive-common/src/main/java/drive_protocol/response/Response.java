// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Response.proto

package drive_protocol.response;

public final class Response {
  private Response() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_PubMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_PubMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_CreateFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_CreateFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_CloseFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_CloseFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_ReadFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_ReadFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_WriteFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_WriteFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_FlushFileBufferResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_FlushFileBufferResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_GetFileInformationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_GetFileInformationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_DeleteFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_DeleteFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_DeleteDirectoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_DeleteDirectoryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_MoveFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_MoveFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_LockFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_LockFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_SetEndOfFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_SetEndOfFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_SetAllocationSizeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_SetAllocationSizeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_SetFileAttributesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_SetFileAttributesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_response_UnlockFileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_response_UnlockFileResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Response.proto\022\027drive_protocol.respons" +
      "e\032\nComm.proto\"\204\001\n\nPubMessage\022\016\n\006status\030\001" +
      " \001(\005\022-\n\007command\030\002 \001(\0162\034.drive_protocol.c" +
      "omm.Command\0227\n\nconnection\030\003 \001(\0132#.drive_" +
      "protocol.comm.ConnectionInfo\"$\n\022CreateFi" +
      "leResponse\022\016\n\006status\030\001 \001(\005\"#\n\021CloseFileR" +
      "esponse\022\016\n\006status\030\001 \001(\005\"2\n\020ReadFileRespo" +
      "nse\022\016\n\006status\030\001 \001(\005\022\016\n\006buffer\030\002 \001(\014\"#\n\021W" +
      "riteFileResponse\022\016\n\006status\030\001 \001(\005\")\n\027Flus" +
      "hFileBufferResponse\022\016\n\006status\030\001 \001(\005\"E\n\032G" +
      "etFileInformationResponse\022\016\n\006status\030\001 \001(" +
      "\005\022\027\n\017file_attributes\030\002 \001(\004\"$\n\022DeleteFile" +
      "Response\022\016\n\006status\030\001 \001(\005\")\n\027DeleteDirect" +
      "oryResponse\022\016\n\006status\030\001 \001(\005\"\"\n\020MoveFileR" +
      "esponse\022\016\n\006status\030\001 \001(\005\"\"\n\020LockFileRespo" +
      "nse\022\016\n\006status\030\001 \001(\005\"&\n\024SetEndOfFileRespo" +
      "nse\022\016\n\006status\030\001 \001(\005\"+\n\031SetAllocationSize" +
      "Response\022\016\n\006status\030\001 \001(\005\"+\n\031SetFileAttri" +
      "butesResponse\022\016\n\006status\030\001 \001(\005\"$\n\022UnlockF" +
      "ileResponse\022\016\n\006status\030\001 \001(\005B\033\n\027drive_pro" +
      "tocol.responseP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          drive_protocol.Comm.getDescriptor(),
        });
    internal_static_drive_protocol_response_PubMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_drive_protocol_response_PubMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_PubMessage_descriptor,
        new java.lang.String[] { "Status", "Command", "Connection", });
    internal_static_drive_protocol_response_CreateFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_drive_protocol_response_CreateFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_CreateFileResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_drive_protocol_response_CloseFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_drive_protocol_response_CloseFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_CloseFileResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_drive_protocol_response_ReadFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_drive_protocol_response_ReadFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_ReadFileResponse_descriptor,
        new java.lang.String[] { "Status", "Buffer", });
    internal_static_drive_protocol_response_WriteFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_drive_protocol_response_WriteFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_WriteFileResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_drive_protocol_response_FlushFileBufferResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_drive_protocol_response_FlushFileBufferResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_FlushFileBufferResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_drive_protocol_response_GetFileInformationResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_drive_protocol_response_GetFileInformationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_GetFileInformationResponse_descriptor,
        new java.lang.String[] { "Status", "FileAttributes", });
    internal_static_drive_protocol_response_DeleteFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_drive_protocol_response_DeleteFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_DeleteFileResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_drive_protocol_response_DeleteDirectoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_drive_protocol_response_DeleteDirectoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_DeleteDirectoryResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_drive_protocol_response_MoveFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_drive_protocol_response_MoveFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_MoveFileResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_drive_protocol_response_LockFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_drive_protocol_response_LockFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_LockFileResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_drive_protocol_response_SetEndOfFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_drive_protocol_response_SetEndOfFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_SetEndOfFileResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_drive_protocol_response_SetAllocationSizeResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_drive_protocol_response_SetAllocationSizeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_SetAllocationSizeResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_drive_protocol_response_SetFileAttributesResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_drive_protocol_response_SetFileAttributesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_SetFileAttributesResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_drive_protocol_response_UnlockFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_drive_protocol_response_UnlockFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_response_UnlockFileResponse_descriptor,
        new java.lang.String[] { "Status", });
    drive_protocol.Comm.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
