import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDoWhile {
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
        }
        while( number != 6 );
        System.out.println("You typed the Number 5");
    }
}
