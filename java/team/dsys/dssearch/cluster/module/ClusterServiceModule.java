package team.dsys.dssearch.cluster.module;

import cluster.proto.RaftCommunicationServiceGrpc;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import io.microraft.RaftEndpoint;
import io.microraft.model.RaftModelFactory;
import io.microraft.statemachine.StateMachine;
import team.dsys.dssearch.cluster.config.ClusterServiceConfig;
import team.dsys.dssearch.cluster.lifecycle.ProcessTerminationLogger;
import team.dsys.dssearch.cluster.lifecycle.ProcessTerminationLoggerImpl;
import team.dsys.dssearch.cluster.raft.LocalStateMachine;
import team.dsys.dssearch.cluster.raft.listener.ClusterEndpointsListener;
import team.dsys.dssearch.cluster.raft.model.RaftModelFactoryImpl;
import team.dsys.dssearch.cluster.raft.report.RaftNodeReportSupplier;
import team.dsys.dssearch.cluster.rpc.RaftMessageHandler;
import team.dsys.dssearch.cluster.rpc.RaftRpcService;
import team.dsys.dssearch.cluster.rpc.RaftRpcServiceImpl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import static com.google.inject.name.Names.named;

public class ClusterServiceModule extends AbstractModule {

    public static final String CONFIG_KEY = "Config";
    public static final String NODE_ENDPOINT_KEY = "NodeEndpoint";
    public static final String INITIAL_ENDPOINTS_KEY = "InitialEndpoints";
    public static final String RAFT_ENDPOINT_ADDRESSES_KEY = "RaftEndpointAddresses";
    public static final String RAFT_NODE_SUPPLIER_KEY = "RaftNodeSupplier";

    private final ClusterServiceConfig config;
    private final RaftEndpoint nodeEndpoint;
    private final List<RaftEndpoint> initialEndpoints;
    private final Map<RaftEndpoint, String> addresses;
    private final AtomicBoolean processTerminationFlag;

    public ClusterServiceModule(ClusterServiceConfig config, RaftEndpoint nodeEndpoint, List<RaftEndpoint> initialEndpoints,
                          Map<RaftEndpoint, String> addresses, AtomicBoolean processTerminationFlag) {
        this.config = config;
        this.nodeEndpoint = nodeEndpoint;
        this.initialEndpoints = initialEndpoints;
        this.addresses = addresses;
        this.processTerminationFlag = processTerminationFlag;
    }

    @Override
    protected void configure() {
        bind(AtomicBoolean.class).annotatedWith(named(ProcessTerminationLoggerImpl.PROCESS_TERMINATION_FLAG_KEY))
                .toInstance(processTerminationFlag);
        bind(ProcessTerminationLogger.class).to(ProcessTerminationLoggerImpl.class);

        bind(ClusterServiceConfig.class).annotatedWith(named(CONFIG_KEY)).toInstance(config);
        bind(RaftEndpoint.class).annotatedWith(named(NODE_ENDPOINT_KEY)).toInstance(nodeEndpoint);
        bind(new TypeLiteral<Collection<RaftEndpoint>>() {
        }).annotatedWith(named(INITIAL_ENDPOINTS_KEY)).toInstance(initialEndpoints);
        bind(new TypeLiteral<Map<RaftEndpoint, String>>() {
        }).annotatedWith(named(RAFT_ENDPOINT_ADDRESSES_KEY)).toInstance(addresses);

        //clusterEndpointsListener: update and expose cluster information to client(internal call)
        bind(RaftNodeReportSupplier.class).to(ClusterEndpointsListener.class);
        bind(StateMachine.class).to(LocalStateMachine.class);
        bind(RaftModelFactory.class).to(RaftModelFactoryImpl.class);
        bind(RaftCommunicationServiceGrpc.RaftCommunicationServiceImplBase.class).to(RaftMessageHandler.class);
        bind(RpcServer.class).to(RpcServerImpl.class);
        bind(RaftRpcService.class).to(RaftRpcServiceImpl.class);
        bind(KVRequestHandlerImplBase.class).to(KVRequestHandler.class);
        bind(ManagementRequestHandlerImplBase.class).to(ManagementRequestHandler.class);

        bind(new TypeLiteral<Supplier<RaftNode>>() {
        }).annotatedWith(named(RAFT_NODE_SUPPLIER_KEY)).to(RaftNodeSupplier.class);
    }

}

