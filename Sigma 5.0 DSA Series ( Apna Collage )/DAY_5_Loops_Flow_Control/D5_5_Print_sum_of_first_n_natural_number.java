package DAY_5_Loops_Flow_Control;

import java.util.Scanner;

public class D5_5_Print_sum_of_first_n_natural_number {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();

        int sum=0;
        int i=1;
        while (i<=n) {
            sum+=i;
            i++;
        }System.out.println("Sum from 1 to "+n+" is : "+sum);

    }
}
