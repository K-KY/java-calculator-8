package calculator.service.seperator;

import calculator.service.dto.Expression;

import java.util.List;

public class Deserializer {

    private static final String CUSTOM_EXIT = "\\n";
    private static final String CUSTOM_ENTRY = "//";
    private static final String EMPTY = "";

    //만약 구분자가 없다면 비어있는 리스트를 반환
    //return : Expression("123:123,123", [])
    public static Expression parse(String expression) {
        if (expression.isEmpty()) {
            throw new IllegalArgumentException("Empty expression");
        }
        expression = expression.trim();

        if (expression.contains(CUSTOM_ENTRY)) {
            return customParse(expression);
        }

        return new Expression(expression, List.of());
    }

    //사용자 정의 구분자
    //param : //:\n123:123:123
    //return : Expression("123:123:123", [:])
    private static Expression customParse(String expression) {
        String[] split = expression.split(CUSTOM_EXIT);
        String[] delimiter = split[0].replaceFirst(CUSTOM_ENTRY, EMPTY).split(CUSTOM_ENTRY);// //[//]\n123123
        return new Expression(split[1], List.of(delimiter));
    }
}