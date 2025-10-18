package calculator.service;

import calculator.service.converter.IntegerConverter;
import calculator.service.dto.Expression;
import calculator.service.seperator.SeparatorFactory;
import calculator.service.validator.ExpressionValidator;

import java.util.List;

public class Calculator {

    public Integer add(Expression expression) {
        List<String> separate = SeparatorFactory.separate(expression);
        ExpressionValidator.validate(separate);
        try {
            List<Integer> numbers = IntegerConverter.convert(separate);
            return numbers.stream().reduce(0, Math::addExact);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("허용 범위를 벗어난 숫자입니다.");
        }
    }
}
