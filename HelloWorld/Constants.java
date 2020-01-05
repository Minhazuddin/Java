public class Constants {
    public static String name;
    public static final double PI = 3.1;  // Constants
}

class ConstantsMethod{
    public static void main(String[] args) {
        Constants.name = "David";
        // Constants.PI = 3.99;  // Cannot change the value of 'Constant'
    }

}
