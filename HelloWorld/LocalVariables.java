public class LocalVariables {
    public void getDogAge(){
        int age = 0;  // This is local variable. It can't be accessed in other method
        age = age + 12;
        System.out.println("Dog age is " +age);
    }

    public static void main (String args[]){
        LocalVariables local = new LocalVariables();
        local.getDogAge();
    }
}
