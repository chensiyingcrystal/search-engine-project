// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClusterHealthManagement.proto

package cluster.proto;

public interface RaftGroupMembersProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.RaftGroupMembersProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 logIndex = 1;</code>
   * @return The logIndex.
   */
  long getLogIndex();

  /**
   * <code>repeated .proto.RaftEndpointProto member = 2;</code>
   */
  java.util.List<cluster.proto.RaftEndpointProto> 
      getMemberList();
  /**
   * <code>repeated .proto.RaftEndpointProto member = 2;</code>
   */
  cluster.proto.RaftEndpointProto getMember(int index);
  /**
   * <code>repeated .proto.RaftEndpointProto member = 2;</code>
   */
  int getMemberCount();
  /**
   * <code>repeated .proto.RaftEndpointProto member = 2;</code>
   */
  java.util.List<? extends cluster.proto.RaftEndpointProtoOrBuilder> 
      getMemberOrBuilderList();
  /**
   * <code>repeated .proto.RaftEndpointProto member = 2;</code>
   */
  cluster.proto.RaftEndpointProtoOrBuilder getMemberOrBuilder(
      int index);
}