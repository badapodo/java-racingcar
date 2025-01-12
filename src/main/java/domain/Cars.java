package domain;

import camp.nextstep.edu.missionutils.Randoms;
import exception.CarNameDuplicationException;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> values;

    public Cars(List<Car> values) {
        validateCars(values);
        this.values = values;
    }

    public static Cars of(List<String> names) {
        List<Car> cars = names.stream()
                .map(Car::of)
                .collect(Collectors.toList());
        return new Cars(cars);
    }

    private void validateCars(List<Car> cars) {
        validateCarNameDuplication(cars);
    }

    private void validateCarNameDuplication(List<Car> cars) {
        boolean duplicated = cars.stream()
                .distinct()
                .count() != cars.size();

        if(duplicated) {
            throw new CarNameDuplicationException();
        }
    }

    public Cars tryMove(int tryingNumber) {
        return new Cars(
                values.stream()
                .map(car -> car.tryMove(Randoms.pickNumberInRange(0,9)))
                .collect(Collectors.toList()));
    }

}
