package DAY_2_Variables_Data_types.D2_17_Question_D2_18_Answers;

import java.util.Scanner;

public class Q_A_3_Calculate_total_cost_with_GST {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first item price : ");
        int a = sc.nextInt();
        System.out.print("Enter the second item price : ");
        int b = sc.nextInt();
        System.out.print("Enter the third item price : ");
        int c = sc.nextInt();

        float total_cost = a+b+c;
        float bill = total_cost + (total_cost*0.18f);
        System.out.println("The total cost of the items without 18% GST is : "+total_cost);
        System.out.println("The total cost of the items with 18% GST is : "+bill);

    }
}
