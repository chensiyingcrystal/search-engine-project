// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClusterHealthManagement.proto

package cluster.proto;

public interface RemoveRaftEndpointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.RemoveRaftEndpointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.proto.RaftEndpointProto endpoint = 1;</code>
   * @return Whether the endpoint field is set.
   */
  boolean hasEndpoint();
  /**
   * <code>.proto.RaftEndpointProto endpoint = 1;</code>
   * @return The endpoint.
   */
  cluster.proto.RaftEndpointProto getEndpoint();
  /**
   * <code>.proto.RaftEndpointProto endpoint = 1;</code>
   */
  cluster.proto.RaftEndpointProtoOrBuilder getEndpointOrBuilder();

  /**
   * <code>int64 groupMembersCommitIndex = 2;</code>
   * @return The groupMembersCommitIndex.
   */
  long getGroupMembersCommitIndex();
}
