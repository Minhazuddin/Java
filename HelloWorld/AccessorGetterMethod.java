class Automobile{
    String make;
    String model;
    int year;

    // Constructor with parameter
    public Automobile(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter method
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    // Starting
    public void start(){
        System.out.println("Starting");
    }
}

public class AccessorGetterMethod {
    public static void main(String[] args) {
    // Create ford object
        Automobile toyota = new Automobile("Toyota", "Camry", 1990);

    // Use getter method to get the value

        System.out.println("Car make is: " + toyota.getMake());
        System.out.println("Car model is: " + toyota.getModel());
        System.out.println("Car year is: " + toyota.getYear());

        // Starting
        toyota.start();
    }
}
