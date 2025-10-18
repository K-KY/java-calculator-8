package calculator.service.dto;

import java.util.List;

public record Expression(String expression, List<String> delimiter) {
    public boolean isDelimiterEmpty() {
        return delimiter.isEmpty();
    }

    public String getFirstDelimiter() {
        return delimiter.getFirst();
    }
}