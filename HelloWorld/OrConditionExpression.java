public class OrConditionExpression {
    public static void main(String[] args) {
        double account_balance = 1050000.50;
        int age = 55;
        if (account_balance >= 1000000 || age >= 65){
            System.out.println("It's time to retire");
        } else {
            System.out.println("Work hard and retire rich");
        }
    }
}
