// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.internal.raft.proto;

/**
 * Protobuf type {@code proto.PreVoteResponseProto}
 */
public final class PreVoteResponseProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.PreVoteResponseProto)
    PreVoteResponseProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PreVoteResponseProto.newBuilder() to construct.
  private PreVoteResponseProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PreVoteResponseProto() {
    groupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PreVoteResponseProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cluster.internal.raft.proto.RaftRpc.internal_static_proto_PreVoteResponseProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cluster.internal.raft.proto.RaftRpc.internal_static_proto_PreVoteResponseProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cluster.internal.raft.proto.PreVoteResponseProto.class, cluster.internal.raft.proto.PreVoteResponseProto.Builder.class);
  }

  public static final int GROUPID_FIELD_NUMBER = 1;
  private volatile java.lang.Object groupId_;
  /**
   * <code>string groupId = 1;</code>
   * @return The groupId.
   */
  @java.lang.Override
  public java.lang.String getGroupId() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      groupId_ = s;
      return s;
    }
  }
  /**
   * <code>string groupId = 1;</code>
   * @return The bytes for groupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGroupIdBytes() {
    java.lang.Object ref = groupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      groupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENDER_FIELD_NUMBER = 2;
  private cluster.internal.raft.proto.RaftEndpointProto sender_;
  /**
   * <code>.proto.RaftEndpointProto sender = 2;</code>
   * @return Whether the sender field is set.
   */
  @java.lang.Override
  public boolean hasSender() {
    return sender_ != null;
  }
  /**
   * <code>.proto.RaftEndpointProto sender = 2;</code>
   * @return The sender.
   */
  @java.lang.Override
  public cluster.internal.raft.proto.RaftEndpointProto getSender() {
    return sender_ == null ? cluster.internal.raft.proto.RaftEndpointProto.getDefaultInstance() : sender_;
  }
  /**
   * <code>.proto.RaftEndpointProto sender = 2;</code>
   */
  @java.lang.Override
  public cluster.internal.raft.proto.RaftEndpointProtoOrBuilder getSenderOrBuilder() {
    return getSender();
  }

  public static final int TERM_FIELD_NUMBER = 3;
  private int term_;
  /**
   * <code>int32 term = 3;</code>
   * @return The term.
   */
  @java.lang.Override
  public int getTerm() {
    return term_;
  }

  public static final int GRANTED_FIELD_NUMBER = 4;
  private boolean granted_;
  /**
   * <code>bool granted = 4;</code>
   * @return The granted.
   */
  @java.lang.Override
  public boolean getGranted() {
    return granted_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, groupId_);
    }
    if (sender_ != null) {
      output.writeMessage(2, getSender());
    }
    if (term_ != 0) {
      output.writeInt32(3, term_);
    }
    if (granted_ != false) {
      output.writeBool(4, granted_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(groupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, groupId_);
    }
    if (sender_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSender());
    }
    if (term_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, term_);
    }
    if (granted_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, granted_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cluster.internal.raft.proto.PreVoteResponseProto)) {
      return super.equals(obj);
    }
    cluster.internal.raft.proto.PreVoteResponseProto other = (cluster.internal.raft.proto.PreVoteResponseProto) obj;

    if (!getGroupId()
        .equals(other.getGroupId())) return false;
    if (hasSender() != other.hasSender()) return false;
    if (hasSender()) {
      if (!getSender()
          .equals(other.getSender())) return false;
    }
    if (getTerm()
        != other.getTerm()) return false;
    if (getGranted()
        != other.getGranted()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GROUPID_FIELD_NUMBER;
    hash = (53 * hash) + getGroupId().hashCode();
    if (hasSender()) {
      hash = (37 * hash) + SENDER_FIELD_NUMBER;
      hash = (53 * hash) + getSender().hashCode();
    }
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + getTerm();
    hash = (37 * hash) + GRANTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getGranted());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cluster.internal.raft.proto.PreVoteResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.PreVoteResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.PreVoteResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.PreVoteResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.PreVoteResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.PreVoteResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.PreVoteResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.PreVoteResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.internal.raft.proto.PreVoteResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.PreVoteResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.internal.raft.proto.PreVoteResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.PreVoteResponseProto parseFrom(
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
  public static Builder newBuilder(cluster.internal.raft.proto.PreVoteResponseProto prototype) {
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
   * Protobuf type {@code proto.PreVoteResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.PreVoteResponseProto)
      cluster.internal.raft.proto.PreVoteResponseProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_PreVoteResponseProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_PreVoteResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cluster.internal.raft.proto.PreVoteResponseProto.class, cluster.internal.raft.proto.PreVoteResponseProto.Builder.class);
    }

    // Construct using cluster.internal.raft.proto.PreVoteResponseProto.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      groupId_ = "";

      if (senderBuilder_ == null) {
        sender_ = null;
      } else {
        sender_ = null;
        senderBuilder_ = null;
      }
      term_ = 0;

      granted_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_PreVoteResponseProto_descriptor;
    }

    @java.lang.Override
    public cluster.internal.raft.proto.PreVoteResponseProto getDefaultInstanceForType() {
      return cluster.internal.raft.proto.PreVoteResponseProto.getDefaultInstance();
    }

    @java.lang.Override
    public cluster.internal.raft.proto.PreVoteResponseProto build() {
      cluster.internal.raft.proto.PreVoteResponseProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cluster.internal.raft.proto.PreVoteResponseProto buildPartial() {
      cluster.internal.raft.proto.PreVoteResponseProto result = new cluster.internal.raft.proto.PreVoteResponseProto(this);
      result.groupId_ = groupId_;
      if (senderBuilder_ == null) {
        result.sender_ = sender_;
      } else {
        result.sender_ = senderBuilder_.build();
      }
      result.term_ = term_;
      result.granted_ = granted_;
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
      if (other instanceof cluster.internal.raft.proto.PreVoteResponseProto) {
        return mergeFrom((cluster.internal.raft.proto.PreVoteResponseProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cluster.internal.raft.proto.PreVoteResponseProto other) {
      if (other == cluster.internal.raft.proto.PreVoteResponseProto.getDefaultInstance()) return this;
      if (!other.getGroupId().isEmpty()) {
        groupId_ = other.groupId_;
        onChanged();
      }
      if (other.hasSender()) {
        mergeSender(other.getSender());
      }
      if (other.getTerm() != 0) {
        setTerm(other.getTerm());
      }
      if (other.getGranted() != false) {
        setGranted(other.getGranted());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              groupId_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSenderFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 24: {
              term_ = input.readInt32();

              break;
            } // case 24
            case 32: {
              granted_ = input.readBool();

              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object groupId_ = "";
    /**
     * <code>string groupId = 1;</code>
     * @return The groupId.
     */
    public java.lang.String getGroupId() {
      java.lang.Object ref = groupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        groupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string groupId = 1;</code>
     * @return The bytes for groupId.
     */
    public com.google.protobuf.ByteString
        getGroupIdBytes() {
      java.lang.Object ref = groupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        groupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string groupId = 1;</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      groupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string groupId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      
      groupId_ = getDefaultInstance().getGroupId();
      onChanged();
      return this;
    }
    /**
     * <code>string groupId = 1;</code>
     * @param value The bytes for groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      groupId_ = value;
      onChanged();
      return this;
    }

    private cluster.internal.raft.proto.RaftEndpointProto sender_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.internal.raft.proto.RaftEndpointProto, cluster.internal.raft.proto.RaftEndpointProto.Builder, cluster.internal.raft.proto.RaftEndpointProtoOrBuilder> senderBuilder_;
    /**
     * <code>.proto.RaftEndpointProto sender = 2;</code>
     * @return Whether the sender field is set.
     */
    public boolean hasSender() {
      return senderBuilder_ != null || sender_ != null;
    }
    /**
     * <code>.proto.RaftEndpointProto sender = 2;</code>
     * @return The sender.
     */
    public cluster.internal.raft.proto.RaftEndpointProto getSender() {
      if (senderBuilder_ == null) {
        return sender_ == null ? cluster.internal.raft.proto.RaftEndpointProto.getDefaultInstance() : sender_;
      } else {
        return senderBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.RaftEndpointProto sender = 2;</code>
     */
    public Builder setSender(cluster.internal.raft.proto.RaftEndpointProto value) {
      if (senderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sender_ = value;
        onChanged();
      } else {
        senderBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.RaftEndpointProto sender = 2;</code>
     */
    public Builder setSender(
        cluster.internal.raft.proto.RaftEndpointProto.Builder builderForValue) {
      if (senderBuilder_ == null) {
        sender_ = builderForValue.build();
        onChanged();
      } else {
        senderBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.RaftEndpointProto sender = 2;</code>
     */
    public Builder mergeSender(cluster.internal.raft.proto.RaftEndpointProto value) {
      if (senderBuilder_ == null) {
        if (sender_ != null) {
          sender_ =
            cluster.internal.raft.proto.RaftEndpointProto.newBuilder(sender_).mergeFrom(value).buildPartial();
        } else {
          sender_ = value;
        }
        onChanged();
      } else {
        senderBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.RaftEndpointProto sender = 2;</code>
     */
    public Builder clearSender() {
      if (senderBuilder_ == null) {
        sender_ = null;
        onChanged();
      } else {
        sender_ = null;
        senderBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.RaftEndpointProto sender = 2;</code>
     */
    public cluster.internal.raft.proto.RaftEndpointProto.Builder getSenderBuilder() {
      
      onChanged();
      return getSenderFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.RaftEndpointProto sender = 2;</code>
     */
    public cluster.internal.raft.proto.RaftEndpointProtoOrBuilder getSenderOrBuilder() {
      if (senderBuilder_ != null) {
        return senderBuilder_.getMessageOrBuilder();
      } else {
        return sender_ == null ?
            cluster.internal.raft.proto.RaftEndpointProto.getDefaultInstance() : sender_;
      }
    }
    /**
     * <code>.proto.RaftEndpointProto sender = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.internal.raft.proto.RaftEndpointProto, cluster.internal.raft.proto.RaftEndpointProto.Builder, cluster.internal.raft.proto.RaftEndpointProtoOrBuilder> 
        getSenderFieldBuilder() {
      if (senderBuilder_ == null) {
        senderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cluster.internal.raft.proto.RaftEndpointProto, cluster.internal.raft.proto.RaftEndpointProto.Builder, cluster.internal.raft.proto.RaftEndpointProtoOrBuilder>(
                getSender(),
                getParentForChildren(),
                isClean());
        sender_ = null;
      }
      return senderBuilder_;
    }

    private int term_ ;
    /**
     * <code>int32 term = 3;</code>
     * @return The term.
     */
    @java.lang.Override
    public int getTerm() {
      return term_;
    }
    /**
     * <code>int32 term = 3;</code>
     * @param value The term to set.
     * @return This builder for chaining.
     */
    public Builder setTerm(int value) {
      
      term_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 term = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTerm() {
      
      term_ = 0;
      onChanged();
      return this;
    }

    private boolean granted_ ;
    /**
     * <code>bool granted = 4;</code>
     * @return The granted.
     */
    @java.lang.Override
    public boolean getGranted() {
      return granted_;
    }
    /**
     * <code>bool granted = 4;</code>
     * @param value The granted to set.
     * @return This builder for chaining.
     */
    public Builder setGranted(boolean value) {
      
      granted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool granted = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGranted() {
      
      granted_ = false;
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


    // @@protoc_insertion_point(builder_scope:proto.PreVoteResponseProto)
  }

  // @@protoc_insertion_point(class_scope:proto.PreVoteResponseProto)
  private static final cluster.internal.raft.proto.PreVoteResponseProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cluster.internal.raft.proto.PreVoteResponseProto();
  }

  public static cluster.internal.raft.proto.PreVoteResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreVoteResponseProto>
      PARSER = new com.google.protobuf.AbstractParser<PreVoteResponseProto>() {
    @java.lang.Override
    public PreVoteResponseProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PreVoteResponseProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreVoteResponseProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cluster.internal.raft.proto.PreVoteResponseProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

