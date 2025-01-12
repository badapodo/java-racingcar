package util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ConverterTest {

    @Test
    void 자동차_이름_구분() {
        String input = "pobi,woni,jun";
        List<String> converted = Converter.splitNames(input);
        Assertions.assertThat(converted).isEqualTo(List.of("pobi", "woni", "jun"));
    }

}