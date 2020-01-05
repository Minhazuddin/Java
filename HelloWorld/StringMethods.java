public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello Students" + "Welcome to Java World";
        String str2 = "Welcome";
        String str3 = "";

        System.out.println(str1.length());   // Find length of the string
        System.out.println(str1.substring(1));  // Return string after 1 index
        System.out.println(str1.substring(3,20));  // Returns string from and to index
        System.out.println(str1.contains("Hello"));  // Returns true if str1 contains "Hello"
        System.out.println(str2.equals("welcome"));  // Returns true if str2 equals to "Welcome" (Case sensitive)
        System.out.println(str2.equalsIgnoreCase("welcome")); // Returns true if str2 equals to "Welcome" (non case sensitive)
        System.out.println(str3.isEmpty()); // Returns true if str3 is empty
    }
}
