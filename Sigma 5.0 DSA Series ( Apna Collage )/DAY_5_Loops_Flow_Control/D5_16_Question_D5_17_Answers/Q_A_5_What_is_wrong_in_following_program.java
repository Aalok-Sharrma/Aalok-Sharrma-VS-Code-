package DAY_5_Loops_Flow_Control.D5_16_Question_D5_17_Answers;

public class Q_A_5_What_is_wrong_in_following_program {
    public static void main(String[] args) {
        
        // for(int i=0; i<=5; i++){
        //     System.out.println("i = "+i);                // Print 1
        // }System.out.println("i after the loop : "+i);    // Print 2

        // --> The scope of variable "i" is limited in the block {} of "for loop block" and we can't 
        //     use the variable outside the "for loop block" if we need to use it outside so, we need
        //     to declare it outside loop (as global variable)

        // Right way to write above code in writen below
 
        int i;
        for(i=0; i<=5; i++){
            System.out.println("i = "+i);                // Print 1
        }System.out.println("i after the loop : "+i);    // Print 2

    }
}
