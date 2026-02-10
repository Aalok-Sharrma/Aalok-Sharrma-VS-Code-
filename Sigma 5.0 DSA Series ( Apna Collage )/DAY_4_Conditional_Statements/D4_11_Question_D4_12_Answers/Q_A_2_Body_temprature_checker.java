package DAY_4_Conditional_Statements.D4_11_Question_D4_12_Answers;

import java.util.Scanner;

public class Q_A_2_Body_temprature_checker {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your body temprature : ");
        float a=sc.nextFloat();

        if(a>100){
            System.out.println("You have a fever with "+a+" temprature");
        }else{
            System.out.println("You don't have a fever with "+a+" temprature");
        }
    }
}
