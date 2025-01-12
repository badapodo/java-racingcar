package exception;

public class CarNameLengthException extends RacingCarException{
    private static String message = "이름은 5자 이하만 가능하다.";

    public CarNameLengthException() {
        super(message);
    }
}
