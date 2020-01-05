package Inheritance;

public class SmallBox extends Box {
    private int length;
    private double width;

    public SmallBox(int l, int w){
        super(l, w);
        this.length = l;
        this.width = w;
    }

    // Print box name
    public void displayBoxName(){
        System.out.println("I'm Small Box class");
    }

    // Print area
    public void printArea(){
        double area = length * width;
        System.out.println("Area is: " + area);
    }

}
