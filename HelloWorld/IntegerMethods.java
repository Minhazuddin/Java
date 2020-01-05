public class IntegerMethods {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 34;
        Integer c = 13;
        Integer d = 100;

        System.out.println(a.intValue()); // Returns integer value of a
        System.out.println(b.doubleValue());  // Returns double value of b
        System.out.println(c.floatValue());  // Returns float value of c
        System.out.println(Integer.parseInt("12345"));
        System.out.println(Integer.compare(100, 100));  // Returns 0 if equal
        System.out.println(Integer.compare(100, 90)); // Returns 1 if not equals and -1 if x < y
        System.out.println(a.equals(d));  // Returns true if a equals d, else return false

    }
}
