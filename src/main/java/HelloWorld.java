import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = scanner.nextLine();
        System.out.println("You entered \"" + input + "\"");
        System.out.println("Flipped Case: " + swapCase(input));
        System.out.println("Reversed: " + reverse(input));
    }

}