package team.dsys.dssearch.cluster.raft;

import cluster.external.shard.proto.DataNodeInfo;
import cluster.external.shard.proto.ShardInfo;
import cluster.external.shard.proto.Val;
import cluster.internal.raft.proto.*;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import io.microraft.RaftEndpoint;
import io.microraft.statemachine.StateMachine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static java.util.Objects.requireNonNull;
import static team.dsys.dssearch.cluster.module.ClusterServiceModule.NODE_ENDPOINT_KEY;

public class LocalStateMachine implements StateMachine {
    /**
     * This defines how the local state machine executes an operation
     * when the task is committed, i.e., replicated to a majority of nodes.
     * @param commitIndex
     *            the Raft log index on which the given operation is committed
     * @param operation
     *             the user-supplied operation to be executed
     * @return the result of the operation execution
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(LocalStateMachine.class);
    //in-memory map to keep shard status and node status
    // use linkedhash map to keep the insertion order
//    private final Map<ShardInfo, DataNodeInfo> map = new LinkedHashMap<>();
    private final Map<String, Val> map = new LinkedHashMap<>();

    private final RaftEndpoint raftNodeEndpoint;

    @Inject
    public LocalStateMachine(@Named(NODE_ENDPOINT_KEY) RaftEndpoint raftEndpoint) {
        this.raftNodeEndpoint = raftEndpoint;
    }

    /**
     * Microraft will finally call runOperation on every node when applying entries
     * @param commitIndex
     * @param operation
     * @return
     */
    @Override
    public Object runOperation(long commitIndex, @Nonnull Object operation) {
        requireNonNull(operation);
        if (operation instanceof PutOp) {
            return put(commitIndex, (PutOp) operation);
        } else if (operation instanceof GetOp) {
            return get(commitIndex, (GetOp) operation);
        }

        throw new IllegalArgumentException("Invalid operation: " + operation + " of clazz: " + operation.getClass()
                + " at commit index: " + commitIndex);
    }

    //do local put operation
    private PutOpResult put(long commitIndex, PutOp op) {
        Val oldVal = Val.newBuilder().setStr("PUT successfully").build();
        PutOpResult.Builder builder = PutOpResult.newBuilder();
        if (oldVal != null) {
            builder.setStatus(0).setMsg("Build successfully");
        }

        return builder.build();
    }

    private GetOpResult get(long commitIndex, GetOp op) {
        GetOpResult.Builder builder = GetOpResult.newBuilder();
        Val val = Val.newBuilder().setStr("GET successfully").build();
        if (val != null) {
            builder.setVal(val);
        }

        return builder.build();
    }


    //create snapshot chunk data
    @Override
    public void takeSnapshot(long commitIndex, Consumer<Object> snapshotChunkConsumer) {
        ClusterSnapshotChunkData.Builder chunkBuilder = ClusterSnapshotChunkData.newBuilder();

        int chunkCount = 0, keyCount = 0;
        for (Map.Entry<String, Val> e : map.entrySet()) {
            keyCount++;
            ShardEntry shardEntry = ShardEntry.newBuilder().setKey(e.getKey()).setVal(e.getValue()).build();
            chunkBuilder.addEntry(shardEntry);
            if (chunkBuilder.getEntryCount() == 10000) {
                snapshotChunkConsumer.accept(chunkBuilder.build());
                chunkBuilder = ClusterSnapshotChunkData.newBuilder();
                chunkCount++;
            }
        }

        if (map.size() == 0 || chunkBuilder.getEntryCount() > 0) {
            snapshotChunkConsumer.accept(chunkBuilder.build());
            chunkCount++;
        }

        LOGGER.info("{} took snapshot with {} chunks and {} keys at log index: {}", raftNodeEndpoint.getId(), chunkCount,
                keyCount, commitIndex);
    }

    //install snapshot chunk data
    @Override
    public void installSnapshot(long commitIndex, @Nonnull List<Object> snapshotChunks) {
        map.clear();

        for (Object chunk : snapshotChunks) {
            for (ShardEntry entry : ((ClusterSnapshotChunkData) chunk).getEntryList()) {
                map.put(entry.getKey(), entry.getVal());
            }
        }

        LOGGER.info("{} restored snapshot with {} keys at commit index: {}", raftNodeEndpoint.getId(), map.size(),
                commitIndex);
    }

    @Nonnull
    @Override
    public Object getNewTermOperation() {
        return StartNewTermOpProto.getDefaultInstance();
    }

}
