package domain;

import exception.CarNameLengthException;

public class Car {
    private final String name;
    private final Position position;

    public Car(String name, int position) {
        validCar(name);
        this.name = name;
        this.position = Position.of(position);
    }

    public static Car of(String name, int position) {
        return new Car(name, position);
    }

    public static Car of(String name) {
        return new Car(name, Position.INITIAL_VALUE);
    }

    public int compareTo(Car car) {
        return position.compareTo(car.position);
    }

    private void validCar(String name) {
        validCarName(name);
    }

    private void validCarName(String name) {
        if(name.length() > 5) {
            throw new CarNameLengthException();
        }
    }

}
