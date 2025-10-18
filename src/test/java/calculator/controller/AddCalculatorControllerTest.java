package calculator.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddCalculatorControllerTest {


    private final AddCalculatorController controller = AddCalculatorController.getInstance();

    @Test
    @DisplayName("기본 구분자 더하기 테스트")
    void defaultAddTest() {
        Integer add = controller.add("123:123,123");
        assertThat(add).isEqualTo(369);
    }

    @Test
    @DisplayName("사용자 정의 구분자 더하기 테스트")
    void customAddTest() {
        Integer add = controller.add("//;\\n123;123;123");
        assertThat(add).isEqualTo(369);
    }
}