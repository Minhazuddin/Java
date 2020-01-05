package Inheritance;

public class Employee extends Person {
    public String SSN;

    public String getSSN() { return SSN; }

    public void setSSN(String SSN) { this.SSN = SSN; }
}

class InherianceExample{
    public static void main (String[] args){
        Person person1 = new Person();
        person1.setName("Peter");
        person1.setAge(21);
        System.out.println(String.format("%s's age is: %s", person1.getName(),person1.getAge()));

        // Create employee object
        Employee employee1 = new Employee();
        employee1.setName("Mark");
        employee1.setAge(33);
        employee1.setSSN("341-332-541");
        System.out.println(String.format("%s's with SSN: %s age is: %s", employee1.getName(), employee1.getSSN(), employee1.getAge()));
    }
}
