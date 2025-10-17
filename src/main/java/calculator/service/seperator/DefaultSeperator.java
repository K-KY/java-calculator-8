package calculator.service.seperator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DefaultSeperator implements Separator {

    private static final List<Delimiter> delimiter = List.of(Delimiter.values());
    private static final String SPACE = " ";
    private static final DefaultSeperator instance = new DefaultSeperator();

    public static DefaultSeperator getInstance() {
        return instance;
    }

    @Override
    public List<String> separate(String target) {
        for (Delimiter delim : delimiter) {
            target = target.replace(delim.getSeperator(), SPACE);
        }
        return Stream.of(target.split(SPACE)).filter(s -> !s.isEmpty()).collect(Collectors.toList());
    }
}