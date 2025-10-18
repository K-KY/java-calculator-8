package calculator.service.validator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

class ExpressionValidatorTest {

    @Test
    void invalidExpression() {
        assertThrows(IllegalArgumentException.class, () -> ExpressionValidator.validate(List.of("1", "2", "-3")));
    }

    @Test
    void validExpression() {
        assertThatCode(() -> ExpressionValidator.validate(List.of("1", "2", "3"))).doesNotThrowAnyException();
    }
}