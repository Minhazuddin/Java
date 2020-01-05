public class InstanceVariables {
    // Instance variable
    public String name;  // Public variable that is visible to any child class
    private int age;    // Private variable that is visible only to this class

    // Constructor method
    public InstanceVariables(String name){
        this.name = name;
    }

    // Set age
    public void setAge(int age){
        this.age = age;
    }

    // Display Information
    public void displayInfor(){
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {
        InstanceVariables abc = new InstanceVariables("Peter");
        abc.setAge(45);
        abc.displayInfor();
    }
}
