public class ForEachLoop {
    public static void main(String[] args) {

        // For Each Loop
        String[] celebrities = {"Enrique", "Rock", "John", "Alex", "Smith", "Peter"};
        for (String name:celebrities) {
            System.out.print(name);
            System.out.print(", ");
        }
            System.out.println("\n");
        // Integer array
        int[] age = {22, 45, 22, 56, 75, 43};
        for (int x: age){
            System.out.print(x);
            System.out.println(", ");
        }

    }
}
