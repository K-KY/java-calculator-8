package calculator.view.input;

import calculator.view.output.Messages;
import calculator.view.output.UserOutput;
import camp.nextstep.edu.missionutils.Console;

public class UserInput {

    //메세지 출력 없음
    public static String read() {
        return Console.readLine();
    }

    //메세지를 출력하는 인풋
    public static String read(Messages messages) {
        UserOutput.println(messages.getMessage());
        return read();
    }
}