public class RegexTextStrings {
    public static final String EXAMPL_TEST ="This is my " + "small example ";

    public static void main(String[] args) {
        System.out.println(EXAMPL_TEST.matches("\\w.*"));  // Return true if the string matches
        String[] splitString = (EXAMPL_TEST.split("\\s+"));  // Split each string by white space
        System.out.println(splitString.length);  // Return length of the string

        // For loop to print each word
        for (String string : splitString){
            System.out.println(string);  // Print each string
        }
        System.out.println(EXAMPL_TEST.replaceAll("\\s+", "\t"));
    }
}
