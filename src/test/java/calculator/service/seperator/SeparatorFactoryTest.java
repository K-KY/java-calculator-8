package calculator.service.seperator;

import calculator.service.dto.Expression;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SeparatorFactoryTest {

    @Test
    @DisplayName("사용자 정의 구분자 테스트")
    void customSeparator() {
        Expression expression = new Expression("123;123", List.of(";"));
        assertThat(SeparatorFactory.separate(expression)).allMatch(s -> s.equals("123"));
    }

    @Test
    @DisplayName("기본 구분자 테스트")
    void defaultSeparator() {
        Expression expression = new Expression("123:123,123", List.of());
        assertThat(SeparatorFactory.separate(expression)).allMatch(s -> s.equals("123"));
    }
}