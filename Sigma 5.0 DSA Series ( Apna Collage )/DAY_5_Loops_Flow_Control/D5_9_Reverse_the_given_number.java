package DAY_5_Loops_Flow_Control;

import java.util.Scanner;

public class D5_9_Reverse_the_given_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Logic

        // (i) rev = (rev*10) + last_digit

        System.out.print("Enter the number whose reverse you needed : ");
        long n=sc.nextLong();
        long rev=0;

        while (n>0) {
            long last_digit = n%10;
            rev = (rev*10) + last_digit;
            n/=10;                         // n = n/10;   updation
        }System.out.print("The reverse of "+n+" is : "+rev);
        
    }
}
