package DAY_7_Functions_And_Methods.D7_23_Question_D7_24_Answers;

import java.util.Scanner;

public class Q_A_5_Compute_the_sum_of_the_digits_in_a_integer {

    public static void sumOfTheDigitsInAInteger(long a){

        long sum = 0;
        long myNum = a;
        while (a>0) {

            long lastDigit = a%10;
            sum+=lastDigit;
            a/=10;

        }System.out.println("Sum of digits of "+myNum+" is : "+sum);
        
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer whose digits sum you want : ");
        long a=sc.nextLong();

        sumOfTheDigitsInAInteger(a);

    }
}
