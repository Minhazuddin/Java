public class Continue {
    public static void main(String[] args) {
        for(int i=1; i<10; i++){
            if (i==5){
                continue;  // It will make iteration return back without printing 5
            }
            System.out.println(i);
        }
    }
}
