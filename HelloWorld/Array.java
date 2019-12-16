import java.util.Calendar;

public class Array {
    public static void main(String[] args) {
        String[] carNames = new String[] {"Audi", "BMW", "Mercedes", "Toyota", "Chevrolet"};
        int[] carRankPosition = new int[] {1, 2, 3, 4, 5};

        String[] carHeadquarter = new String[5];
        carHeadquarter[0] = "Germany";
        carHeadquarter[1] = "Germany";
        carHeadquarter[2] = "Germany";
        carHeadquarter[3] = "Japan";
        carHeadquarter[4] = "USA";

        System.out.print("Rank ");
        System.out.print("Brand ");
        System.out.println("Country");
        System.out.println();

        System.out.print(carRankPosition[0] + " ");
        System.out.print(carNames[0] + " - ");
        System.out.println(carHeadquarter[0]);

        System.out.print(carRankPosition[1] + " ");
        System.out.print(carNames[1] + " - ");
        System.out.println(carHeadquarter[1]);

        System.out.print(carRankPosition[2] + " ");
        System.out.print(carNames[2] + " - ");
        System.out.println(carHeadquarter[2]);

        System.out.print(carRankPosition[3] + " ");
        System.out.print(carNames[3] + " - ");
        System.out.println(carHeadquarter[3]);

        System.out.print(carRankPosition[4] + " ");
        System.out.print(carNames[4] + " - ");
        System.out.println(carHeadquarter[4]);
    }
}
