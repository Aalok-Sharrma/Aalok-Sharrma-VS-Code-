package DAY_5_Loops_Flow_Control;

import java.util.Scanner;

public class D5_8_Print_reverse_of_a_number_n {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Logic

        // (i)  need last digit of number   = number%10
        // (ii) remove last digit of number = number/10

        // Code

        System.out.print("Enter the number whose reverse you needed : ");
        long n=sc.nextLong();

        while (n>0) {
            long last_digit = n%10;
            System.out.print(last_digit);
            n/=10;                         // n = n/10;   updation
        }

    }
}
