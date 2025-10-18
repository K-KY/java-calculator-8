package calculator.service;

import calculator.service.dto.Expression;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {

    @Test
    @DisplayName("기본 구분자 더하기 테스트")
    void defaultAddTest() {
        Calculator calculator = new Calculator();
        Expression expression = new Expression("123:123,123", List.of());
        assertThat(calculator.add(expression)).isEqualTo(369);
    }

    @Test
    @DisplayName("사용자 정의 구분자 더하기 테스트")
    void customAddTest() {
        Calculator calculator = new Calculator();
        Expression expression = new Expression("123;123;123", List.of(";"));
        assertThat(calculator.add(expression)).isEqualTo(369);
    }

    @Test
    @DisplayName("허용되지 않은 문자 예외")
    void exceptionInvalidCharacterTest() {
        Calculator calculator = new Calculator();
        assertThatThrownBy(() -> calculator.add(new Expression("123;123;123", List.of())))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("정의되지 않은 구분자 예외")
    void exceptionInvalidCharacterTest2() {
        Calculator calculator = new Calculator();
        assertThatThrownBy(() -> calculator.add(new Expression("//,\\n123;123;123", List.of())))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("더한 결과가 오버플로우 예외")
    void exceptionInvalidNumberTest() {
        Calculator calculator = new Calculator();
        assertThatThrownBy(() -> calculator.add(new Expression("2147483640:123:123", List.of())))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("더할 숫자가 너무 큼 예외")
    void exceptionInvalidNumberTest2() {
        Calculator calculator = new Calculator();
        assertThatThrownBy(() -> calculator.add(new Expression("2147483648:123:123", List.of())))
                .isInstanceOf(IllegalArgumentException.class);
    }
}