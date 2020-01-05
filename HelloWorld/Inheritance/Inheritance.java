package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        // Call parent box
        Box box1 = new Box(22,20);
        box1.displayBoxName();

        // Call Small box
        SmallBox box2 = new SmallBox(22,20);
        box2.displayBoxName();
        box2.printArea();

        // Call Big box
        BigBox box3 = new BigBox(22,20,44);
        box3.displayBoxName();
        box3.printArea();
    }
}
