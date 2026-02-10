package DAY_5_Loops_Flow_Control;

import java.util.Scanner;

public class D5_4_Print_numbers_from_1_to_n {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int counter=1;
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        while (counter<=n){
            System.out.println(counter);
            counter++;
        }System.out.println("We have printed the numbers from 1 to "+n);
        
    }
}
