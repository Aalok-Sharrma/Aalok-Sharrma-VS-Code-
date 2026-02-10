package DAY_5_Loops_Flow_Control;

public class D5_13_Continue_statement {
    public static void main(String[] args) {
        
        // --> To skip on iteration

        // Logic

        // If i=1 to i<=5 so, when the turn of i=3 comes it skip that turn and continue 

        for(int i=1; i<=5; i++){
            if(i==3){
                continue;
            }System.out.println(i);
        }
        
    }
}
