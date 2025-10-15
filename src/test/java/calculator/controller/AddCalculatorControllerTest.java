package calculator.controller;

import calculator.Application;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddCalculatorControllerTest extends NsTest {

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }

    private final AddCalculatorController controller = AddCalculatorController.getInstance();

    @Test
    public void addTest() {
        Integer add = controller.add("test");

        assertThat(add).isEqualTo(0);
    }
}