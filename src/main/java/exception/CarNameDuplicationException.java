package exception;

public class CarNameDuplicationException extends RacingCarException{
    private static final String message = "중복된 자동차 이름이 존재합니다.";

    public CarNameDuplicationException() {
        super(message);
    }
}
