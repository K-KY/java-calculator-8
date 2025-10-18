package calculator.service.seperator;

import calculator.service.dto.Expression;

import java.util.List;

public interface Separator {
    List<String> separate(Expression expression);
}