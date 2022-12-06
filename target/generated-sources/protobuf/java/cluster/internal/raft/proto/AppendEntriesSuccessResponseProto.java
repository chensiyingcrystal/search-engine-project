// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.internal.raft.proto;

/**
 * Protobuf type {@code proto.AppendEntriesSuccessResponseProto}
 */
public final class AppendEntriesSuccessResponseProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.AppendEntriesSuccessResponseProto)
    AppendEntriesSuccessResponseProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AppendEntriesSuccessResponseProto.newBuilder() to construct.
  private AppendEntriesSuccessResponseProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppendEntriesSuccessResponseProto() {
    groupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AppendEntriesSuccessResponseProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cluster.internal.raft.proto.RaftRpc.internal_static_proto_AppendEntriesSuccessResponseProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cluster.internal.raft.proto.RaftRpc.internal_static_proto_AppendEntriesSuccessResponseProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cluster.internal.raft.proto.AppendEntriesSuccessResponseProto.class, cluster.internal.raft.proto.AppendEntriesSuccessResponseProto.Builder.class);
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

  public static final int LASTLOGINDEX_FIELD_NUMBER = 4;
  private long lastLogIndex_;
  /**
   * <code>int64 lastLogIndex = 4;</code>
   * @return The lastLogIndex.
   */
  @java.lang.Override
  public long getLastLogIndex() {
    return lastLogIndex_;
  }

  public static final int QUERYSEQUENCENUMBER_FIELD_NUMBER = 5;
  private long querySequenceNumber_;
  /**
   * <code>int64 querySequenceNumber = 5;</code>
   * @return The querySequenceNumber.
   */
  @java.lang.Override
  public long getQuerySequenceNumber() {
    return querySequenceNumber_;
  }

  public static final int FLOWCONTROLSEQUENCENUMBER_FIELD_NUMBER = 6;
  private long flowControlSequenceNumber_;
  /**
   * <code>int64 flowControlSequenceNumber = 6;</code>
   * @return The flowControlSequenceNumber.
   */
  @java.lang.Override
  public long getFlowControlSequenceNumber() {
    return flowControlSequenceNumber_;
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
    if (lastLogIndex_ != 0L) {
      output.writeInt64(4, lastLogIndex_);
    }
    if (querySequenceNumber_ != 0L) {
      output.writeInt64(5, querySequenceNumber_);
    }
    if (flowControlSequenceNumber_ != 0L) {
      output.writeInt64(6, flowControlSequenceNumber_);
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
    if (lastLogIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, lastLogIndex_);
    }
    if (querySequenceNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, querySequenceNumber_);
    }
    if (flowControlSequenceNumber_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, flowControlSequenceNumber_);
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
    if (!(obj instanceof cluster.internal.raft.proto.AppendEntriesSuccessResponseProto)) {
      return super.equals(obj);
    }
    cluster.internal.raft.proto.AppendEntriesSuccessResponseProto other = (cluster.internal.raft.proto.AppendEntriesSuccessResponseProto) obj;

    if (!getGroupId()
        .equals(other.getGroupId())) return false;
    if (hasSender() != other.hasSender()) return false;
    if (hasSender()) {
      if (!getSender()
          .equals(other.getSender())) return false;
    }
    if (getTerm()
        != other.getTerm()) return false;
    if (getLastLogIndex()
        != other.getLastLogIndex()) return false;
    if (getQuerySequenceNumber()
        != other.getQuerySequenceNumber()) return false;
    if (getFlowControlSequenceNumber()
        != other.getFlowControlSequenceNumber()) return false;
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
    hash = (37 * hash) + LASTLOGINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLastLogIndex());
    hash = (37 * hash) + QUERYSEQUENCENUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQuerySequenceNumber());
    hash = (37 * hash) + FLOWCONTROLSEQUENCENUMBER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFlowControlSequenceNumber());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cluster.internal.raft.proto.AppendEntriesSuccessResponseProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.AppendEntriesSuccessResponseProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.AppendEntriesSuccessResponseProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.AppendEntriesSuccessResponseProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.AppendEntriesSuccessResponseProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.AppendEntriesSuccessResponseProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.AppendEntriesSuccessResponseProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.AppendEntriesSuccessResponseProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.internal.raft.proto.AppendEntriesSuccessResponseProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.AppendEntriesSuccessResponseProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.internal.raft.proto.AppendEntriesSuccessResponseProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.AppendEntriesSuccessResponseProto parseFrom(
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
  public static Builder newBuilder(cluster.internal.raft.proto.AppendEntriesSuccessResponseProto prototype) {
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
   * Protobuf type {@code proto.AppendEntriesSuccessResponseProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.AppendEntriesSuccessResponseProto)
      cluster.internal.raft.proto.AppendEntriesSuccessResponseProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_AppendEntriesSuccessResponseProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_AppendEntriesSuccessResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cluster.internal.raft.proto.AppendEntriesSuccessResponseProto.class, cluster.internal.raft.proto.AppendEntriesSuccessResponseProto.Builder.class);
    }

    // Construct using cluster.internal.raft.proto.AppendEntriesSuccessResponseProto.newBuilder()
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

      lastLogIndex_ = 0L;

      querySequenceNumber_ = 0L;

      flowControlSequenceNumber_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_AppendEntriesSuccessResponseProto_descriptor;
    }

    @java.lang.Override
    public cluster.internal.raft.proto.AppendEntriesSuccessResponseProto getDefaultInstanceForType() {
      return cluster.internal.raft.proto.AppendEntriesSuccessResponseProto.getDefaultInstance();
    }

    @java.lang.Override
    public cluster.internal.raft.proto.AppendEntriesSuccessResponseProto build() {
      cluster.internal.raft.proto.AppendEntriesSuccessResponseProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cluster.internal.raft.proto.AppendEntriesSuccessResponseProto buildPartial() {
      cluster.internal.raft.proto.AppendEntriesSuccessResponseProto result = new cluster.internal.raft.proto.AppendEntriesSuccessResponseProto(this);
      result.groupId_ = groupId_;
      if (senderBuilder_ == null) {
        result.sender_ = sender_;
      } else {
        result.sender_ = senderBuilder_.build();
      }
      result.term_ = term_;
      result.lastLogIndex_ = lastLogIndex_;
      result.querySequenceNumber_ = querySequenceNumber_;
      result.flowControlSequenceNumber_ = flowControlSequenceNumber_;
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
      if (other instanceof cluster.internal.raft.proto.AppendEntriesSuccessResponseProto) {
        return mergeFrom((cluster.internal.raft.proto.AppendEntriesSuccessResponseProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cluster.internal.raft.proto.AppendEntriesSuccessResponseProto other) {
      if (other == cluster.internal.raft.proto.AppendEntriesSuccessResponseProto.getDefaultInstance()) return this;
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
      if (other.getLastLogIndex() != 0L) {
        setLastLogIndex(other.getLastLogIndex());
      }
      if (other.getQuerySequenceNumber() != 0L) {
        setQuerySequenceNumber(other.getQuerySequenceNumber());
      }
      if (other.getFlowControlSequenceNumber() != 0L) {
        setFlowControlSequenceNumber(other.getFlowControlSequenceNumber());
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
              lastLogIndex_ = input.readInt64();

              break;
            } // case 32
            case 40: {
              querySequenceNumber_ = input.readInt64();

              break;
            } // case 40
            case 48: {
              flowControlSequenceNumber_ = input.readInt64();

              break;
            } // case 48
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

    private long lastLogIndex_ ;
    /**
     * <code>int64 lastLogIndex = 4;</code>
     * @return The lastLogIndex.
     */
    @java.lang.Override
    public long getLastLogIndex() {
      return lastLogIndex_;
    }
    /**
     * <code>int64 lastLogIndex = 4;</code>
     * @param value The lastLogIndex to set.
     * @return This builder for chaining.
     */
    public Builder setLastLogIndex(long value) {
      
      lastLogIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 lastLogIndex = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastLogIndex() {
      
      lastLogIndex_ = 0L;
      onChanged();
      return this;
    }

    private long querySequenceNumber_ ;
    /**
     * <code>int64 querySequenceNumber = 5;</code>
     * @return The querySequenceNumber.
     */
    @java.lang.Override
    public long getQuerySequenceNumber() {
      return querySequenceNumber_;
    }
    /**
     * <code>int64 querySequenceNumber = 5;</code>
     * @param value The querySequenceNumber to set.
     * @return This builder for chaining.
     */
    public Builder setQuerySequenceNumber(long value) {
      
      querySequenceNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 querySequenceNumber = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuerySequenceNumber() {
      
      querySequenceNumber_ = 0L;
      onChanged();
      return this;
    }

    private long flowControlSequenceNumber_ ;
    /**
     * <code>int64 flowControlSequenceNumber = 6;</code>
     * @return The flowControlSequenceNumber.
     */
    @java.lang.Override
    public long getFlowControlSequenceNumber() {
      return flowControlSequenceNumber_;
    }
    /**
     * <code>int64 flowControlSequenceNumber = 6;</code>
     * @param value The flowControlSequenceNumber to set.
     * @return This builder for chaining.
     */
    public Builder setFlowControlSequenceNumber(long value) {
      
      flowControlSequenceNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 flowControlSequenceNumber = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFlowControlSequenceNumber() {
      
      flowControlSequenceNumber_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:proto.AppendEntriesSuccessResponseProto)
  }

  // @@protoc_insertion_point(class_scope:proto.AppendEntriesSuccessResponseProto)
  private static final cluster.internal.raft.proto.AppendEntriesSuccessResponseProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cluster.internal.raft.proto.AppendEntriesSuccessResponseProto();
  }

  public static cluster.internal.raft.proto.AppendEntriesSuccessResponseProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AppendEntriesSuccessResponseProto>
      PARSER = new com.google.protobuf.AbstractParser<AppendEntriesSuccessResponseProto>() {
    @java.lang.Override
    public AppendEntriesSuccessResponseProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<AppendEntriesSuccessResponseProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppendEntriesSuccessResponseProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cluster.internal.raft.proto.AppendEntriesSuccessResponseProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

