package service;

import domain.Car;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

class RefereeTest {

    private Referee referee;

    @ParameterizedTest
    @CsvSource(value = {"0,0", "0,1", "4,3"})
    void 승자_판정_확인(int number1, int number2) {
        // given
        Car car1 = Car.of("pobi", number1);
        Car car2 = Car.of("woni", number2);
        List<Car> cars =List.of(car1, car2);

        // when then
        List<Car> winner = referee.judgeWinner(cars);

        if (car1.compareTo(car2) == 0) {    //car1 == car2
            Assertions.assertThat(winner).isEqualTo(cars);
        }
        if (car1.compareTo(car2) > 0) {     //car1 > car2
            Assertions.assertThat(winner).isEqualTo(List.of(car1));
        }
        if (car1.compareTo(car2) < 0) {
            Assertions.assertThat(winner).isEqualTo(List.of(car2));
        }

    }

}