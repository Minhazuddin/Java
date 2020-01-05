public class DogClass {
    public static void main(String[] args) {
        name_of_dog("Sherra");
        bark();
        sleep();
        eat();
    }
    public static void name_of_dog(String name){
        System.out.println(String.format("My Name is %s", name));
    }
    public static void bark(){
        System.out.println("I'm barking");
    }
    public static void sleep(){
        System.out.println("I'm Sleeping");
    }
    public static void eat(){
        System.out.println("I'm Eating");
    }
}
