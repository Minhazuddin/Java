import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter something: ");

        String enteredText = input.nextLine();

        System.out.println("You entered " + "\"" + enteredText + "\"");
    }
}
