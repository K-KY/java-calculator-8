package calculator.service.seperator;

public enum Delimiter {
    COLON(":"), COMMA(",")
    ;

    private final String seperator;

    Delimiter(String seperator) {
        this.seperator = seperator;
    }

    public String getSeperator() {
        return seperator;
    }
}