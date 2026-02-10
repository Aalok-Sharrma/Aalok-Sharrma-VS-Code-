package DAY_5_Loops_Flow_Control.D5_16_Question_D5_17_Answers;

import java.util.Scanner;

public class Q_A_4_Print_the_table_of_number_entered_by_user {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number whose table you needed : ");
        int n=sc.nextInt();
        System.out.print("Enter till you needed the table : ");
        int x=sc.nextInt();

        for(int i=1; i<=x; i++){
            System.out.println(i+" x "+n+" = "+(i*n));
        }

    }
}
