package service;

import domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class Referee {
    public List<Car> judgeWinner(List<Car> cars) {
        Car winner = cars.stream()
                .max(Car::compareTo)
                .orElseThrow();

        return cars.stream()
                .filter(car -> car.compareTo(winner) == 0)
                .collect(Collectors.toList());
    }
}
