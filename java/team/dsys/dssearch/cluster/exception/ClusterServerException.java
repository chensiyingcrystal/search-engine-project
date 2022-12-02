package team.dsys.dssearch.cluster.exception;

public class ClusterServerException extends RuntimeException {

    /**
     * Constructs a new runtime exception with {@code null} as its detail message.
     */
    public ClusterServerException() {
        super();
    }

    /**
     * Constructs a new runtime exception with the specified detail message.
     *
     * @param message
     *            the detail message. The detail message is saved for later retrieval by the {@link #getMessage()}
     *            method.
     */
    public ClusterServerException(String message) {
        super(message);
    }

    /**
     * Constructs a new runtime exception with the specified detail message and cause.
     *
     * @param message
     *            the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     * @param cause
     *            the cause (which is saved for later retrieval by the {@link #getCause()} method). (A {@code null}
     *            value is permitted, and indicates that the cause is nonexistent or unknown.)
     */
    public ClusterServerException(String message, Throwable cause) {
        super(message, cause);
    }

}