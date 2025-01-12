import service.Referee;
import view.InputView;
import view.OutputView;

public class Config {
    private static final OutputView outputView = new OutputView();
    private static final InputView inputView = new InputView(outputView);
    private static final Referee referee = new Referee();

    private static final Config instance = new Config();

    private Config(){
    }

    public static Config getInstance() {
        return instance;
    }

    public OutputView outputView() {
        return outputView;
    }

    public InputView inputView() {
        return inputView;
    }

    public Referee referee() {
        return referee;
    }
}
