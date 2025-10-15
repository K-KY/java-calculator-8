package calculator;

import calculator.view.UserInterface;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        UserInterface calculatorInterface = new UserInterface();
        Integer add = calculatorInterface.add();
        calculatorInterface.printResult(add);
    }
}
