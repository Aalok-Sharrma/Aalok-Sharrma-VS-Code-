package DAY_2_Variables_Data_types;

import java.util.Scanner;

public class D2_10_Sum_of_a_and_b_with_input_from_user {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum of "+a+" and "+b+" is : "+sum);
        
    }
}
