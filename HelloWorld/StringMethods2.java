public class StringMethods2 {
    public static void main(String[] args) {
        String str1 = "Hello Students. ";
        String str2 = "Welcome";
        String str3 = "Vorld";
        String str4 = "java";
        String str5 = "     Whitespace       ";
        String str6 = "abc, def, ghi";
        int totalStudents = 50;

        String[] strCount = str6.split("\\s+");   // Split string with regex expression

        System.out.println(str1.concat(str2));  // Joins str1 and str2
        System.out.println(str3.replace('V', 'W'));  // Replace "V" with "W"
        System.out.println(str4.toLowerCase());  // Convert str4 to lower case
        System.out.println(str4.toUpperCase());  // Convert str4 to upper case
        System.out.println(str5.trim());  // Removes all the white spaces
        System.out.println(String.valueOf(totalStudents));  // Parse int to string
        System.out.println(strCount.length);  // Returns length of string

        // For each loop to print each words
        for (String s: strCount){
            System.out.println("Splited Word: " + s);
        }
    }
}
