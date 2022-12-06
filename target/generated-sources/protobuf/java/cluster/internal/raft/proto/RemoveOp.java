// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RaftRpc.proto

package cluster.internal.raft.proto;

/**
 * Protobuf type {@code proto.RemoveOp}
 */
public final class RemoveOp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.RemoveOp)
    RemoveOpOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveOp.newBuilder() to construct.
  private RemoveOp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveOp() {
    key_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveOp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cluster.internal.raft.proto.RaftRpc.internal_static_proto_RemoveOp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cluster.internal.raft.proto.RaftRpc.internal_static_proto_RemoveOp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cluster.internal.raft.proto.RemoveOp.class, cluster.internal.raft.proto.RemoveOp.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object key_;
  /**
   * <code>string key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VAL_FIELD_NUMBER = 2;
  private cluster.external.shard.proto.Val val_;
  /**
   * <code>.proto.Val val = 2;</code>
   * @return Whether the val field is set.
   */
  @java.lang.Override
  public boolean hasVal() {
    return val_ != null;
  }
  /**
   * <code>.proto.Val val = 2;</code>
   * @return The val.
   */
  @java.lang.Override
  public cluster.external.shard.proto.Val getVal() {
    return val_ == null ? cluster.external.shard.proto.Val.getDefaultInstance() : val_;
  }
  /**
   * <code>.proto.Val val = 2;</code>
   */
  @java.lang.Override
  public cluster.external.shard.proto.ValOrBuilder getValOrBuilder() {
    return getVal();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    if (val_ != null) {
      output.writeMessage(2, getVal());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    if (val_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVal());
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
    if (!(obj instanceof cluster.internal.raft.proto.RemoveOp)) {
      return super.equals(obj);
    }
    cluster.internal.raft.proto.RemoveOp other = (cluster.internal.raft.proto.RemoveOp) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (hasVal() != other.hasVal()) return false;
    if (hasVal()) {
      if (!getVal()
          .equals(other.getVal())) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    if (hasVal()) {
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + getVal().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cluster.internal.raft.proto.RemoveOp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.RemoveOp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.RemoveOp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.RemoveOp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.RemoveOp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.internal.raft.proto.RemoveOp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.internal.raft.proto.RemoveOp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.RemoveOp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.internal.raft.proto.RemoveOp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.RemoveOp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.internal.raft.proto.RemoveOp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.internal.raft.proto.RemoveOp parseFrom(
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
  public static Builder newBuilder(cluster.internal.raft.proto.RemoveOp prototype) {
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
   * Protobuf type {@code proto.RemoveOp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.RemoveOp)
      cluster.internal.raft.proto.RemoveOpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_RemoveOp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_RemoveOp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cluster.internal.raft.proto.RemoveOp.class, cluster.internal.raft.proto.RemoveOp.Builder.class);
    }

    // Construct using cluster.internal.raft.proto.RemoveOp.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      key_ = "";

      if (valBuilder_ == null) {
        val_ = null;
      } else {
        val_ = null;
        valBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cluster.internal.raft.proto.RaftRpc.internal_static_proto_RemoveOp_descriptor;
    }

    @java.lang.Override
    public cluster.internal.raft.proto.RemoveOp getDefaultInstanceForType() {
      return cluster.internal.raft.proto.RemoveOp.getDefaultInstance();
    }

    @java.lang.Override
    public cluster.internal.raft.proto.RemoveOp build() {
      cluster.internal.raft.proto.RemoveOp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cluster.internal.raft.proto.RemoveOp buildPartial() {
      cluster.internal.raft.proto.RemoveOp result = new cluster.internal.raft.proto.RemoveOp(this);
      result.key_ = key_;
      if (valBuilder_ == null) {
        result.val_ = val_;
      } else {
        result.val_ = valBuilder_.build();
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
      if (other instanceof cluster.internal.raft.proto.RemoveOp) {
        return mergeFrom((cluster.internal.raft.proto.RemoveOp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cluster.internal.raft.proto.RemoveOp other) {
      if (other == cluster.internal.raft.proto.RemoveOp.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      if (other.hasVal()) {
        mergeVal(other.getVal());
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
              key_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getValFieldBuilder().getBuilder(),
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

    private java.lang.Object key_ = "";
    /**
     * <code>string key = 1;</code>
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
      onChanged();
      return this;
    }

    private cluster.external.shard.proto.Val val_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.external.shard.proto.Val, cluster.external.shard.proto.Val.Builder, cluster.external.shard.proto.ValOrBuilder> valBuilder_;
    /**
     * <code>.proto.Val val = 2;</code>
     * @return Whether the val field is set.
     */
    public boolean hasVal() {
      return valBuilder_ != null || val_ != null;
    }
    /**
     * <code>.proto.Val val = 2;</code>
     * @return The val.
     */
    public cluster.external.shard.proto.Val getVal() {
      if (valBuilder_ == null) {
        return val_ == null ? cluster.external.shard.proto.Val.getDefaultInstance() : val_;
      } else {
        return valBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.Val val = 2;</code>
     */
    public Builder setVal(cluster.external.shard.proto.Val value) {
      if (valBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        val_ = value;
        onChanged();
      } else {
        valBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.Val val = 2;</code>
     */
    public Builder setVal(
        cluster.external.shard.proto.Val.Builder builderForValue) {
      if (valBuilder_ == null) {
        val_ = builderForValue.build();
        onChanged();
      } else {
        valBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.Val val = 2;</code>
     */
    public Builder mergeVal(cluster.external.shard.proto.Val value) {
      if (valBuilder_ == null) {
        if (val_ != null) {
          val_ =
            cluster.external.shard.proto.Val.newBuilder(val_).mergeFrom(value).buildPartial();
        } else {
          val_ = value;
        }
        onChanged();
      } else {
        valBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.Val val = 2;</code>
     */
    public Builder clearVal() {
      if (valBuilder_ == null) {
        val_ = null;
        onChanged();
      } else {
        val_ = null;
        valBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.Val val = 2;</code>
     */
    public cluster.external.shard.proto.Val.Builder getValBuilder() {
      
      onChanged();
      return getValFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.Val val = 2;</code>
     */
    public cluster.external.shard.proto.ValOrBuilder getValOrBuilder() {
      if (valBuilder_ != null) {
        return valBuilder_.getMessageOrBuilder();
      } else {
        return val_ == null ?
            cluster.external.shard.proto.Val.getDefaultInstance() : val_;
      }
    }
    /**
     * <code>.proto.Val val = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.external.shard.proto.Val, cluster.external.shard.proto.Val.Builder, cluster.external.shard.proto.ValOrBuilder> 
        getValFieldBuilder() {
      if (valBuilder_ == null) {
        valBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cluster.external.shard.proto.Val, cluster.external.shard.proto.Val.Builder, cluster.external.shard.proto.ValOrBuilder>(
                getVal(),
                getParentForChildren(),
                isClean());
        val_ = null;
      }
      return valBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.RemoveOp)
  }

  // @@protoc_insertion_point(class_scope:proto.RemoveOp)
  private static final cluster.internal.raft.proto.RemoveOp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cluster.internal.raft.proto.RemoveOp();
  }

  public static cluster.internal.raft.proto.RemoveOp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveOp>
      PARSER = new com.google.protobuf.AbstractParser<RemoveOp>() {
    @java.lang.Override
    public RemoveOp parsePartialFrom(
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

  public static com.google.protobuf.Parser<RemoveOp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveOp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cluster.internal.raft.proto.RemoveOp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

