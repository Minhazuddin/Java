public class SwitchStatement {
    public static void main(String[] args) {
        String grade = "C";
        switch (grade){
            case "A+":
                System.out.println("Outperforming Student");
                break;
            case "A":
                System.out.println("Excellent Student");
                break;
            case "B": case "B+":
                System.out.println("Good Student");
                break;
            case "C": case "C+":
                System.out.println("Average Student");
                break;
            case "D": case "D+":
                System.out.println("Poor Student");
                break;
            default:
                System.out.println("Failed Student");
                break;
        }
    }
}
