import java.util.Scanner;

public class ConsoleHelper {

    public static void writeMessage(String message) {
        System.out.print(message);
    }

    public static String readMessage() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}
