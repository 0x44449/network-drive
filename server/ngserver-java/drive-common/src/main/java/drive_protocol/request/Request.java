// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Request.proto

package drive_protocol.request;

public final class Request {
  private Request() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_RequestInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_RequestInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_CredentialInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_CredentialInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_CreateFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_CreateFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_CloseFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_CloseFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_ReadFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_ReadFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_WriteFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_WriteFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_FlushFileBufferRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_FlushFileBufferRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_GetFileInformationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_GetFileInformationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_DeleteFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_DeleteFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_DeleteDirectoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_DeleteDirectoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_MoveFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_MoveFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_LockFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_LockFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_SetEndOfFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_SetEndOfFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_SetAllocationSizeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_SetAllocationSizeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_SetFileAttributesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_SetFileAttributesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_drive_protocol_request_UnlockFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_drive_protocol_request_UnlockFileRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rRequest.proto\022\026drive_protocol.request\"" +
      "\253\001\n\013RequestInfo\022\022\n\nprocess_id\030\001 \001(\004\022\024\n\014i" +
      "s_directory\030\002 \001(\010\022\027\n\017delete_on_close\030\003 \001" +
      "(\010\022\021\n\tpaging_io\030\004 \001(\010\022\026\n\016synchronous_io\030" +
      "\005 \001(\010\022\020\n\010no_cache\030\006 \001(\010\022\034\n\024write_to_end_" +
      "of_file\030\007 \001(\010\"\020\n\016CredentialInfo\"\211\002\n\021Crea" +
      "teFileRequest\0220\n\003req\030\001 \001(\0132#.drive_proto" +
      "col.request.RequestInfo\0224\n\004cred\030\002 \001(\0132&." +
      "drive_protocol.request.CredentialInfo\022\021\n" +
      "\tfile_name\030\003 \001(\t\022\026\n\016desired_access\030\004 \001(\r" +
      "\022\027\n\017file_attributes\030\005 \001(\r\022\024\n\014share_acces" +
      "s\030\006 \001(\r\022\032\n\022create_disposition\030\007 \001(\r\022\026\n\016c" +
      "reate_options\030\010 \001(\r\"\215\001\n\020CloseFileRequest" +
      "\0220\n\003req\030\001 \001(\0132#.drive_protocol.request.R" +
      "equestInfo\0224\n\004cred\030\002 \001(\0132&.drive_protoco" +
      "l.request.CredentialInfo\022\021\n\tfile_name\030\003 " +
      "\001(\t\"\254\001\n\017ReadFileRequest\0220\n\003req\030\001 \001(\0132#.d" +
      "rive_protocol.request.RequestInfo\0224\n\004cre" +
      "d\030\002 \001(\0132&.drive_protocol.request.Credent" +
      "ialInfo\022\021\n\tfile_name\030\003 \001(\t\022\016\n\006length\030\004 \001" +
      "(\004\022\016\n\006offset\030\005 \001(\003\"\275\001\n\020WriteFileRequest\022" +
      "0\n\003req\030\001 \001(\0132#.drive_protocol.request.Re" +
      "questInfo\0224\n\004cred\030\002 \001(\0132&.drive_protocol" +
      ".request.CredentialInfo\022\021\n\tfile_name\030\003 \001" +
      "(\t\022\016\n\006length\030\004 \001(\004\022\016\n\006offset\030\005 \001(\003\022\016\n\006bu" +
      "ffer\030\006 \001(\014\"\223\001\n\026FlushFileBufferRequest\0220\n" +
      "\003req\030\001 \001(\0132#.drive_protocol.request.Requ" +
      "estInfo\0224\n\004cred\030\002 \001(\0132&.drive_protocol.r" +
      "equest.CredentialInfo\022\021\n\tfile_name\030\003 \001(\t" +
      "\"\226\001\n\031GetFileInformationRequest\0220\n\003req\030\001 " +
      "\001(\0132#.drive_protocol.request.RequestInfo" +
      "\0224\n\004cred\030\002 \001(\0132&.drive_protocol.request." +
      "CredentialInfo\022\021\n\tfile_name\030\003 \001(\t\"\216\001\n\021De" +
      "leteFileRequest\0220\n\003req\030\001 \001(\0132#.drive_pro" +
      "tocol.request.RequestInfo\0224\n\004cred\030\002 \001(\0132" +
      "&.drive_protocol.request.CredentialInfo\022" +
      "\021\n\tfile_name\030\003 \001(\t\"\223\001\n\026DeleteDirectoryRe" +
      "quest\0220\n\003req\030\001 \001(\0132#.drive_protocol.requ" +
      "est.RequestInfo\0224\n\004cred\030\002 \001(\0132&.drive_pr" +
      "otocol.request.CredentialInfo\022\021\n\tfile_na" +
      "me\030\003 \001(\t\"\300\001\n\017MoveFileRequest\0220\n\003req\030\001 \001(" +
      "\0132#.drive_protocol.request.RequestInfo\0224" +
      "\n\004cred\030\002 \001(\0132&.drive_protocol.request.Cr" +
      "edentialInfo\022\021\n\tfile_name\030\003 \001(\t\022\025\n\rnew_f" +
      "ile_name\030\004 \001(\t\022\033\n\023replace_if_existing\030\005 " +
      "\001(\010\"\254\001\n\017LockFileRequest\0220\n\003req\030\001 \001(\0132#.d" +
      "rive_protocol.request.RequestInfo\0224\n\004cre" +
      "d\030\002 \001(\0132&.drive_protocol.request.Credent" +
      "ialInfo\022\021\n\tfile_name\030\003 \001(\t\022\016\n\006offset\030\004 \001" +
      "(\003\022\016\n\006length\030\005 \001(\003\"\240\001\n\023SetEndOfFileReque" +
      "st\0220\n\003req\030\001 \001(\0132#.drive_protocol.request" +
      ".RequestInfo\0224\n\004cred\030\002 \001(\0132&.drive_proto" +
      "col.request.CredentialInfo\022\021\n\tfile_name\030" +
      "\003 \001(\t\022\016\n\006offset\030\004 \001(\003\"\243\001\n\030SetAllocationS" +
      "izeRequest\0220\n\003req\030\001 \001(\0132#.drive_protocol" +
      ".request.RequestInfo\0224\n\004cred\030\002 \001(\0132&.dri" +
      "ve_protocol.request.CredentialInfo\022\021\n\tfi" +
      "le_name\030\003 \001(\t\022\014\n\004size\030\004 \001(\003\"\256\001\n\030SetFileA" +
      "ttributesRequest\0220\n\003req\030\001 \001(\0132#.drive_pr" +
      "otocol.request.RequestInfo\0224\n\004cred\030\002 \001(\013" +
      "2&.drive_protocol.request.CredentialInfo" +
      "\022\021\n\tfile_name\030\003 \001(\t\022\027\n\017file_attributes\030\004" +
      " \001(\004\"\256\001\n\021UnlockFileRequest\0220\n\003req\030\001 \001(\0132" +
      "#.drive_protocol.request.RequestInfo\0224\n\004" +
      "cred\030\002 \001(\0132&.drive_protocol.request.Cred" +
      "entialInfo\022\021\n\tfile_name\030\003 \001(\t\022\016\n\006offset\030" +
      "\004 \001(\003\022\016\n\006length\030\005 \001(\003B\032\n\026drive_protocol." +
      "requestP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_drive_protocol_request_RequestInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_drive_protocol_request_RequestInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_RequestInfo_descriptor,
        new java.lang.String[] { "ProcessId", "IsDirectory", "DeleteOnClose", "PagingIo", "SynchronousIo", "NoCache", "WriteToEndOfFile", });
    internal_static_drive_protocol_request_CredentialInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_drive_protocol_request_CredentialInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_CredentialInfo_descriptor,
        new java.lang.String[] { });
    internal_static_drive_protocol_request_CreateFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_drive_protocol_request_CreateFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_CreateFileRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", "DesiredAccess", "FileAttributes", "ShareAccess", "CreateDisposition", "CreateOptions", });
    internal_static_drive_protocol_request_CloseFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_drive_protocol_request_CloseFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_CloseFileRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", });
    internal_static_drive_protocol_request_ReadFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_drive_protocol_request_ReadFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_ReadFileRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", "Length", "Offset", });
    internal_static_drive_protocol_request_WriteFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_drive_protocol_request_WriteFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_WriteFileRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", "Length", "Offset", "Buffer", });
    internal_static_drive_protocol_request_FlushFileBufferRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_drive_protocol_request_FlushFileBufferRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_FlushFileBufferRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", });
    internal_static_drive_protocol_request_GetFileInformationRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_drive_protocol_request_GetFileInformationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_GetFileInformationRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", });
    internal_static_drive_protocol_request_DeleteFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_drive_protocol_request_DeleteFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_DeleteFileRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", });
    internal_static_drive_protocol_request_DeleteDirectoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_drive_protocol_request_DeleteDirectoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_DeleteDirectoryRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", });
    internal_static_drive_protocol_request_MoveFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_drive_protocol_request_MoveFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_MoveFileRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", "NewFileName", "ReplaceIfExisting", });
    internal_static_drive_protocol_request_LockFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_drive_protocol_request_LockFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_LockFileRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", "Offset", "Length", });
    internal_static_drive_protocol_request_SetEndOfFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_drive_protocol_request_SetEndOfFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_SetEndOfFileRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", "Offset", });
    internal_static_drive_protocol_request_SetAllocationSizeRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_drive_protocol_request_SetAllocationSizeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_SetAllocationSizeRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", "Size", });
    internal_static_drive_protocol_request_SetFileAttributesRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_drive_protocol_request_SetFileAttributesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_SetFileAttributesRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", "FileAttributes", });
    internal_static_drive_protocol_request_UnlockFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_drive_protocol_request_UnlockFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_drive_protocol_request_UnlockFileRequest_descriptor,
        new java.lang.String[] { "Req", "Cred", "FileName", "Offset", "Length", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
