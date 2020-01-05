class Car {
    String make;
    String model;
    int year;

    // Constructor method with parameters
    public Car(String make, String model, int year){
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

    // Setter method

    public void setMake(String newMake){
        this.make = newMake;
    }
    public void setModel(String newModel){
        this.model = newModel;
    }
    public void setYear(int newYear){
        this.year = newYear;
    }
}


public class AccessorSetterMethod {
    public static void main(String[] args) {
        // Create ford object
        Car ford = new Car("Ford", "Fiesta", 2000);

        // Use getter method to get the value

        System.out.println(ford.getMake());
        System.out.println(ford.getModel());
        System.out.println(ford.getYear());

        // Set to new value

        ford.setMake("Toyota");
        ford.setModel("Fortuner");
        ford.setYear(2019);

        // Get the value again
        System.out.println();
        System.out.println(ford.getMake());
        System.out.println(ford.getModel());
        System.out.println(ford.getYear());
    }
}
