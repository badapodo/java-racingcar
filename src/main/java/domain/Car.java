package domain;

import exception.CarNameLengthException;

import java.util.Objects;

public class Car {
    private final String name;
    private final Position position;

    public Car(String name, int position) {
        validateCar(name);
        this.name = name;
        this.position = Position.of(position);
    }

    public static Car of(String name, int position) {
        return new Car(name, position);
    }

    public static Car of(String name) {
        return new Car(name, Position.INITIAL_VALUE);
    }

    public int compareToPosition(Car car) {
        return position.compareTo(car.position);
    }

    private void validateCar(String name) {
        validCarName(name);
    }

    private void validCarName(String name) {
        if(name.length() > 5) {
            throw new CarNameLengthException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
