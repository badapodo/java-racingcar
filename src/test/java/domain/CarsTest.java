package domain;

import exception.CarNameDuplicationException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CarsTest {

    @Test
    void 중복된_자동차_이름_예외() {
        // given
        List<String> names = List.of("pobbi", "jun", "pobbi");

        // when then
        Assertions.assertThatThrownBy(() -> Cars.of(names))
                .isInstanceOf(CarNameDuplicationException.class);
    }
}
