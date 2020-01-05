public class EncapsulationMethod {
    public static void main(String[] args) {
        Encapsulation cust1 = new Encapsulation();
        cust1.setName("Mark");
        cust1.setIdName("23123");
        cust1.setAge(34);
        System.out.println(String.format("%s with ID Num: %s is %d years old", cust1.getName(), cust1.getIdName(), cust1.getAge()));

        //System.out.println(cust1.age);    // Cannot access 'age' as it is defined as private in 'Encapsulation' class
    }
}
