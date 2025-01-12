package controller;

import domain.Car;
import service.Referee;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static util.Converter.*;

public class RacingController {
    private final InputView inputView;
    private final OutputView outputView;
    private final Referee referee;

    public RacingController(InputView inputView, OutputView outputView, Referee referee) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.referee = referee;
    }

    public void run() {
        List<Car> cars = carNamesToCars(inputView.readNames());
        int tryCount = inputView.readTryCount();

        cars = tryMove(tryCount, cars);
        List<Car> winner = referee.judgeWinner(cars);

        outputView.printWinner(winner);
    }

    private List<Car> tryMove(int tryCount, List<Car> cars) {
        List<Car> ret = cars;
        for(int i = 0; i < tryCount; i++) {
            ret = tryMoveOnce(ret);
            outputView.printMovingResult(ret);
       }
        return ret;
    }

    private List<Car> tryMoveOnce(List<Car> cars) {
        return cars.stream()
                .map(car -> car.tryMove(pickNumberInRange(0, 9)))
                .collect(Collectors.toList());
    }
}
