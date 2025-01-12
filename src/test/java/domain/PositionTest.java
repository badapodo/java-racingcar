package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static domain.Position.INITIAL_VALUE;
import static domain.Position.of;
class PositionTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void 전진하지_않는_조건일_때(int number) {
        Position position = of(INITIAL_VALUE);
        position = position.tryMove(number);
        Assertions.assertThat(position).isEqualTo(of(0));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    void 전진하는_조건일_때(int number) {
        Position position = of(INITIAL_VALUE);
        position = position.tryMove(number);
        Assertions.assertThat(position).isEqualTo(of(1));
    }

}