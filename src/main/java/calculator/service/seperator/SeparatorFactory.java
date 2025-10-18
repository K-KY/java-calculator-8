package calculator.service.seperator;

import calculator.service.dto.Expression;

import java.util.List;

public class SeparatorFactory {

    private static final DefaultSeperator DEFAULT_SEPARATOR = DefaultSeperator.getInstance();

    public static List<String> separate(Expression expression) {
        if (expression.isDelimiterEmpty()) {
            return DEFAULT_SEPARATOR.separate(expression);
        }

        Separator customSeparator = new CustomSeparator(expression.getFirstDelimiter());
        return customSeparator.separate(expression);
    }
}
