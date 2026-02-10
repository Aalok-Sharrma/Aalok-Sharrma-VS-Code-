package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_13_Function_overloading_using_data_types {

    public static int sum(int a, int b) {
        return a+b;
    }

    public static float sum(float a, float b) {
        return a+b;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second number : ");
        int b=sc.nextInt();

        int x=sum(a,b);
        float y=sum(a,b);

        System.out.println("Sum of "+a+","+b+" integer number is : "+x);
        System.out.println("Sum of "+a+","+b+" float number is : "+y);

    }
}
