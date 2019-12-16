public class ForLoopInArray {
    public static void main(String[] args) {

        // Print all array elements
        double[] numberList = {321.10, 145.8, 177.8, 191.80, 210.2};
        for (int i=0; i < numberList.length; i++){
            System.out.println(numberList[i]);
        }

        // Print sum of all elements of array
        double sum = 0;
        for (int i = 0; i < numberList.length; i++) {
            sum += numberList[i];
        }
        System.out.println("Sum is :" +sum);

        // Find and Print largest element of array
        double maxNumber = numberList[0];     // Initialize the first element of array to be largest
        for (int i = 1; i<numberList.length; i++){
            if(numberList[i] > maxNumber){
                maxNumber = numberList[i];
            }
        }
            System.out.println("Largest element of array is " +maxNumber);
    }
}
