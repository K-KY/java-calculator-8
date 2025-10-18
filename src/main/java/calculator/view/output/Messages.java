package calculator.view.output;

public enum Messages {
    INPUT_NUMBERS("덧셈할 문자열을 입력해 주세요."),
    INPUT_RESULT("결과 : "),
    ERROR_OCCURRED("오류가 발생 했습니다.");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}