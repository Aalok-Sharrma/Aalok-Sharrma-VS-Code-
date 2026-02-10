package DAY_3_Operators;

import java.util.Scanner;

public class D3_2_Arithmetic_binary_operators {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // (1-A) Arithmetic Operators - Binary Operators (means we need two oprands)
        // +,-,*,/,%

        //   +  -->  a + b  =  10 + 5  =  15
        //   -  -->  a - b  =  20 - 5  =  15
        //   *  -->  a * b  =  5 * 3   =  15
        //   /  -->  a / b  =  45 / 3  =  15
        //   %  -->  a % b  =  15 % 3  =  0

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.println();

        System.out.println("Addition = "+(a+b));
        System.out.println("Subtraction = "+(a-b));
        System.out.println("Multiplication = "+(a*b));
        System.out.println("division = "+(a/b));
        System.out.println("Modulus = "+(a%b));

    }
}
