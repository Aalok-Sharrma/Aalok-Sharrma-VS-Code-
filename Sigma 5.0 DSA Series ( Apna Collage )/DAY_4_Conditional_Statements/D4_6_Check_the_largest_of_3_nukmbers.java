package DAY_4_Conditional_Statements;

import java.util.Scanner;

public class D4_6_Check_the_largest_of_3_nukmbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        if((a>b) && (a>c)){
            System.out.println(a+" is largest of "+a+","+b+" and "+c);
        } if((b>a) && (b>c)){
            System.out.println(b+" is largest of "+a+","+b+" and "+c);
        } else{
            System.out.println(c+" is largest of "+a+","+b+" and "+c);
        }

    }
}
