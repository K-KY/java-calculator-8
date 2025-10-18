package calculator.service.converter;

import java.util.List;
import java.util.stream.Collectors;

public class IntegerConverter {
    public static List<Integer> convert(List<String> input) {
        return input.stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }
}
