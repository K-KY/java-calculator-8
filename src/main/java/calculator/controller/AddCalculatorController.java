package calculator.controller;

public class AddCalculatorController {

    public static AddCalculatorController instance = new AddCalculatorController();
    private AddCalculatorController() {}

    public static AddCalculatorController getInstance() {
        if (instance == null) {
            instance = new AddCalculatorController();
        }
        return instance;
    }

    public Integer add(String input) {
        return 0;
    }
}