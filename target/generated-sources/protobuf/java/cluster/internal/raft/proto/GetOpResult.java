// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.internal.raft.proto;

/**
 * Protobuf type {@code proto.GetOpResult}
 */
public final class GetOpResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GetOpResult)
    GetOpResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetOpResult.newBuilder() to construct.
  private GetOpResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetOpResult() {
    shardInfoWithDataNodeInfo_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetOpResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cluster.internal.raft.proto.RaftRpc.internal_static_proto_GetOpResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cluster.internal.raft.proto.RaftRpc.internal_static_proto_GetOpResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cluster.internal.raft.proto.GetOpResult.class, cluster.internal.raft.proto.GetOpResult.Builder.class);
  }

  public static final int SHARDINFOWITHDATANODEINFO_FIELD_NUMBER = 1;
  private java.util.List<cluster.external.shard.proto.ShardInfoWithDataNodeInfo> shardInfoWithDataNodeInfo_;
  /**
   * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
   */
  @java.lang.Override
  public java.util.List<cluster.external.shard.proto.ShardInfoWithDataNodeInfo> getShardInfoWithDataNodeInfoList() {
    return shardInfoWithDataNodeInfo_;
  }
  /**
   * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder> 
      getShardInfoWithDataNodeInfoOrBuilderList() {
    return shardInfoWithDataNodeInfo_;
  }
  /**
   * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
   */
  @java.lang.Override
  public int getShardInfoWithDataNodeInfoCount() {
    return shardInfoWithDataNodeInfo_.size();
  }
  /**
   * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
   */
  @java.lang.Override
  public cluster.external.shard.proto.ShardInfoWithDataNodeInfo getShardInfoWithDataNodeInfo(int index) {
    return shardInfoWithDataNodeInfo_.get(index);
  }
  /**
   * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
   */
  @java.lang.Override
  public cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder getShardInfoWithDataNodeInfoOrBuilder(
      int index) {
    return shardInfoWithDataNodeInfo_.get(index);
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
    for (int i = 0; i < shardInfoWithDataNodeInfo_.size(); i++) {
      output.writeMessage(1, shardInfoWithDataNodeInfo_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < shardInfoWithDataNodeInfo_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, shardInfoWithDataNodeInfo_.get(i));
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
    if (!(obj instanceof cluster.internal.raft.proto.GetOpResult)) {
      return super.equals(obj);
    }
    cluster.internal.raft.proto.GetOpResult other = (cluster.internal.raft.proto.GetOpResult) obj;

    if (!getShardInfoWithDataNodeInfoList()
        .equals(other.getShardInfoWithDataNodeInfoList())) return false;
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
    if (getShardInfoWithDataNodeInfoCount() > 0) {
      hash = (37 * hash) + SHARDINFOWITHDATANODEINFO_FIELD_NUMBER;
      hash = (53 * hash) + getShardInfoWithDataNodeInfoList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cluster.internal.raft.proto.GetOpResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.GetOpResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.GetOpResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.GetOpResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.GetOpResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.GetOpResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.GetOpResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.GetOpResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.internal.raft.proto.GetOpResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.GetOpResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.internal.raft.proto.GetOpResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.GetOpResult parseFrom(
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
  public static Builder newBuilder(cluster.internal.raft.proto.GetOpResult prototype) {
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
   * Protobuf type {@code proto.GetOpResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.GetOpResult)
      cluster.internal.raft.proto.GetOpResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_GetOpResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_GetOpResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cluster.internal.raft.proto.GetOpResult.class, cluster.internal.raft.proto.GetOpResult.Builder.class);
    }

    // Construct using cluster.internal.raft.proto.GetOpResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        shardInfoWithDataNodeInfo_ = java.util.Collections.emptyList();
      } else {
        shardInfoWithDataNodeInfo_ = null;
        shardInfoWithDataNodeInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_GetOpResult_descriptor;
    }

    @java.lang.Override
    public cluster.internal.raft.proto.GetOpResult getDefaultInstanceForType() {
      return cluster.internal.raft.proto.GetOpResult.getDefaultInstance();
    }

    @java.lang.Override
    public cluster.internal.raft.proto.GetOpResult build() {
      cluster.internal.raft.proto.GetOpResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cluster.internal.raft.proto.GetOpResult buildPartial() {
      cluster.internal.raft.proto.GetOpResult result = new cluster.internal.raft.proto.GetOpResult(this);
      int from_bitField0_ = bitField0_;
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          shardInfoWithDataNodeInfo_ = java.util.Collections.unmodifiableList(shardInfoWithDataNodeInfo_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.shardInfoWithDataNodeInfo_ = shardInfoWithDataNodeInfo_;
      } else {
        result.shardInfoWithDataNodeInfo_ = shardInfoWithDataNodeInfoBuilder_.build();
      }
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
      if (other instanceof cluster.internal.raft.proto.GetOpResult) {
        return mergeFrom((cluster.internal.raft.proto.GetOpResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cluster.internal.raft.proto.GetOpResult other) {
      if (other == cluster.internal.raft.proto.GetOpResult.getDefaultInstance()) return this;
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        if (!other.shardInfoWithDataNodeInfo_.isEmpty()) {
          if (shardInfoWithDataNodeInfo_.isEmpty()) {
            shardInfoWithDataNodeInfo_ = other.shardInfoWithDataNodeInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureShardInfoWithDataNodeInfoIsMutable();
            shardInfoWithDataNodeInfo_.addAll(other.shardInfoWithDataNodeInfo_);
          }
          onChanged();
        }
      } else {
        if (!other.shardInfoWithDataNodeInfo_.isEmpty()) {
          if (shardInfoWithDataNodeInfoBuilder_.isEmpty()) {
            shardInfoWithDataNodeInfoBuilder_.dispose();
            shardInfoWithDataNodeInfoBuilder_ = null;
            shardInfoWithDataNodeInfo_ = other.shardInfoWithDataNodeInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
            shardInfoWithDataNodeInfoBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getShardInfoWithDataNodeInfoFieldBuilder() : null;
          } else {
            shardInfoWithDataNodeInfoBuilder_.addAllMessages(other.shardInfoWithDataNodeInfo_);
          }
        }
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
              cluster.external.shard.proto.ShardInfoWithDataNodeInfo m =
                  input.readMessage(
                      cluster.external.shard.proto.ShardInfoWithDataNodeInfo.parser(),
                      extensionRegistry);
              if (shardInfoWithDataNodeInfoBuilder_ == null) {
                ensureShardInfoWithDataNodeInfoIsMutable();
                shardInfoWithDataNodeInfo_.add(m);
              } else {
                shardInfoWithDataNodeInfoBuilder_.addMessage(m);
              }
              break;
            } // case 10
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
    private int bitField0_;

    private java.util.List<cluster.external.shard.proto.ShardInfoWithDataNodeInfo> shardInfoWithDataNodeInfo_ =
      java.util.Collections.emptyList();
    private void ensureShardInfoWithDataNodeInfoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        shardInfoWithDataNodeInfo_ = new java.util.ArrayList<cluster.external.shard.proto.ShardInfoWithDataNodeInfo>(shardInfoWithDataNodeInfo_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cluster.external.shard.proto.ShardInfoWithDataNodeInfo, cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder, cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder> shardInfoWithDataNodeInfoBuilder_;

    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public java.util.List<cluster.external.shard.proto.ShardInfoWithDataNodeInfo> getShardInfoWithDataNodeInfoList() {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(shardInfoWithDataNodeInfo_);
      } else {
        return shardInfoWithDataNodeInfoBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public int getShardInfoWithDataNodeInfoCount() {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        return shardInfoWithDataNodeInfo_.size();
      } else {
        return shardInfoWithDataNodeInfoBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public cluster.external.shard.proto.ShardInfoWithDataNodeInfo getShardInfoWithDataNodeInfo(int index) {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        return shardInfoWithDataNodeInfo_.get(index);
      } else {
        return shardInfoWithDataNodeInfoBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public Builder setShardInfoWithDataNodeInfo(
        int index, cluster.external.shard.proto.ShardInfoWithDataNodeInfo value) {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShardInfoWithDataNodeInfoIsMutable();
        shardInfoWithDataNodeInfo_.set(index, value);
        onChanged();
      } else {
        shardInfoWithDataNodeInfoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public Builder setShardInfoWithDataNodeInfo(
        int index, cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder builderForValue) {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        ensureShardInfoWithDataNodeInfoIsMutable();
        shardInfoWithDataNodeInfo_.set(index, builderForValue.build());
        onChanged();
      } else {
        shardInfoWithDataNodeInfoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public Builder addShardInfoWithDataNodeInfo(cluster.external.shard.proto.ShardInfoWithDataNodeInfo value) {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShardInfoWithDataNodeInfoIsMutable();
        shardInfoWithDataNodeInfo_.add(value);
        onChanged();
      } else {
        shardInfoWithDataNodeInfoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public Builder addShardInfoWithDataNodeInfo(
        int index, cluster.external.shard.proto.ShardInfoWithDataNodeInfo value) {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShardInfoWithDataNodeInfoIsMutable();
        shardInfoWithDataNodeInfo_.add(index, value);
        onChanged();
      } else {
        shardInfoWithDataNodeInfoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public Builder addShardInfoWithDataNodeInfo(
        cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder builderForValue) {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        ensureShardInfoWithDataNodeInfoIsMutable();
        shardInfoWithDataNodeInfo_.add(builderForValue.build());
        onChanged();
      } else {
        shardInfoWithDataNodeInfoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public Builder addShardInfoWithDataNodeInfo(
        int index, cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder builderForValue) {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        ensureShardInfoWithDataNodeInfoIsMutable();
        shardInfoWithDataNodeInfo_.add(index, builderForValue.build());
        onChanged();
      } else {
        shardInfoWithDataNodeInfoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public Builder addAllShardInfoWithDataNodeInfo(
        java.lang.Iterable<? extends cluster.external.shard.proto.ShardInfoWithDataNodeInfo> values) {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        ensureShardInfoWithDataNodeInfoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, shardInfoWithDataNodeInfo_);
        onChanged();
      } else {
        shardInfoWithDataNodeInfoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public Builder clearShardInfoWithDataNodeInfo() {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        shardInfoWithDataNodeInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        shardInfoWithDataNodeInfoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public Builder removeShardInfoWithDataNodeInfo(int index) {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        ensureShardInfoWithDataNodeInfoIsMutable();
        shardInfoWithDataNodeInfo_.remove(index);
        onChanged();
      } else {
        shardInfoWithDataNodeInfoBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder getShardInfoWithDataNodeInfoBuilder(
        int index) {
      return getShardInfoWithDataNodeInfoFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder getShardInfoWithDataNodeInfoOrBuilder(
        int index) {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        return shardInfoWithDataNodeInfo_.get(index);  } else {
        return shardInfoWithDataNodeInfoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public java.util.List<? extends cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder> 
         getShardInfoWithDataNodeInfoOrBuilderList() {
      if (shardInfoWithDataNodeInfoBuilder_ != null) {
        return shardInfoWithDataNodeInfoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(shardInfoWithDataNodeInfo_);
      }
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder addShardInfoWithDataNodeInfoBuilder() {
      return getShardInfoWithDataNodeInfoFieldBuilder().addBuilder(
          cluster.external.shard.proto.ShardInfoWithDataNodeInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder addShardInfoWithDataNodeInfoBuilder(
        int index) {
      return getShardInfoWithDataNodeInfoFieldBuilder().addBuilder(
          index, cluster.external.shard.proto.ShardInfoWithDataNodeInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 1;</code>
     */
    public java.util.List<cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder> 
         getShardInfoWithDataNodeInfoBuilderList() {
      return getShardInfoWithDataNodeInfoFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cluster.external.shard.proto.ShardInfoWithDataNodeInfo, cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder, cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder> 
        getShardInfoWithDataNodeInfoFieldBuilder() {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        shardInfoWithDataNodeInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cluster.external.shard.proto.ShardInfoWithDataNodeInfo, cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder, cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder>(
                shardInfoWithDataNodeInfo_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        shardInfoWithDataNodeInfo_ = null;
      }
      return shardInfoWithDataNodeInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.GetOpResult)
  }

  // @@protoc_insertion_point(class_scope:proto.GetOpResult)
  private static final cluster.internal.raft.proto.GetOpResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cluster.internal.raft.proto.GetOpResult();
  }

  public static cluster.internal.raft.proto.GetOpResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetOpResult>
      PARSER = new com.google.protobuf.AbstractParser<GetOpResult>() {
    @java.lang.Override
    public GetOpResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetOpResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetOpResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cluster.internal.raft.proto.GetOpResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

