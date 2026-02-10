package DAY_4_Conditional_Statements;

import java.util.Scanner;

public class D4_3_Print_if_a_number_is_odd_or_even {
    public static void main(String[] args) {
        
        // Even (x%2==0) and  Odd (x%2!=0)

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int x = sc.nextInt();

        if(x%2==0){
            System.out.println(x+" is even");
        } else{
            System.out.println(x+" is odd");
        }
        
    }
}
