// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Request.proto

package drive_protocol.request;

/**
 * Protobuf type {@code drive_protocol.request.WriteFileRequest}
 */
public final class WriteFileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:drive_protocol.request.WriteFileRequest)
    WriteFileRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WriteFileRequest.newBuilder() to construct.
  private WriteFileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WriteFileRequest() {
    fileName_ = "";
    buffer_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WriteFileRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WriteFileRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            drive_protocol.request.RequestInfo.Builder subBuilder = null;
            if (req_ != null) {
              subBuilder = req_.toBuilder();
            }
            req_ = input.readMessage(drive_protocol.request.RequestInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(req_);
              req_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            drive_protocol.request.CredentialInfo.Builder subBuilder = null;
            if (cred_ != null) {
              subBuilder = cred_.toBuilder();
            }
            cred_ = input.readMessage(drive_protocol.request.CredentialInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cred_);
              cred_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            fileName_ = s;
            break;
          }
          case 32: {

            length_ = input.readUInt64();
            break;
          }
          case 40: {

            offset_ = input.readInt64();
            break;
          }
          case 50: {

            buffer_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return drive_protocol.request.Request.internal_static_drive_protocol_request_WriteFileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return drive_protocol.request.Request.internal_static_drive_protocol_request_WriteFileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            drive_protocol.request.WriteFileRequest.class, drive_protocol.request.WriteFileRequest.Builder.class);
  }

  public static final int REQ_FIELD_NUMBER = 1;
  private drive_protocol.request.RequestInfo req_;
  /**
   * <code>.drive_protocol.request.RequestInfo req = 1;</code>
   * @return Whether the req field is set.
   */
  @java.lang.Override
  public boolean hasReq() {
    return req_ != null;
  }
  /**
   * <code>.drive_protocol.request.RequestInfo req = 1;</code>
   * @return The req.
   */
  @java.lang.Override
  public drive_protocol.request.RequestInfo getReq() {
    return req_ == null ? drive_protocol.request.RequestInfo.getDefaultInstance() : req_;
  }
  /**
   * <code>.drive_protocol.request.RequestInfo req = 1;</code>
   */
  @java.lang.Override
  public drive_protocol.request.RequestInfoOrBuilder getReqOrBuilder() {
    return getReq();
  }

  public static final int CRED_FIELD_NUMBER = 2;
  private drive_protocol.request.CredentialInfo cred_;
  /**
   * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
   * @return Whether the cred field is set.
   */
  @java.lang.Override
  public boolean hasCred() {
    return cred_ != null;
  }
  /**
   * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
   * @return The cred.
   */
  @java.lang.Override
  public drive_protocol.request.CredentialInfo getCred() {
    return cred_ == null ? drive_protocol.request.CredentialInfo.getDefaultInstance() : cred_;
  }
  /**
   * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
   */
  @java.lang.Override
  public drive_protocol.request.CredentialInfoOrBuilder getCredOrBuilder() {
    return getCred();
  }

  public static final int FILE_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object fileName_;
  /**
   * <code>string file_name = 3;</code>
   * @return The fileName.
   */
  @java.lang.Override
  public java.lang.String getFileName() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileName_ = s;
      return s;
    }
  }
  /**
   * <code>string file_name = 3;</code>
   * @return The bytes for fileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileNameBytes() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LENGTH_FIELD_NUMBER = 4;
  private long length_;
  /**
   * <code>uint64 length = 4;</code>
   * @return The length.
   */
  @java.lang.Override
  public long getLength() {
    return length_;
  }

  public static final int OFFSET_FIELD_NUMBER = 5;
  private long offset_;
  /**
   * <code>int64 offset = 5;</code>
   * @return The offset.
   */
  @java.lang.Override
  public long getOffset() {
    return offset_;
  }

  public static final int BUFFER_FIELD_NUMBER = 6;
  private com.google.protobuf.ByteString buffer_;
  /**
   * <code>bytes buffer = 6;</code>
   * @return The buffer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBuffer() {
    return buffer_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (req_ != null) {
      output.writeMessage(1, getReq());
    }
    if (cred_ != null) {
      output.writeMessage(2, getCred());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fileName_);
    }
    if (length_ != 0L) {
      output.writeUInt64(4, length_);
    }
    if (offset_ != 0L) {
      output.writeInt64(5, offset_);
    }
    if (!buffer_.isEmpty()) {
      output.writeBytes(6, buffer_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (req_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReq());
    }
    if (cred_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCred());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fileName_);
    }
    if (length_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, length_);
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, offset_);
    }
    if (!buffer_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(6, buffer_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof drive_protocol.request.WriteFileRequest)) {
      return super.equals(obj);
    }
    drive_protocol.request.WriteFileRequest other = (drive_protocol.request.WriteFileRequest) obj;

    if (hasReq() != other.hasReq()) return false;
    if (hasReq()) {
      if (!getReq()
          .equals(other.getReq())) return false;
    }
    if (hasCred() != other.hasCred()) return false;
    if (hasCred()) {
      if (!getCred()
          .equals(other.getCred())) return false;
    }
    if (!getFileName()
        .equals(other.getFileName())) return false;
    if (getLength()
        != other.getLength()) return false;
    if (getOffset()
        != other.getOffset()) return false;
    if (!getBuffer()
        .equals(other.getBuffer())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasReq()) {
      hash = (37 * hash) + REQ_FIELD_NUMBER;
      hash = (53 * hash) + getReq().hashCode();
    }
    if (hasCred()) {
      hash = (37 * hash) + CRED_FIELD_NUMBER;
      hash = (53 * hash) + getCred().hashCode();
    }
    hash = (37 * hash) + FILE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFileName().hashCode();
    hash = (37 * hash) + LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLength());
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOffset());
    hash = (37 * hash) + BUFFER_FIELD_NUMBER;
    hash = (53 * hash) + getBuffer().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static drive_protocol.request.WriteFileRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static drive_protocol.request.WriteFileRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static drive_protocol.request.WriteFileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static drive_protocol.request.WriteFileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static drive_protocol.request.WriteFileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static drive_protocol.request.WriteFileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static drive_protocol.request.WriteFileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static drive_protocol.request.WriteFileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static drive_protocol.request.WriteFileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static drive_protocol.request.WriteFileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static drive_protocol.request.WriteFileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static drive_protocol.request.WriteFileRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(drive_protocol.request.WriteFileRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code drive_protocol.request.WriteFileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:drive_protocol.request.WriteFileRequest)
      drive_protocol.request.WriteFileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return drive_protocol.request.Request.internal_static_drive_protocol_request_WriteFileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return drive_protocol.request.Request.internal_static_drive_protocol_request_WriteFileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              drive_protocol.request.WriteFileRequest.class, drive_protocol.request.WriteFileRequest.Builder.class);
    }

    // Construct using drive_protocol.request.WriteFileRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (reqBuilder_ == null) {
        req_ = null;
      } else {
        req_ = null;
        reqBuilder_ = null;
      }
      if (credBuilder_ == null) {
        cred_ = null;
      } else {
        cred_ = null;
        credBuilder_ = null;
      }
      fileName_ = "";

      length_ = 0L;

      offset_ = 0L;

      buffer_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return drive_protocol.request.Request.internal_static_drive_protocol_request_WriteFileRequest_descriptor;
    }

    @java.lang.Override
    public drive_protocol.request.WriteFileRequest getDefaultInstanceForType() {
      return drive_protocol.request.WriteFileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public drive_protocol.request.WriteFileRequest build() {
      drive_protocol.request.WriteFileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public drive_protocol.request.WriteFileRequest buildPartial() {
      drive_protocol.request.WriteFileRequest result = new drive_protocol.request.WriteFileRequest(this);
      if (reqBuilder_ == null) {
        result.req_ = req_;
      } else {
        result.req_ = reqBuilder_.build();
      }
      if (credBuilder_ == null) {
        result.cred_ = cred_;
      } else {
        result.cred_ = credBuilder_.build();
      }
      result.fileName_ = fileName_;
      result.length_ = length_;
      result.offset_ = offset_;
      result.buffer_ = buffer_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof drive_protocol.request.WriteFileRequest) {
        return mergeFrom((drive_protocol.request.WriteFileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(drive_protocol.request.WriteFileRequest other) {
      if (other == drive_protocol.request.WriteFileRequest.getDefaultInstance()) return this;
      if (other.hasReq()) {
        mergeReq(other.getReq());
      }
      if (other.hasCred()) {
        mergeCred(other.getCred());
      }
      if (!other.getFileName().isEmpty()) {
        fileName_ = other.fileName_;
        onChanged();
      }
      if (other.getLength() != 0L) {
        setLength(other.getLength());
      }
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
      }
      if (other.getBuffer() != com.google.protobuf.ByteString.EMPTY) {
        setBuffer(other.getBuffer());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      drive_protocol.request.WriteFileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (drive_protocol.request.WriteFileRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private drive_protocol.request.RequestInfo req_;
    private com.google.protobuf.SingleFieldBuilderV3<
        drive_protocol.request.RequestInfo, drive_protocol.request.RequestInfo.Builder, drive_protocol.request.RequestInfoOrBuilder> reqBuilder_;
    /**
     * <code>.drive_protocol.request.RequestInfo req = 1;</code>
     * @return Whether the req field is set.
     */
    public boolean hasReq() {
      return reqBuilder_ != null || req_ != null;
    }
    /**
     * <code>.drive_protocol.request.RequestInfo req = 1;</code>
     * @return The req.
     */
    public drive_protocol.request.RequestInfo getReq() {
      if (reqBuilder_ == null) {
        return req_ == null ? drive_protocol.request.RequestInfo.getDefaultInstance() : req_;
      } else {
        return reqBuilder_.getMessage();
      }
    }
    /**
     * <code>.drive_protocol.request.RequestInfo req = 1;</code>
     */
    public Builder setReq(drive_protocol.request.RequestInfo value) {
      if (reqBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        req_ = value;
        onChanged();
      } else {
        reqBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.drive_protocol.request.RequestInfo req = 1;</code>
     */
    public Builder setReq(
        drive_protocol.request.RequestInfo.Builder builderForValue) {
      if (reqBuilder_ == null) {
        req_ = builderForValue.build();
        onChanged();
      } else {
        reqBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.drive_protocol.request.RequestInfo req = 1;</code>
     */
    public Builder mergeReq(drive_protocol.request.RequestInfo value) {
      if (reqBuilder_ == null) {
        if (req_ != null) {
          req_ =
            drive_protocol.request.RequestInfo.newBuilder(req_).mergeFrom(value).buildPartial();
        } else {
          req_ = value;
        }
        onChanged();
      } else {
        reqBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.drive_protocol.request.RequestInfo req = 1;</code>
     */
    public Builder clearReq() {
      if (reqBuilder_ == null) {
        req_ = null;
        onChanged();
      } else {
        req_ = null;
        reqBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.drive_protocol.request.RequestInfo req = 1;</code>
     */
    public drive_protocol.request.RequestInfo.Builder getReqBuilder() {
      
      onChanged();
      return getReqFieldBuilder().getBuilder();
    }
    /**
     * <code>.drive_protocol.request.RequestInfo req = 1;</code>
     */
    public drive_protocol.request.RequestInfoOrBuilder getReqOrBuilder() {
      if (reqBuilder_ != null) {
        return reqBuilder_.getMessageOrBuilder();
      } else {
        return req_ == null ?
            drive_protocol.request.RequestInfo.getDefaultInstance() : req_;
      }
    }
    /**
     * <code>.drive_protocol.request.RequestInfo req = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        drive_protocol.request.RequestInfo, drive_protocol.request.RequestInfo.Builder, drive_protocol.request.RequestInfoOrBuilder> 
        getReqFieldBuilder() {
      if (reqBuilder_ == null) {
        reqBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            drive_protocol.request.RequestInfo, drive_protocol.request.RequestInfo.Builder, drive_protocol.request.RequestInfoOrBuilder>(
                getReq(),
                getParentForChildren(),
                isClean());
        req_ = null;
      }
      return reqBuilder_;
    }

    private drive_protocol.request.CredentialInfo cred_;
    private com.google.protobuf.SingleFieldBuilderV3<
        drive_protocol.request.CredentialInfo, drive_protocol.request.CredentialInfo.Builder, drive_protocol.request.CredentialInfoOrBuilder> credBuilder_;
    /**
     * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
     * @return Whether the cred field is set.
     */
    public boolean hasCred() {
      return credBuilder_ != null || cred_ != null;
    }
    /**
     * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
     * @return The cred.
     */
    public drive_protocol.request.CredentialInfo getCred() {
      if (credBuilder_ == null) {
        return cred_ == null ? drive_protocol.request.CredentialInfo.getDefaultInstance() : cred_;
      } else {
        return credBuilder_.getMessage();
      }
    }
    /**
     * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
     */
    public Builder setCred(drive_protocol.request.CredentialInfo value) {
      if (credBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cred_ = value;
        onChanged();
      } else {
        credBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
     */
    public Builder setCred(
        drive_protocol.request.CredentialInfo.Builder builderForValue) {
      if (credBuilder_ == null) {
        cred_ = builderForValue.build();
        onChanged();
      } else {
        credBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
     */
    public Builder mergeCred(drive_protocol.request.CredentialInfo value) {
      if (credBuilder_ == null) {
        if (cred_ != null) {
          cred_ =
            drive_protocol.request.CredentialInfo.newBuilder(cred_).mergeFrom(value).buildPartial();
        } else {
          cred_ = value;
        }
        onChanged();
      } else {
        credBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
     */
    public Builder clearCred() {
      if (credBuilder_ == null) {
        cred_ = null;
        onChanged();
      } else {
        cred_ = null;
        credBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
     */
    public drive_protocol.request.CredentialInfo.Builder getCredBuilder() {
      
      onChanged();
      return getCredFieldBuilder().getBuilder();
    }
    /**
     * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
     */
    public drive_protocol.request.CredentialInfoOrBuilder getCredOrBuilder() {
      if (credBuilder_ != null) {
        return credBuilder_.getMessageOrBuilder();
      } else {
        return cred_ == null ?
            drive_protocol.request.CredentialInfo.getDefaultInstance() : cred_;
      }
    }
    /**
     * <code>.drive_protocol.request.CredentialInfo cred = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        drive_protocol.request.CredentialInfo, drive_protocol.request.CredentialInfo.Builder, drive_protocol.request.CredentialInfoOrBuilder> 
        getCredFieldBuilder() {
      if (credBuilder_ == null) {
        credBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            drive_protocol.request.CredentialInfo, drive_protocol.request.CredentialInfo.Builder, drive_protocol.request.CredentialInfoOrBuilder>(
                getCred(),
                getParentForChildren(),
                isClean());
        cred_ = null;
      }
      return credBuilder_;
    }

    private java.lang.Object fileName_ = "";
    /**
     * <code>string file_name = 3;</code>
     * @return The fileName.
     */
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string file_name = 3;</code>
     * @return The bytes for fileName.
     */
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string file_name = 3;</code>
     * @param value The fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string file_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileName() {
      
      fileName_ = getDefaultInstance().getFileName();
      onChanged();
      return this;
    }
    /**
     * <code>string file_name = 3;</code>
     * @param value The bytes for fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileName_ = value;
      onChanged();
      return this;
    }

    private long length_ ;
    /**
     * <code>uint64 length = 4;</code>
     * @return The length.
     */
    @java.lang.Override
    public long getLength() {
      return length_;
    }
    /**
     * <code>uint64 length = 4;</code>
     * @param value The length to set.
     * @return This builder for chaining.
     */
    public Builder setLength(long value) {
      
      length_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 length = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLength() {
      
      length_ = 0L;
      onChanged();
      return this;
    }

    private long offset_ ;
    /**
     * <code>int64 offset = 5;</code>
     * @return The offset.
     */
    @java.lang.Override
    public long getOffset() {
      return offset_;
    }
    /**
     * <code>int64 offset = 5;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(long value) {
      
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 offset = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      
      offset_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString buffer_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes buffer = 6;</code>
     * @return The buffer.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBuffer() {
      return buffer_;
    }
    /**
     * <code>bytes buffer = 6;</code>
     * @param value The buffer to set.
     * @return This builder for chaining.
     */
    public Builder setBuffer(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      buffer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes buffer = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBuffer() {
      
      buffer_ = getDefaultInstance().getBuffer();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:drive_protocol.request.WriteFileRequest)
  }

  // @@protoc_insertion_point(class_scope:drive_protocol.request.WriteFileRequest)
  private static final drive_protocol.request.WriteFileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new drive_protocol.request.WriteFileRequest();
  }

  public static drive_protocol.request.WriteFileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WriteFileRequest>
      PARSER = new com.google.protobuf.AbstractParser<WriteFileRequest>() {
    @java.lang.Override
    public WriteFileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WriteFileRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WriteFileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WriteFileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public drive_protocol.request.WriteFileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

