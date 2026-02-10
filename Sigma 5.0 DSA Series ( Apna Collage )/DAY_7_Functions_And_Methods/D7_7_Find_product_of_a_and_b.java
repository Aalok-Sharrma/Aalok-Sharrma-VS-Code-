package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_7_Find_product_of_a_and_b {

    public static int multiply(int a, int b){

        int prod=a*b;
        return prod;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a=sc.nextInt();
        System.out.print("Enter second number : ");
        int b=sc.nextInt();
        int prod=multiply(a,b);
        System.out.println(a+" * "+b+" = "+prod);
        
    }
}
