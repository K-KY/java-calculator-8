package calculator.view.output;

import java.io.PrintStream;

public class UserOutput {
    private static final PrintStream printStream = System.out;


    public static void println(String message) {
        printStream.println(message);
    }
}
