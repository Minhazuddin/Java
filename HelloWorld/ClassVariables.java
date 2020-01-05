class ClassVariables {
    public static String name;
    public static String address;
}

class ClassVariablesMethod {
    public static void main(String[] args) {
        ClassVariables.name = "Name is : Peter";
        ClassVariables.address = "Address is : Juhu, Mumbai";
        System.out.println(ClassVariables.name);
        System.out.println(ClassVariables.address);
    }
}
