import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter something: ");

        int enteredText = input.nextInt();

        while ( enteredText != 5){
            System.out.print("Enter something: ");
            enteredText = input.nextInt();
        }
        System.out.println("Got the number " + enteredText);
    }
}
