package calculator.service.seperator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CustomSeparatorTest {

    @Test
    @DisplayName("분리한 반환값은 리스트 타입")
    void seperatorTest() {
        Separator seperator = new CustomSeparator(";");
        assertThat(seperator.separate("123;123")).isInstanceOf(List.class);
    }

    @Test
    @DisplayName("리스트의 값은 String")
    void seperatorReturnsStringTest() {
        Separator seperator = new CustomSeparator(";");
        seperator.separate("123;123")
                .forEach(s -> assertThat(s).isInstanceOf(String.class));
    }

    @Test
    @DisplayName("기본 구분자 문자열 분리 테스트")
    void seperatorLiteralTest() {
        Separator seperator = new CustomSeparator(";");
        assertThat(seperator.separate("123;213").size()).isEqualTo(2);
    }

    @Test
    @DisplayName("문자열 반환 테스트")
    void seperatorLiteralReturnsValidTest() {
        Separator seperator = new CustomSeparator(";");
        assertThat(seperator.separate("123;123").getFirst()).isEqualTo("123");
    }
}