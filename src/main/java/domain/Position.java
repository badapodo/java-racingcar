package domain;

import java.util.Objects;

public class Position {
    public static final int INITIAL_VALUE = 0;

    private final int value;

    public Position(int value) {
        this.value = value;
    }

    public static Position of(int value) {
        return new Position(value);
    }

    public int compareTo(Position position) {
        return Integer.compare(this.value, position.value);
    }

    public Position tryMove(int number) {
        if(number >= 4) {
            return of(value + 1);
        }
        return of(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return value == position.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < value; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
