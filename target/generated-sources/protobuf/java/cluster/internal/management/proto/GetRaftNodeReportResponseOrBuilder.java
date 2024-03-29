// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClusterHealthManagement.proto

package cluster.internal.management.proto;

public interface GetRaftNodeReportResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GetRaftNodeReportResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * RaftNodeReport fetched from the RaftNode object running in the contacted instance.
   * </pre>
   *
   * <code>.proto.RaftNodeReportProto report = 1;</code>
   * @return Whether the report field is set.
   */
  boolean hasReport();
  /**
   * <pre>
   * RaftNodeReport fetched from the RaftNode object running in the contacted instance.
   * </pre>
   *
   * <code>.proto.RaftNodeReportProto report = 1;</code>
   * @return The report.
   */
  cluster.internal.management.proto.RaftNodeReportProto getReport();
  /**
   * <pre>
   * RaftNodeReport fetched from the RaftNode object running in the contacted instance.
   * </pre>
   *
   * <code>.proto.RaftNodeReportProto report = 1;</code>
   */
  cluster.internal.management.proto.RaftNodeReportProtoOrBuilder getReportOrBuilder();

  /**
   * <pre>
   * RaftEndpoint -&gt; address pairs known by a contacted instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpointAddress = 2;</code>
   */
  int getEndpointAddressCount();
  /**
   * <pre>
   * RaftEndpoint -&gt; address pairs known by a contacted instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpointAddress = 2;</code>
   */
  boolean containsEndpointAddress(
      java.lang.String key);
  /**
   * Use {@link #getEndpointAddressMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getEndpointAddress();
  /**
   * <pre>
   * RaftEndpoint -&gt; address pairs known by a contacted instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpointAddress = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getEndpointAddressMap();
  /**
   * <pre>
   * RaftEndpoint -&gt; address pairs known by a contacted instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpointAddress = 2;</code>
   */

  /* nullable */
java.lang.String getEndpointAddressOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * RaftEndpoint -&gt; address pairs known by a contacted instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpointAddress = 2;</code>
   */

  java.lang.String getEndpointAddressOrThrow(
      java.lang.String key);
}
