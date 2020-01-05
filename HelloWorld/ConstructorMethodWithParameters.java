class Vehicle{
    String make;
    String model;
    int year;

    // Constructor with parameters
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Starting
    public void start(){
            System.out.println("Starting");

    }

}

public class ConstructorMethodWithParameters {
    public static void main(String[] args) {
    // Create ford object
        Vehicle ford = new Vehicle("Ford", "Fiesta", 2010);

    // Starting
        ford.start();

    }
}
