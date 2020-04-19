class Contructors {
    private String name;
    private int age;

    public Contructors() {
        int age;
        System.out.println("First constructor");

    }

    public Contructors(String name){
        System.out.println("Second constructor");
        }

    public Contructors(String name, int age){
        System.out.println("Third constructor");
        }
    }

public class Test {
    public static void main(String[] args){
        new Contructors();
        new Contructors("Minhaz");
    }
}