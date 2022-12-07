// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.internal.raft.proto;

/**
 * Protobuf type {@code proto.ShardEntry}
 */
public final class ShardEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ShardEntry)
    ShardEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShardEntry.newBuilder() to construct.
  private ShardEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShardEntry() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShardEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cluster.internal.raft.proto.RaftRpc.internal_static_proto_ShardEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cluster.internal.raft.proto.RaftRpc.internal_static_proto_ShardEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cluster.internal.raft.proto.ShardEntry.class, cluster.internal.raft.proto.ShardEntry.Builder.class);
  }

  public static final int SHARDINFO_FIELD_NUMBER = 1;
  private cluster.external.shard.proto.ShardInfo shardInfo_;
  /**
   * <code>.proto.ShardInfo shardInfo = 1;</code>
   * @return Whether the shardInfo field is set.
   */
  @java.lang.Override
  public boolean hasShardInfo() {
    return shardInfo_ != null;
  }
  /**
   * <code>.proto.ShardInfo shardInfo = 1;</code>
   * @return The shardInfo.
   */
  @java.lang.Override
  public cluster.external.shard.proto.ShardInfo getShardInfo() {
    return shardInfo_ == null ? cluster.external.shard.proto.ShardInfo.getDefaultInstance() : shardInfo_;
  }
  /**
   * <code>.proto.ShardInfo shardInfo = 1;</code>
   */
  @java.lang.Override
  public cluster.external.shard.proto.ShardInfoOrBuilder getShardInfoOrBuilder() {
    return getShardInfo();
  }

  public static final int SHARDINFOWITHDATANODEINFO_FIELD_NUMBER = 2;
  private cluster.external.shard.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo_;
  /**
   * <code>.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 2;</code>
   * @return Whether the shardInfoWithDataNodeInfo field is set.
   */
  @java.lang.Override
  public boolean hasShardInfoWithDataNodeInfo() {
    return shardInfoWithDataNodeInfo_ != null;
  }
  /**
   * <code>.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 2;</code>
   * @return The shardInfoWithDataNodeInfo.
   */
  @java.lang.Override
  public cluster.external.shard.proto.ShardInfoWithDataNodeInfo getShardInfoWithDataNodeInfo() {
    return shardInfoWithDataNodeInfo_ == null ? cluster.external.shard.proto.ShardInfoWithDataNodeInfo.getDefaultInstance() : shardInfoWithDataNodeInfo_;
  }
  /**
   * <code>.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 2;</code>
   */
  @java.lang.Override
  public cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder getShardInfoWithDataNodeInfoOrBuilder() {
    return getShardInfoWithDataNodeInfo();
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
    if (shardInfo_ != null) {
      output.writeMessage(1, getShardInfo());
    }
    if (shardInfoWithDataNodeInfo_ != null) {
      output.writeMessage(2, getShardInfoWithDataNodeInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (shardInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getShardInfo());
    }
    if (shardInfoWithDataNodeInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getShardInfoWithDataNodeInfo());
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
    if (!(obj instanceof cluster.internal.raft.proto.ShardEntry)) {
      return super.equals(obj);
    }
    cluster.internal.raft.proto.ShardEntry other = (cluster.internal.raft.proto.ShardEntry) obj;

    if (hasShardInfo() != other.hasShardInfo()) return false;
    if (hasShardInfo()) {
      if (!getShardInfo()
          .equals(other.getShardInfo())) return false;
    }
    if (hasShardInfoWithDataNodeInfo() != other.hasShardInfoWithDataNodeInfo()) return false;
    if (hasShardInfoWithDataNodeInfo()) {
      if (!getShardInfoWithDataNodeInfo()
          .equals(other.getShardInfoWithDataNodeInfo())) return false;
    }
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
    if (hasShardInfo()) {
      hash = (37 * hash) + SHARDINFO_FIELD_NUMBER;
      hash = (53 * hash) + getShardInfo().hashCode();
    }
    if (hasShardInfoWithDataNodeInfo()) {
      hash = (37 * hash) + SHARDINFOWITHDATANODEINFO_FIELD_NUMBER;
      hash = (53 * hash) + getShardInfoWithDataNodeInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cluster.internal.raft.proto.ShardEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.ShardEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.ShardEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.ShardEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.ShardEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.ShardEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.ShardEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.ShardEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.internal.raft.proto.ShardEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.ShardEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.internal.raft.proto.ShardEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.ShardEntry parseFrom(
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
  public static Builder newBuilder(cluster.internal.raft.proto.ShardEntry prototype) {
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
   * Protobuf type {@code proto.ShardEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ShardEntry)
      cluster.internal.raft.proto.ShardEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_ShardEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_ShardEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cluster.internal.raft.proto.ShardEntry.class, cluster.internal.raft.proto.ShardEntry.Builder.class);
    }

    // Construct using cluster.internal.raft.proto.ShardEntry.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (shardInfoBuilder_ == null) {
        shardInfo_ = null;
      } else {
        shardInfo_ = null;
        shardInfoBuilder_ = null;
      }
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        shardInfoWithDataNodeInfo_ = null;
      } else {
        shardInfoWithDataNodeInfo_ = null;
        shardInfoWithDataNodeInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_ShardEntry_descriptor;
    }

    @java.lang.Override
    public cluster.internal.raft.proto.ShardEntry getDefaultInstanceForType() {
      return cluster.internal.raft.proto.ShardEntry.getDefaultInstance();
    }

    @java.lang.Override
    public cluster.internal.raft.proto.ShardEntry build() {
      cluster.internal.raft.proto.ShardEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cluster.internal.raft.proto.ShardEntry buildPartial() {
      cluster.internal.raft.proto.ShardEntry result = new cluster.internal.raft.proto.ShardEntry(this);
      if (shardInfoBuilder_ == null) {
        result.shardInfo_ = shardInfo_;
      } else {
        result.shardInfo_ = shardInfoBuilder_.build();
      }
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
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
      if (other instanceof cluster.internal.raft.proto.ShardEntry) {
        return mergeFrom((cluster.internal.raft.proto.ShardEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cluster.internal.raft.proto.ShardEntry other) {
      if (other == cluster.internal.raft.proto.ShardEntry.getDefaultInstance()) return this;
      if (other.hasShardInfo()) {
        mergeShardInfo(other.getShardInfo());
      }
      if (other.hasShardInfoWithDataNodeInfo()) {
        mergeShardInfoWithDataNodeInfo(other.getShardInfoWithDataNodeInfo());
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
              input.readMessage(
                  getShardInfoFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getShardInfoWithDataNodeInfoFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
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

    private cluster.external.shard.proto.ShardInfo shardInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.external.shard.proto.ShardInfo, cluster.external.shard.proto.ShardInfo.Builder, cluster.external.shard.proto.ShardInfoOrBuilder> shardInfoBuilder_;
    /**
     * <code>.proto.ShardInfo shardInfo = 1;</code>
     * @return Whether the shardInfo field is set.
     */
    public boolean hasShardInfo() {
      return shardInfoBuilder_ != null || shardInfo_ != null;
    }
    /**
     * <code>.proto.ShardInfo shardInfo = 1;</code>
     * @return The shardInfo.
     */
    public cluster.external.shard.proto.ShardInfo getShardInfo() {
      if (shardInfoBuilder_ == null) {
        return shardInfo_ == null ? cluster.external.shard.proto.ShardInfo.getDefaultInstance() : shardInfo_;
      } else {
        return shardInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.ShardInfo shardInfo = 1;</code>
     */
    public Builder setShardInfo(cluster.external.shard.proto.ShardInfo value) {
      if (shardInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shardInfo_ = value;
        onChanged();
      } else {
        shardInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.ShardInfo shardInfo = 1;</code>
     */
    public Builder setShardInfo(
        cluster.external.shard.proto.ShardInfo.Builder builderForValue) {
      if (shardInfoBuilder_ == null) {
        shardInfo_ = builderForValue.build();
        onChanged();
      } else {
        shardInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.ShardInfo shardInfo = 1;</code>
     */
    public Builder mergeShardInfo(cluster.external.shard.proto.ShardInfo value) {
      if (shardInfoBuilder_ == null) {
        if (shardInfo_ != null) {
          shardInfo_ =
            cluster.external.shard.proto.ShardInfo.newBuilder(shardInfo_).mergeFrom(value).buildPartial();
        } else {
          shardInfo_ = value;
        }
        onChanged();
      } else {
        shardInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.ShardInfo shardInfo = 1;</code>
     */
    public Builder clearShardInfo() {
      if (shardInfoBuilder_ == null) {
        shardInfo_ = null;
        onChanged();
      } else {
        shardInfo_ = null;
        shardInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.ShardInfo shardInfo = 1;</code>
     */
    public cluster.external.shard.proto.ShardInfo.Builder getShardInfoBuilder() {
      
      onChanged();
      return getShardInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.ShardInfo shardInfo = 1;</code>
     */
    public cluster.external.shard.proto.ShardInfoOrBuilder getShardInfoOrBuilder() {
      if (shardInfoBuilder_ != null) {
        return shardInfoBuilder_.getMessageOrBuilder();
      } else {
        return shardInfo_ == null ?
            cluster.external.shard.proto.ShardInfo.getDefaultInstance() : shardInfo_;
      }
    }
    /**
     * <code>.proto.ShardInfo shardInfo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.external.shard.proto.ShardInfo, cluster.external.shard.proto.ShardInfo.Builder, cluster.external.shard.proto.ShardInfoOrBuilder> 
        getShardInfoFieldBuilder() {
      if (shardInfoBuilder_ == null) {
        shardInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cluster.external.shard.proto.ShardInfo, cluster.external.shard.proto.ShardInfo.Builder, cluster.external.shard.proto.ShardInfoOrBuilder>(
                getShardInfo(),
                getParentForChildren(),
                isClean());
        shardInfo_ = null;
      }
      return shardInfoBuilder_;
    }

    private cluster.external.shard.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.external.shard.proto.ShardInfoWithDataNodeInfo, cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder, cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder> shardInfoWithDataNodeInfoBuilder_;
    /**
     * <code>.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 2;</code>
     * @return Whether the shardInfoWithDataNodeInfo field is set.
     */
    public boolean hasShardInfoWithDataNodeInfo() {
      return shardInfoWithDataNodeInfoBuilder_ != null || shardInfoWithDataNodeInfo_ != null;
    }
    /**
     * <code>.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 2;</code>
     * @return The shardInfoWithDataNodeInfo.
     */
    public cluster.external.shard.proto.ShardInfoWithDataNodeInfo getShardInfoWithDataNodeInfo() {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        return shardInfoWithDataNodeInfo_ == null ? cluster.external.shard.proto.ShardInfoWithDataNodeInfo.getDefaultInstance() : shardInfoWithDataNodeInfo_;
      } else {
        return shardInfoWithDataNodeInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 2;</code>
     */
    public Builder setShardInfoWithDataNodeInfo(cluster.external.shard.proto.ShardInfoWithDataNodeInfo value) {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shardInfoWithDataNodeInfo_ = value;
        onChanged();
      } else {
        shardInfoWithDataNodeInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 2;</code>
     */
    public Builder setShardInfoWithDataNodeInfo(
        cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder builderForValue) {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        shardInfoWithDataNodeInfo_ = builderForValue.build();
        onChanged();
      } else {
        shardInfoWithDataNodeInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 2;</code>
     */
    public Builder mergeShardInfoWithDataNodeInfo(cluster.external.shard.proto.ShardInfoWithDataNodeInfo value) {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        if (shardInfoWithDataNodeInfo_ != null) {
          shardInfoWithDataNodeInfo_ =
            cluster.external.shard.proto.ShardInfoWithDataNodeInfo.newBuilder(shardInfoWithDataNodeInfo_).mergeFrom(value).buildPartial();
        } else {
          shardInfoWithDataNodeInfo_ = value;
        }
        onChanged();
      } else {
        shardInfoWithDataNodeInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 2;</code>
     */
    public Builder clearShardInfoWithDataNodeInfo() {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        shardInfoWithDataNodeInfo_ = null;
        onChanged();
      } else {
        shardInfoWithDataNodeInfo_ = null;
        shardInfoWithDataNodeInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 2;</code>
     */
    public cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder getShardInfoWithDataNodeInfoBuilder() {
      
      onChanged();
      return getShardInfoWithDataNodeInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 2;</code>
     */
    public cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder getShardInfoWithDataNodeInfoOrBuilder() {
      if (shardInfoWithDataNodeInfoBuilder_ != null) {
        return shardInfoWithDataNodeInfoBuilder_.getMessageOrBuilder();
      } else {
        return shardInfoWithDataNodeInfo_ == null ?
            cluster.external.shard.proto.ShardInfoWithDataNodeInfo.getDefaultInstance() : shardInfoWithDataNodeInfo_;
      }
    }
    /**
     * <code>.proto.ShardInfoWithDataNodeInfo shardInfoWithDataNodeInfo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.external.shard.proto.ShardInfoWithDataNodeInfo, cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder, cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder> 
        getShardInfoWithDataNodeInfoFieldBuilder() {
      if (shardInfoWithDataNodeInfoBuilder_ == null) {
        shardInfoWithDataNodeInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cluster.external.shard.proto.ShardInfoWithDataNodeInfo, cluster.external.shard.proto.ShardInfoWithDataNodeInfo.Builder, cluster.external.shard.proto.ShardInfoWithDataNodeInfoOrBuilder>(
                getShardInfoWithDataNodeInfo(),
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


    // @@protoc_insertion_point(builder_scope:proto.ShardEntry)
  }

  // @@protoc_insertion_point(class_scope:proto.ShardEntry)
  private static final cluster.internal.raft.proto.ShardEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cluster.internal.raft.proto.ShardEntry();
  }

  public static cluster.internal.raft.proto.ShardEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShardEntry>
      PARSER = new com.google.protobuf.AbstractParser<ShardEntry>() {
    @java.lang.Override
    public ShardEntry parsePartialFrom(
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

  public static com.google.protobuf.Parser<ShardEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShardEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cluster.internal.raft.proto.ShardEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
