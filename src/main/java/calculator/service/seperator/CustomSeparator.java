package calculator.service.seperator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomSeparator implements Separator {
    private final String delimiter;
    private static final String SPACE = " ";

    public CustomSeparator(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public List<String> separate(String target) {
        target = target.replace(delimiter, SPACE);
        return Stream.of(target.split(SPACE)).filter(s -> !s.isEmpty()).collect(Collectors.toList());
    }
}
