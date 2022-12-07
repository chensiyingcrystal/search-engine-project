// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClusterHealthManagement.proto

package cluster.internal.management.proto;

/**
 * Protobuf enum {@code proto.RaftNodeStatusProto}
 */
public enum RaftNodeStatusProto
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INITIAL = 0;</code>
   */
  INITIAL(0),
  /**
   * <code>ACTIVE = 1;</code>
   */
  ACTIVE(1),
  /**
   * <code>UPDATING_RAFT_GROUP_MEMBER_LIST = 2;</code>
   */
  UPDATING_RAFT_GROUP_MEMBER_LIST(2),
  /**
   * <code>TERMINATED = 3;</code>
   */
  TERMINATED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INITIAL = 0;</code>
   */
  public static final int INITIAL_VALUE = 0;
  /**
   * <code>ACTIVE = 1;</code>
   */
  public static final int ACTIVE_VALUE = 1;
  /**
   * <code>UPDATING_RAFT_GROUP_MEMBER_LIST = 2;</code>
   */
  public static final int UPDATING_RAFT_GROUP_MEMBER_LIST_VALUE = 2;
  /**
   * <code>TERMINATED = 3;</code>
   */
  public static final int TERMINATED_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static RaftNodeStatusProto valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RaftNodeStatusProto forNumber(int value) {
    switch (value) {
      case 0: return INITIAL;
      case 1: return ACTIVE;
      case 2: return UPDATING_RAFT_GROUP_MEMBER_LIST;
      case 3: return TERMINATED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RaftNodeStatusProto>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RaftNodeStatusProto> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RaftNodeStatusProto>() {
          public RaftNodeStatusProto findValueByNumber(int number) {
            return RaftNodeStatusProto.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return cluster.internal.management.proto.ClusterHealthManagement.getDescriptor().getEnumTypes().get(2);
  }

  private static final RaftNodeStatusProto[] VALUES = values();

  public static RaftNodeStatusProto valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private RaftNodeStatusProto(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.RaftNodeStatusProto)
}
