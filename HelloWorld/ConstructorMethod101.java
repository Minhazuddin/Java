import java.sql.SQLOutput;

public class ConstructorMethod101 {
    // Constructor method
    public ConstructorMethod101(){
        System.out.println("This is constructor method");
    }
    // ConstructorMethod with parameters
    public ConstructorMethod101(String param){
        System.out.println("This is constructor method with parameters " + param);
    }
    // Instance method
    public void InstanceMethod(){
        System.out.println("This is instance method");
    }
}

class ConstructorMethodExample{
    public static void main(String[] args) {
        // Create object method1 with default constructor
        ConstructorMethod101 method1 = new ConstructorMethod101();
        method1.InstanceMethod();
        System.out.println(); // To break line

        // Create object method2 with constructor having parameter
        ConstructorMethod101 method2 = new ConstructorMethod101("Constructor");
        method2.InstanceMethod();
    }
}
