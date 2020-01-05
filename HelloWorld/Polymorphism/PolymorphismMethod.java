package Polymorphism;

public class PolymorphismMethod {
    public static void main(String[] args) {

        //Create object from parent class
        Vehicle v1 = new Vehicle("Ford", "Figo",2016);
        v1.start();
        v1.stop();

        System.out.println("_________________");
        //Create SUV Object
        SUV v2 = new SUV("Toyota", "Fortuner",2018);
        v2.start();
        v2.stop();

        System.out.println("_________________");
        //Create Sedan Object
        Sedan v3 = new Sedan("Maruti", "Baleno",2019);
        v3.start();
        v3.stop();

        System.out.println("_________________");
        //Create Motorbike Object
        Motorbike v4 = new Motorbike("Pulsar", "220",2015);
        v4.start();
        v4.stop();
    }
}
