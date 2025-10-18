package calculator.view.output;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MessagesTest {

    @Test
    @DisplayName("상수 반환 테스트")
    void messagesTest() {
        assertThat(Messages.INPUT_RESULT.getMessage()).isEqualTo("결과 : ");
        assertThat(Messages.INPUT_NUMBERS.getMessage()).isEqualTo("덧셈할 문자열을 입력해 주세요.");
        assertThat(Messages.ERROR_OCCURRED.getMessage()).isEqualTo("오류가 발생 했습니다.");
    }
}