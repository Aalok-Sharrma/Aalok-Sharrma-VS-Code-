package DAY_2_Variables_Data_types;

import java.util.Scanner;

public class D2_11_Product_of_a_and_b_with_input_from_user {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        int product = a * b;

        System.out.println("Product of "+a+" and "+b+" is : "+product);
        
    }
}
