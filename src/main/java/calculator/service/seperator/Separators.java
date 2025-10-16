package calculator.service.seperator;

public enum Separators {
    COLON(":"), COMMA(",")
    ;

    private final String seperator;

    Separators(String seperator) {
        this.seperator = seperator;
    }

    public String getSeperator() {
        return seperator;
    }
}
