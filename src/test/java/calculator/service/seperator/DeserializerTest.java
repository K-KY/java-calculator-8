package calculator.service.seperator;

import calculator.service.dto.Expression;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class DeserializerTest {

    @Test
    @DisplayName("사용자 정의 구분자 없음")
    void defaultParse() {
        Expression parse = Deserializer.parse("12:123,123");
        assertThat(parse.delimiter()).isEmpty();
        assertThat(parse.expression()).isEqualTo("12:123,123");
    }

    @Test
    @DisplayName("사용자 정의 구분자 있음")
    void customParse() {
        Expression parse = Deserializer.parse("//;\\n123;123;123");
        assertThat(parse.delimiter().getFirst()).isEqualTo(";");
        assertThat(parse.expression()).isEqualTo("123;123;123");
    }

    @Test
    @DisplayName("예외 테스트")
    void parseException() {
        assertThatThrownBy(() -> Deserializer.parse("")).isInstanceOf(IllegalArgumentException.class);
    }
}