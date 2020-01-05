package Polymorphism;

public class Sedan extends Vehicle {
    public Sedan(String make, String model, int year) {
        super(make, model, year);
    }

    // Start Method
    public void start() {
        System.out.println(String.format("%s %s %d Starting", getMake(), getModel(), getYear()));
    }
    // Stop Method
    public void stop() {
        System.out.println(String.format("%s %s %d Stopping", getMake(), getModel(), getYear()));
    }
}
