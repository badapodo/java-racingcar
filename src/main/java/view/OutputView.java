package view;

import domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {


    public void printMovingResult(List<Car> result) {
        println("실행 결과");
        println(result.stream()
                .map(Car::toString)
                .collect(Collectors.joining("\n")));
    }

    public void printWinner(List<Car> winner) {
        println("최종 우승자 : " + winner.stream()
                .map(Car::toName)
                .collect(Collectors.joining(","))
        );
    }

    public void println(String string) {
        System.out.println(string);
    }
}
