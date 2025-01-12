package exception;

public class RacingCarException extends IllegalArgumentException{
    protected RacingCarException(String message) {
        super(message);
    }
}
