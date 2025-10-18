package calculator.service.seperator;

import calculator.service.dto.Expression;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DefaultSeperatorTest {

    private final Expression expression = new Expression("123:123", List.of());
    @Test
    @DisplayName("분리한 반환값은 리스트 타입")
    void seperatorTest() {
        Separator seperator = DefaultSeperator.getInstance();
        assertThat(seperator.separate(expression)).isInstanceOf(List.class);
    }

    @Test
    @DisplayName("리스트의 값은 String")
    void seperatorReturnsStringTest() {
        Separator seperator = DefaultSeperator.getInstance();
        seperator.separate(expression)
                .forEach(s -> assertThat(s).isInstanceOf(String.class));
    }

    @Test
    @DisplayName("기본 구분자 문자열 분리 테스트")
    void seperatorLiteralTest() {
        Separator seperator = DefaultSeperator.getInstance();
        assertThat(seperator.separate(expression).size()).isEqualTo(2);
    }

    @Test
    @DisplayName("문자열 반환 테스트")
    void seperatorLiteralReturnsValidTest() {
        Separator seperator = DefaultSeperator.getInstance();
        assertThat(seperator.separate(expression).getFirst()).isEqualTo("123");
    }
}