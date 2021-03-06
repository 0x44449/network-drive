// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Request.proto

package drive_protocol.request;

public interface MoveFileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:drive_protocol.request.MoveFileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.drive_protocol.request.RequestInfo req = 1;</code>
   * @return Whether the req field is set.
   */
  boolean hasReq();
  /**
   * <code>.drive_protocol.request.RequestInfo req = 1;</code>
   * @return The req.
   */
  drive_protocol.request.RequestInfo getReq();
  /**
   * <code>.drive_protocol.request.RequestInfo req = 1;</code>
   */
  drive_protocol.request.RequestInfoOrBuilder getReqOrBuilder();

  /**
   * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
   * @return Whether the cred field is set.
   */
  boolean hasCred();
  /**
   * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
   * @return The cred.
   */
  drive_protocol.request.CredentialInfo getCred();
  /**
   * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
   */
  drive_protocol.request.CredentialInfoOrBuilder getCredOrBuilder();

  /**
   * <code>string file_name = 3;</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <code>string file_name = 3;</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <code>string new_file_name = 4;</code>
   * @return The newFileName.
   */
  java.lang.String getNewFileName();
  /**
   * <code>string new_file_name = 4;</code>
   * @return The bytes for newFileName.
   */
  com.google.protobuf.ByteString
      getNewFileNameBytes();

  /**
   * <code>bool replace_if_existing = 5;</code>
   * @return The replaceIfExisting.
   */
  boolean getReplaceIfExisting();
}
