package team.dsys.dssearch.cluster.exception;

public class ClusterServerException extends RuntimeException {

    public ClusterServerException() {
        super();
    }

    public ClusterServerException(String message) {
        super(message);
    }

    public ClusterServerException(String message, Throwable cause) {
        super(message, cause);
    }

}