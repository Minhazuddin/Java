public class Test5 {
    public static void main(String[] args) {
        int value = 4;
        switch (value % 2) {
            case 0:
                System.out.println(value + " is Even");
            break;
            case 1:
                System.out.println(value + " is Odd");
            break;
        }
    }
}
