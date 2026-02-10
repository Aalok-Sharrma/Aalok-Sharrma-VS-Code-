package DAY_5_Loops_Flow_Control.D5_16_Question_D5_17_Answers;

import java.util.Scanner;

public class Q_A_3_Find_the_factorial_of_number_entered_by_user {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number whose factorial you needed : ");
        int n=sc.nextInt();

        int factorial=1;

        for(int i=1; i<=n; i++){
            factorial*=i;
        }System.out.println("The factorial of "+n+" is : "+factorial);

    }
}
