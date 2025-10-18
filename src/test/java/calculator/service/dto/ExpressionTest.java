package calculator.service.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ExpressionTest {

    @Test
    @DisplayName("기본 구분자 테스트")
    void emptyDelimTest() {
        Expression expression = new Expression("1:2:3", List.of());
        assertThat(expression.isDelimiterEmpty()).isTrue();
    }

    @Test
    @DisplayName("사용자 정의 구분자 테스트")
    void notEmptyDelimTest() {
        Expression expression = new Expression("1[2[3", List.of("["));
        assertThat(expression.isDelimiterEmpty()).isFalse();
    }
}