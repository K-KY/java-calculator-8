package calculator;

import calculator.view.UserInterface;

public class Application {
    public static void main(String[] args) {
        UserInterface calculatorInterface = new UserInterface();
        Integer add = calculatorInterface.add();
        calculatorInterface.printResult(add);
    }
}
