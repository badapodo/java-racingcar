package domain;

import exception.CarNameLengthException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static domain.Position.INITIAL_VALUE;

class CarTest {

    @Test
    void 자동차_이름이_5자_초과일_때_예외() {
        // given
        String name = "aaaaaa";

        // when then
        Assertions.assertThatThrownBy(() -> Car.of(name, INITIAL_VALUE))
                .isInstanceOf(CarNameLengthException.class);
    }

    @Test
    void 자동차_이름이_5자_이내일_때_생성() {
        // given
        String name = "aaaaa";

        // when then
        Car.of(name);
    }
}