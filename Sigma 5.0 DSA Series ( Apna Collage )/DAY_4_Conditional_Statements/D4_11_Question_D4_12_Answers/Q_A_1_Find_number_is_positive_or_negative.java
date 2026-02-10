package DAY_4_Conditional_Statements.D4_11_Question_D4_12_Answers;

import java.util.Scanner;

public class Q_A_1_Find_number_is_positive_or_negative {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        float a=sc.nextFloat();

        if(a>0){
            System.out.println(a+" is positive number");
        }else{
            System.out.println(a+" is negative number");
        }

    }
}
