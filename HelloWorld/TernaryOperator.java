public class TernaryOperator {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;

//        if(i>3)
//            j = 20;
//        else
//            j = 0;

        j = i>6?20:0;

        System.out.println(j);
    }
}