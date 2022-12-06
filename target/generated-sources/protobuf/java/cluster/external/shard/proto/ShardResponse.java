// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ShardRequest.proto

package cluster.external.shard.proto;

/**
 * Protobuf type {@code proto.ShardResponse}
 */
public final class ShardResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ShardResponse)
    ShardResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShardResponse.newBuilder() to construct.
  private ShardResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShardResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShardResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cluster.external.shard.proto.ShardRequest.internal_static_proto_ShardResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cluster.external.shard.proto.ShardRequest.internal_static_proto_ShardResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cluster.external.shard.proto.ShardResponse.class, cluster.external.shard.proto.ShardResponse.Builder.class);
  }

  private int resultCase_ = 0;
  private java.lang.Object result_;
  public enum ResultCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    COMMONRESPONSE(2),
    GETSHARDRESPONSE(3),
    RESULT_NOT_SET(0);
    private final int value;
    private ResultCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResultCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResultCase forNumber(int value) {
      switch (value) {
        case 2: return COMMONRESPONSE;
        case 3: return GETSHARDRESPONSE;
        case 0: return RESULT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ResultCase
  getResultCase() {
    return ResultCase.forNumber(
        resultCase_);
  }

  public static final int COMMITINDEX_FIELD_NUMBER = 1;
  private long commitIndex_;
  /**
   * <code>int64 commitIndex = 1;</code>
   * @return The commitIndex.
   */
  @java.lang.Override
  public long getCommitIndex() {
    return commitIndex_;
  }

  public static final int COMMONRESPONSE_FIELD_NUMBER = 2;
  /**
   * <code>.proto.CommonResponse commonResponse = 2;</code>
   * @return Whether the commonResponse field is set.
   */
  @java.lang.Override
  public boolean hasCommonResponse() {
    return resultCase_ == 2;
  }
  /**
   * <code>.proto.CommonResponse commonResponse = 2;</code>
   * @return The commonResponse.
   */
  @java.lang.Override
  public cluster.external.shard.proto.CommonResponse getCommonResponse() {
    if (resultCase_ == 2) {
       return (cluster.external.shard.proto.CommonResponse) result_;
    }
    return cluster.external.shard.proto.CommonResponse.getDefaultInstance();
  }
  /**
   * <code>.proto.CommonResponse commonResponse = 2;</code>
   */
  @java.lang.Override
  public cluster.external.shard.proto.CommonResponseOrBuilder getCommonResponseOrBuilder() {
    if (resultCase_ == 2) {
       return (cluster.external.shard.proto.CommonResponse) result_;
    }
    return cluster.external.shard.proto.CommonResponse.getDefaultInstance();
  }

  public static final int GETSHARDRESPONSE_FIELD_NUMBER = 3;
  /**
   * <code>.proto.GetShardResponse getShardResponse = 3;</code>
   * @return Whether the getShardResponse field is set.
   */
  @java.lang.Override
  public boolean hasGetShardResponse() {
    return resultCase_ == 3;
  }
  /**
   * <code>.proto.GetShardResponse getShardResponse = 3;</code>
   * @return The getShardResponse.
   */
  @java.lang.Override
  public cluster.external.shard.proto.GetShardResponse getGetShardResponse() {
    if (resultCase_ == 3) {
       return (cluster.external.shard.proto.GetShardResponse) result_;
    }
    return cluster.external.shard.proto.GetShardResponse.getDefaultInstance();
  }
  /**
   * <code>.proto.GetShardResponse getShardResponse = 3;</code>
   */
  @java.lang.Override
  public cluster.external.shard.proto.GetShardResponseOrBuilder getGetShardResponseOrBuilder() {
    if (resultCase_ == 3) {
       return (cluster.external.shard.proto.GetShardResponse) result_;
    }
    return cluster.external.shard.proto.GetShardResponse.getDefaultInstance();
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
    if (commitIndex_ != 0L) {
      output.writeInt64(1, commitIndex_);
    }
    if (resultCase_ == 2) {
      output.writeMessage(2, (cluster.external.shard.proto.CommonResponse) result_);
    }
    if (resultCase_ == 3) {
      output.writeMessage(3, (cluster.external.shard.proto.GetShardResponse) result_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (commitIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, commitIndex_);
    }
    if (resultCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (cluster.external.shard.proto.CommonResponse) result_);
    }
    if (resultCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (cluster.external.shard.proto.GetShardResponse) result_);
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
    if (!(obj instanceof cluster.external.shard.proto.ShardResponse)) {
      return super.equals(obj);
    }
    cluster.external.shard.proto.ShardResponse other = (cluster.external.shard.proto.ShardResponse) obj;

    if (getCommitIndex()
        != other.getCommitIndex()) return false;
    if (!getResultCase().equals(other.getResultCase())) return false;
    switch (resultCase_) {
      case 2:
        if (!getCommonResponse()
            .equals(other.getCommonResponse())) return false;
        break;
      case 3:
        if (!getGetShardResponse()
            .equals(other.getGetShardResponse())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + COMMITINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCommitIndex());
    switch (resultCase_) {
      case 2:
        hash = (37 * hash) + COMMONRESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getCommonResponse().hashCode();
        break;
      case 3:
        hash = (37 * hash) + GETSHARDRESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getGetShardResponse().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cluster.external.shard.proto.ShardResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.external.shard.proto.ShardResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.external.shard.proto.ShardResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.external.shard.proto.ShardResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.external.shard.proto.ShardResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cluster.external.shard.proto.ShardResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cluster.external.shard.proto.ShardResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.external.shard.proto.ShardResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.external.shard.proto.ShardResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cluster.external.shard.proto.ShardResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cluster.external.shard.proto.ShardResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cluster.external.shard.proto.ShardResponse parseFrom(
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
  public static Builder newBuilder(cluster.external.shard.proto.ShardResponse prototype) {
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
   * Protobuf type {@code proto.ShardResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ShardResponse)
      cluster.external.shard.proto.ShardResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cluster.external.shard.proto.ShardRequest.internal_static_proto_ShardResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cluster.external.shard.proto.ShardRequest.internal_static_proto_ShardResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cluster.external.shard.proto.ShardResponse.class, cluster.external.shard.proto.ShardResponse.Builder.class);
    }

    // Construct using cluster.external.shard.proto.ShardResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      commitIndex_ = 0L;

      if (commonResponseBuilder_ != null) {
        commonResponseBuilder_.clear();
      }
      if (getShardResponseBuilder_ != null) {
        getShardResponseBuilder_.clear();
      }
      resultCase_ = 0;
      result_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cluster.external.shard.proto.ShardRequest.internal_static_proto_ShardResponse_descriptor;
    }

    @java.lang.Override
    public cluster.external.shard.proto.ShardResponse getDefaultInstanceForType() {
      return cluster.external.shard.proto.ShardResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cluster.external.shard.proto.ShardResponse build() {
      cluster.external.shard.proto.ShardResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cluster.external.shard.proto.ShardResponse buildPartial() {
      cluster.external.shard.proto.ShardResponse result = new cluster.external.shard.proto.ShardResponse(this);
      result.commitIndex_ = commitIndex_;
      if (resultCase_ == 2) {
        if (commonResponseBuilder_ == null) {
          result.result_ = result_;
        } else {
          result.result_ = commonResponseBuilder_.build();
        }
      }
      if (resultCase_ == 3) {
        if (getShardResponseBuilder_ == null) {
          result.result_ = result_;
        } else {
          result.result_ = getShardResponseBuilder_.build();
        }
      }
      result.resultCase_ = resultCase_;
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
      if (other instanceof cluster.external.shard.proto.ShardResponse) {
        return mergeFrom((cluster.external.shard.proto.ShardResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cluster.external.shard.proto.ShardResponse other) {
      if (other == cluster.external.shard.proto.ShardResponse.getDefaultInstance()) return this;
      if (other.getCommitIndex() != 0L) {
        setCommitIndex(other.getCommitIndex());
      }
      switch (other.getResultCase()) {
        case COMMONRESPONSE: {
          mergeCommonResponse(other.getCommonResponse());
          break;
        }
        case GETSHARDRESPONSE: {
          mergeGetShardResponse(other.getGetShardResponse());
          break;
        }
        case RESULT_NOT_SET: {
          break;
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
            case 8: {
              commitIndex_ = input.readInt64();

              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getCommonResponseFieldBuilder().getBuilder(),
                  extensionRegistry);
              resultCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getGetShardResponseFieldBuilder().getBuilder(),
                  extensionRegistry);
              resultCase_ = 3;
              break;
            } // case 26
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
    private int resultCase_ = 0;
    private java.lang.Object result_;
    public ResultCase
        getResultCase() {
      return ResultCase.forNumber(
          resultCase_);
    }

    public Builder clearResult() {
      resultCase_ = 0;
      result_ = null;
      onChanged();
      return this;
    }


    private long commitIndex_ ;
    /**
     * <code>int64 commitIndex = 1;</code>
     * @return The commitIndex.
     */
    @java.lang.Override
    public long getCommitIndex() {
      return commitIndex_;
    }
    /**
     * <code>int64 commitIndex = 1;</code>
     * @param value The commitIndex to set.
     * @return This builder for chaining.
     */
    public Builder setCommitIndex(long value) {
      
      commitIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 commitIndex = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommitIndex() {
      
      commitIndex_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.external.shard.proto.CommonResponse, cluster.external.shard.proto.CommonResponse.Builder, cluster.external.shard.proto.CommonResponseOrBuilder> commonResponseBuilder_;
    /**
     * <code>.proto.CommonResponse commonResponse = 2;</code>
     * @return Whether the commonResponse field is set.
     */
    @java.lang.Override
    public boolean hasCommonResponse() {
      return resultCase_ == 2;
    }
    /**
     * <code>.proto.CommonResponse commonResponse = 2;</code>
     * @return The commonResponse.
     */
    @java.lang.Override
    public cluster.external.shard.proto.CommonResponse getCommonResponse() {
      if (commonResponseBuilder_ == null) {
        if (resultCase_ == 2) {
          return (cluster.external.shard.proto.CommonResponse) result_;
        }
        return cluster.external.shard.proto.CommonResponse.getDefaultInstance();
      } else {
        if (resultCase_ == 2) {
          return commonResponseBuilder_.getMessage();
        }
        return cluster.external.shard.proto.CommonResponse.getDefaultInstance();
      }
    }
    /**
     * <code>.proto.CommonResponse commonResponse = 2;</code>
     */
    public Builder setCommonResponse(cluster.external.shard.proto.CommonResponse value) {
      if (commonResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        commonResponseBuilder_.setMessage(value);
      }
      resultCase_ = 2;
      return this;
    }
    /**
     * <code>.proto.CommonResponse commonResponse = 2;</code>
     */
    public Builder setCommonResponse(
        cluster.external.shard.proto.CommonResponse.Builder builderForValue) {
      if (commonResponseBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        commonResponseBuilder_.setMessage(builderForValue.build());
      }
      resultCase_ = 2;
      return this;
    }
    /**
     * <code>.proto.CommonResponse commonResponse = 2;</code>
     */
    public Builder mergeCommonResponse(cluster.external.shard.proto.CommonResponse value) {
      if (commonResponseBuilder_ == null) {
        if (resultCase_ == 2 &&
            result_ != cluster.external.shard.proto.CommonResponse.getDefaultInstance()) {
          result_ = cluster.external.shard.proto.CommonResponse.newBuilder((cluster.external.shard.proto.CommonResponse) result_)
              .mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        if (resultCase_ == 2) {
          commonResponseBuilder_.mergeFrom(value);
        } else {
          commonResponseBuilder_.setMessage(value);
        }
      }
      resultCase_ = 2;
      return this;
    }
    /**
     * <code>.proto.CommonResponse commonResponse = 2;</code>
     */
    public Builder clearCommonResponse() {
      if (commonResponseBuilder_ == null) {
        if (resultCase_ == 2) {
          resultCase_ = 0;
          result_ = null;
          onChanged();
        }
      } else {
        if (resultCase_ == 2) {
          resultCase_ = 0;
          result_ = null;
        }
        commonResponseBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.proto.CommonResponse commonResponse = 2;</code>
     */
    public cluster.external.shard.proto.CommonResponse.Builder getCommonResponseBuilder() {
      return getCommonResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.CommonResponse commonResponse = 2;</code>
     */
    @java.lang.Override
    public cluster.external.shard.proto.CommonResponseOrBuilder getCommonResponseOrBuilder() {
      if ((resultCase_ == 2) && (commonResponseBuilder_ != null)) {
        return commonResponseBuilder_.getMessageOrBuilder();
      } else {
        if (resultCase_ == 2) {
          return (cluster.external.shard.proto.CommonResponse) result_;
        }
        return cluster.external.shard.proto.CommonResponse.getDefaultInstance();
      }
    }
    /**
     * <code>.proto.CommonResponse commonResponse = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.external.shard.proto.CommonResponse, cluster.external.shard.proto.CommonResponse.Builder, cluster.external.shard.proto.CommonResponseOrBuilder> 
        getCommonResponseFieldBuilder() {
      if (commonResponseBuilder_ == null) {
        if (!(resultCase_ == 2)) {
          result_ = cluster.external.shard.proto.CommonResponse.getDefaultInstance();
        }
        commonResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cluster.external.shard.proto.CommonResponse, cluster.external.shard.proto.CommonResponse.Builder, cluster.external.shard.proto.CommonResponseOrBuilder>(
                (cluster.external.shard.proto.CommonResponse) result_,
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      resultCase_ = 2;
      onChanged();;
      return commonResponseBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.external.shard.proto.GetShardResponse, cluster.external.shard.proto.GetShardResponse.Builder, cluster.external.shard.proto.GetShardResponseOrBuilder> getShardResponseBuilder_;
    /**
     * <code>.proto.GetShardResponse getShardResponse = 3;</code>
     * @return Whether the getShardResponse field is set.
     */
    @java.lang.Override
    public boolean hasGetShardResponse() {
      return resultCase_ == 3;
    }
    /**
     * <code>.proto.GetShardResponse getShardResponse = 3;</code>
     * @return The getShardResponse.
     */
    @java.lang.Override
    public cluster.external.shard.proto.GetShardResponse getGetShardResponse() {
      if (getShardResponseBuilder_ == null) {
        if (resultCase_ == 3) {
          return (cluster.external.shard.proto.GetShardResponse) result_;
        }
        return cluster.external.shard.proto.GetShardResponse.getDefaultInstance();
      } else {
        if (resultCase_ == 3) {
          return getShardResponseBuilder_.getMessage();
        }
        return cluster.external.shard.proto.GetShardResponse.getDefaultInstance();
      }
    }
    /**
     * <code>.proto.GetShardResponse getShardResponse = 3;</code>
     */
    public Builder setGetShardResponse(cluster.external.shard.proto.GetShardResponse value) {
      if (getShardResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        getShardResponseBuilder_.setMessage(value);
      }
      resultCase_ = 3;
      return this;
    }
    /**
     * <code>.proto.GetShardResponse getShardResponse = 3;</code>
     */
    public Builder setGetShardResponse(
        cluster.external.shard.proto.GetShardResponse.Builder builderForValue) {
      if (getShardResponseBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        getShardResponseBuilder_.setMessage(builderForValue.build());
      }
      resultCase_ = 3;
      return this;
    }
    /**
     * <code>.proto.GetShardResponse getShardResponse = 3;</code>
     */
    public Builder mergeGetShardResponse(cluster.external.shard.proto.GetShardResponse value) {
      if (getShardResponseBuilder_ == null) {
        if (resultCase_ == 3 &&
            result_ != cluster.external.shard.proto.GetShardResponse.getDefaultInstance()) {
          result_ = cluster.external.shard.proto.GetShardResponse.newBuilder((cluster.external.shard.proto.GetShardResponse) result_)
              .mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        if (resultCase_ == 3) {
          getShardResponseBuilder_.mergeFrom(value);
        } else {
          getShardResponseBuilder_.setMessage(value);
        }
      }
      resultCase_ = 3;
      return this;
    }
    /**
     * <code>.proto.GetShardResponse getShardResponse = 3;</code>
     */
    public Builder clearGetShardResponse() {
      if (getShardResponseBuilder_ == null) {
        if (resultCase_ == 3) {
          resultCase_ = 0;
          result_ = null;
          onChanged();
        }
      } else {
        if (resultCase_ == 3) {
          resultCase_ = 0;
          result_ = null;
        }
        getShardResponseBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.proto.GetShardResponse getShardResponse = 3;</code>
     */
    public cluster.external.shard.proto.GetShardResponse.Builder getGetShardResponseBuilder() {
      return getGetShardResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.GetShardResponse getShardResponse = 3;</code>
     */
    @java.lang.Override
    public cluster.external.shard.proto.GetShardResponseOrBuilder getGetShardResponseOrBuilder() {
      if ((resultCase_ == 3) && (getShardResponseBuilder_ != null)) {
        return getShardResponseBuilder_.getMessageOrBuilder();
      } else {
        if (resultCase_ == 3) {
          return (cluster.external.shard.proto.GetShardResponse) result_;
        }
        return cluster.external.shard.proto.GetShardResponse.getDefaultInstance();
      }
    }
    /**
     * <code>.proto.GetShardResponse getShardResponse = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cluster.external.shard.proto.GetShardResponse, cluster.external.shard.proto.GetShardResponse.Builder, cluster.external.shard.proto.GetShardResponseOrBuilder> 
        getGetShardResponseFieldBuilder() {
      if (getShardResponseBuilder_ == null) {
        if (!(resultCase_ == 3)) {
          result_ = cluster.external.shard.proto.GetShardResponse.getDefaultInstance();
        }
        getShardResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cluster.external.shard.proto.GetShardResponse, cluster.external.shard.proto.GetShardResponse.Builder, cluster.external.shard.proto.GetShardResponseOrBuilder>(
                (cluster.external.shard.proto.GetShardResponse) result_,
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      resultCase_ = 3;
      onChanged();;
      return getShardResponseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.ShardResponse)
  }

  // @@protoc_insertion_point(class_scope:proto.ShardResponse)
  private static final cluster.external.shard.proto.ShardResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cluster.external.shard.proto.ShardResponse();
  }

  public static cluster.external.shard.proto.ShardResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShardResponse>
      PARSER = new com.google.protobuf.AbstractParser<ShardResponse>() {
    @java.lang.Override
    public ShardResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ShardResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShardResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cluster.external.shard.proto.ShardResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

