package util;

import domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class Converter {

    public static List<String> splitNames(String input) {
        return List.of(input.split(","));
    }

    public static int parseInt(String input) {
        return Integer.parseInt(input);
    }

    public static List<Car> carNamesToCars(List<String> names) {
        return names.stream()
                .map(Car::of)
                .collect(Collectors.toList());
    }
}
