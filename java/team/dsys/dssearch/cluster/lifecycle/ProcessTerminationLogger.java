package team.dsys.dssearch.cluster.lifecycle;

import org.slf4j.Logger;

public interface ProcessTerminationLogger {

    boolean isCurrentProcessTerminating();

    default void logInfo(Logger logger, String message) {
        if (isCurrentProcessTerminating()) {
            System.err.println(message);
        } else {
            logger.info(message);
        }
    }

    default void logWarn(Logger logger, String message) {
        if (isCurrentProcessTerminating()) {
            System.err.println(message);
        } else {
            logger.warn(message);
        }
    }

    default void logError(Logger logger, String message, Throwable t) {
        if (isCurrentProcessTerminating()) {
            System.err.println(message);
            t.printStackTrace(System.err);
        } else {
            logger.error(message, t);
        }
    }

}

