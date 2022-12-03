// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClusterHealthManagement.proto

package cluster.proto;

/**
 * Protobuf enum {@code proto.RaftRoleProto}
 */
public enum RaftRoleProto
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LEADER = 0;</code>
   */
  LEADER(0),
  /**
   * <code>CANDIDATE = 1;</code>
   */
  CANDIDATE(1),
  /**
   * <code>FOLLOWER = 2;</code>
   */
  FOLLOWER(2),
  /**
   * <code>LEARNER = 3;</code>
   */
  LEARNER(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LEADER = 0;</code>
   */
  public static final int LEADER_VALUE = 0;
  /**
   * <code>CANDIDATE = 1;</code>
   */
  public static final int CANDIDATE_VALUE = 1;
  /**
   * <code>FOLLOWER = 2;</code>
   */
  public static final int FOLLOWER_VALUE = 2;
  /**
   * <code>LEARNER = 3;</code>
   */
  public static final int LEARNER_VALUE = 3;


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
  public static RaftRoleProto valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RaftRoleProto forNumber(int value) {
    switch (value) {
      case 0: return LEADER;
      case 1: return CANDIDATE;
      case 2: return FOLLOWER;
      case 3: return LEARNER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RaftRoleProto>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RaftRoleProto> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RaftRoleProto>() {
          public RaftRoleProto findValueByNumber(int number) {
            return RaftRoleProto.forNumber(number);
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
    return cluster.proto.ClusterHealthManagement.getDescriptor().getEnumTypes().get(0);
  }

  private static final RaftRoleProto[] VALUES = values();

  public static RaftRoleProto valueOf(
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

  private RaftRoleProto(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.RaftRoleProto)
}

