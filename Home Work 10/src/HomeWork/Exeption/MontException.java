package HomeWork.Exeption;

public class MontException extends RuntimeException {
    public MontException() {
    }

    public MontException(String message) {
        super(message);
    }

    public MontException(String message, Throwable cause) {
        super(message, cause);
    }

    public MontException(Throwable cause) {
        super(cause);
    }

    public MontException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
