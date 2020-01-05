package Inheritance;

public class BigBox extends Box {
    private int length;
    private int width;
    private int height;

    public BigBox(int l, int w, int h){
        super(l, w);
        this.length = l;
        this.width = w;
        this.height = h;
    }

    // Print box name
    public void displayBoxName(){
        System.out.println("I'm Big Box class");
    }

    // Print area
    public void printArea(){
        double area = length * width * height;
        System.out.println("Area is: " + area);
    }
}
