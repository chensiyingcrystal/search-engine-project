package team.dsys.dssearch.cluster.lifecycle;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.concurrent.atomic.AtomicBoolean;

@Singleton
public class ProcessTerminationLoggerImpl implements ProcessTerminationLogger {
    public static final String PROCESS_TERMINATION_FLAG_KEY = "ProcessTerminationFlag";

    private final AtomicBoolean terminating;

    @Inject
    public ProcessTerminationLoggerImpl(@Named(PROCESS_TERMINATION_FLAG_KEY) AtomicBoolean terminating) {
        this.terminating = terminating;
    }

    @Override
    public boolean isCurrentProcessTerminating() {
        return terminating.get();
    }

}
