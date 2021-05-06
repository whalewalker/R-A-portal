package recuiter.recuiterplatform.exceptions;

public class RecruiterException extends Exception{
    public RecruiterException() {
        super();
    }

    public RecruiterException(String message) {
        super(message);
    }

    public RecruiterException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecruiterException(Throwable cause) {
        super(cause);
    }

    protected RecruiterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
