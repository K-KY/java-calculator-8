package calculator.service.validator;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionValidator {
    static final Pattern pattern = Pattern.compile("\\d+");//한자리 이상의 숫자 정규식
    private static final String CONTAINS_INVALID_CHARACTER = "허용되지 않은 문자가 포함 되어있습니다.";

    public static void validate(List<String> numbers) {
        numbers.forEach(n -> {
            Matcher matcher = pattern.matcher(n);
            if (!matcher.matches()) {
                throw new IllegalArgumentException(CONTAINS_INVALID_CHARACTER);
            }
        });
    }

}
