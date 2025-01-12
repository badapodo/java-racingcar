package domain;

public class Car {
    private final String name;
    private final Position position;

    public Car(String name, int position) {
        this.name = name;
        this.position = Position.of(position);
    }

    public static Car of(String name, int position) {
        return new Car(name, position);
    }

    public int compareTo(Car car) {
        return position.compareTo(car.position);
    }
}
