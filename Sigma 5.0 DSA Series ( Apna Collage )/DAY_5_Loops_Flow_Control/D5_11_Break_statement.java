package DAY_5_Loops_Flow_Control;

public class D5_11_Break_statement {
    public static void main(String[] args) {
        
        // --> use to exit the loop 
        
        // Example --> when "i" reach to i=3 exit the loop 

        for(int i=1; i<=5; i++){
            if(i==3){
                break;
            }System.out.println(i);
        }System.out.println("I'm out of the loop");

    }
}
