package DAY_4_Conditional_Statements;

import java.util.Scanner;

public class D4_4_Else_if_statement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age here : ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Adult");
        }else if(age>13 && age<18){
            System.out.println("Teenager");
        }else{
            System.out.println("Not Adult");
        }
        
    }
}
