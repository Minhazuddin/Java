public class StringInterpolation {
    public static void main(String[] args) {
        String customerName = "Kevin";
        int age = 23;
        String streetName = "South Avenue";
        String city = "Los Angeles";
        String state = "California";
        String country = "United States";
        String zipCode = "90012";

        System.out.println(String.format("Student Details: name: %s, age: %d, streetname: %s, city: %s, state: %s, country: %s, zipcode: %s",
        customerName, age, streetName, city, state, country, zipCode));
    }
}
