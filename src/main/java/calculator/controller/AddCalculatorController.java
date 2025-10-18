package calculator.controller;

import calculator.service.Calculator;
import calculator.service.dto.Expression;
import calculator.service.seperator.Deserializer;

public class AddCalculatorController {

    private static AddCalculatorController instance;
    private final Calculator calculator;
    private AddCalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    public static AddCalculatorController getInstance() {
        if (instance == null) {
            instance = new AddCalculatorController(new Calculator());
        }
        return instance;
    }

    public Integer add(String input) {
        Expression parse = Deserializer.parse(input.trim());
        return calculator.add(parse);
    }
}