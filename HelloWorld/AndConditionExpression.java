public class AndConditionExpression {
    public static void main(String[] args) {
        double grade = 11.0;

        if (grade == 6.0){
            System.out.println("You are an average student");
        } else if (grade >= 6.0 && grade <= 7.0){
            System.out.println("You are above average student");
        } else if (grade >= 8.0 && grade <= 10.0){
            System.out.println("You are an excellent student");
        } else if (grade > 10){
            System.out.println("You are an Outperforming ");
        }
          else {
            System.out.println("Poor student! You need to work hard");
        }
    }
}
