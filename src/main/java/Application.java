import controller.RacingController;
import exception.RacingCarException;
import service.Referee;
import view.InputView;
import view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = Config.getInstance().inputView();
        OutputView outputView = Config.getInstance().outputView();
        Referee referee = Config.getInstance().referee();

        RacingController racingController = new RacingController(inputView, outputView, referee);

        racingController.run();
    }
}
