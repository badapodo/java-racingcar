package view;

import exception.CarNameDuplicationException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static view.InputViewValidator.validateCarNameDuplication;

class InputViewValidatorTest {
    @Test
    void 중복된_자동차_이름_예외() {
        // given
        List<String> names = List.of("pobbi", "jun", "pobbi");

        // when then
        Assertions.assertThatThrownBy(() -> validateCarNameDuplication(names))
                .isInstanceOf(CarNameDuplicationException.class);
    }
}