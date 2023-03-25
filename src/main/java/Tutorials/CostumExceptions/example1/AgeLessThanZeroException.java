package Tutorials.CostumExceptions.example1;

public class AgeLessThanZeroException extends Exception {

    public AgeLessThanZeroException() {}

    public AgeLessThanZeroException(String message) {
        super(message);
    }

    public AgeLessThanZeroException(Throwable cause) {
        super(cause);
    }
    
}
