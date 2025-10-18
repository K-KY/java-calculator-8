package calculator.service.converter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class IntegerConverterTest {

    @Test
    @DisplayName("문자열 리스트를 숫자로 변환")
    void convertTest() {
        List<String> input = List.of("1", "2", "3");
        assertThat(IntegerConverter.convert(input)
                .stream().reduce(0, Integer::sum))
                .isEqualTo(6);
    }

}