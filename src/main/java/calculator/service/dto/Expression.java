package calculator.service.dto;

import java.util.List;

public record Expression(String expression, List<String> delimiter) {}