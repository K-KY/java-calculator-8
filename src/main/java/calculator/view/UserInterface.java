package calculator.view;

import calculator.controller.AddCalculatorController;
import calculator.view.input.UserInput;
import calculator.view.output.Messages;
import calculator.view.output.UserOutput;

public class UserInterface {
    private static final AddCalculatorController controller = AddCalculatorController.getInstance();

    public Integer add() {
        String read = UserInput.read(Messages.INPUT_NUMBERS);
        return controller.add(read);
    }

    public void printResult(Integer result) {
        UserOutput.println(Messages.INPUT_RESULT.getMessage() + result);
    }
}