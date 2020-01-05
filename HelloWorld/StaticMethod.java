public class StaticMethod {
    public static void main(String[] args) {
        name("Alex");
        bark();
        sleep();
    }

    public static void name(String name){
        System.out.println("My name is "+ name);
    }

    public static void bark(){
        System.out.println("I'm Barking");
    }

    public static void sleep(){
        System.out.println("I'm Sleeping");
    }
}
