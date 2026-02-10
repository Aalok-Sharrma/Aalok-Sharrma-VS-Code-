package DAY_7_Functions_And_Methods.D7_23_Question_D7_24_Answers;

import java.util.Scanner;

public class Q_A_1_Write_java_method_for_average_of_three_numbers {

    public static int average(int a, int b, int c){

        return (a+b+c)/3;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a=sc.nextInt();
        System.out.print("Enter second number : ");
        int b=sc.nextInt();
        System.out.print("Enter third number : ");
        int c=sc.nextInt();

        int avg=average(a, b, c);

        System.out.println("The average of "+a+","+b+","+c+" is : "+avg);

    }
}
