public class BooleanMethod {
    public static void main(String[] args) {
        System.out.println("Is Number Even? "+ isEven(20));
    }

    public static Boolean isEven(int number){
        if (number % 4 == 0){
            return true;
        } return false;
    }
}
