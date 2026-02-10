package DAY_4_Conditional_Statements;

import java.util.Scanner;

public class D4_2_Print_the_largest_of_2_numbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a+" is largest of "+a+" and "+b);
        } if(a==b){
            System.out.println("Both "+a+" and "+b+" are equal");
        } else{
            System.out.println(b+" is largest of "+b+" and "+a);
        }
        
    }
}
