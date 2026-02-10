package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_3_Syntax_of_function_which_have_parameters {

    public static int ClaculateSum(int a, int b){

        int sum=a+b;
        return sum;
    }

    public static void ClaculateSum(float a, float b){

        int sum=(int)(a+b);

        System.out.println("Sum is : "+sum);
    }

    public static void ClaculateSum(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second number : ");
        int b=sc.nextInt();
        int sum=a+b;

        System.out.println("Sum is : "+sum);
    }
    public static void main(String[] args) {
        
        // return type function_name(type parameter1 , type parameter2){
        //     // body
        //     return statement;
        // }

        // QUESTION --> Sum of a and b 

        // ------------------------------------(i)------------------------------------

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int i=sc.nextInt();
        System.out.print("Enter the second number : ");
        int j=sc.nextInt();
        int sum=i+j;

        System.out.println("Sum is : "+sum);

        // ------------------------------------(ii)-----------------------------------

        ClaculateSum();

        // -----------------------------------(iii)-----------------------------------

        Scanner al = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        float x=al.nextFloat();
        System.out.print("Enter the second number : ");
        float y=al.nextFloat();

        ClaculateSum(x,y);

        // ------------------------------------(iv)-----------------------------------

        Scanner ok= new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a=ok.nextInt();
        System.out.print("Enter the second number : ");
        int b=ok.nextInt();

        int add=ClaculateSum(a,b);

        System.out.println("Sum is : "+add);


    }
}
