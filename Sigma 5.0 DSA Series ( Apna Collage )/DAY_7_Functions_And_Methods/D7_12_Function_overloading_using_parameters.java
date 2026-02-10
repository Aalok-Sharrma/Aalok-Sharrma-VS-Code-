package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_12_Function_overloading_using_parameters {

    public static int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static int sum(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second number : ");
        int b=sc.nextInt();
        System.out.print("Enter the third number : ");
        int c=sc.nextInt();

        int x=sum(a,b,c);
        int y=sum(a,b);

        System.out.println("Sum of "+a+","+b+","+c+" is : "+x);
        System.out.println("Sum of "+a+","+b+" is : "+y);

    }
}
