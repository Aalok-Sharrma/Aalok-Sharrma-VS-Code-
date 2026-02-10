package DAY_5_Loops_Flow_Control;

public class D5_7_Print_square_pattern {
    public static void main(String[] args) {
        
        // For loop 

        for(int line=1; line<=4; line++){
            System.out.println("*****");
        }

        // While loop

        int line=1;
        while (line<=4) {
            System.out.println("*****");
            line++;
        }

        // Do while loop

        do{
            System.out.println("*****");
            line++;
        }while(line<=4);

    }
}
