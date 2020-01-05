class Customer{

    // Constructor method
    public Customer(){
        System.out.println("Welcome to Walmart");
    }

    // Instance method to get customer name
    public void getName(String name){
        System.out.println("Customer name is: " + name +"\n");
    }
}

public class ConstructorMethod {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.getName("Danny");

        Customer customer2 = new Customer();
        customer2.getName("Deena");
    }
}
