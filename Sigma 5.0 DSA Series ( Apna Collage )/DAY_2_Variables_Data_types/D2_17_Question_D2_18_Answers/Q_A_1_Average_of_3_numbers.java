package DAY_2_Variables_Data_types.D2_17_Question_D2_18_Answers;

import java.util.Scanner;

public class Q_A_1_Average_of_3_numbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();

        float avg = (a+b+c)/3;

        System.out.println("The average of "+a+","+b+","+c+" is : "+avg);

    }
}
