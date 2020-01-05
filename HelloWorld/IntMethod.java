public class IntMethod {
    public static void main(String[] args) {

        System.out.println("Your age is: " + findAge(1980));
    }

    public static int findAge(int year){
        int age = 2019 - year;
        return age;
    }
}

