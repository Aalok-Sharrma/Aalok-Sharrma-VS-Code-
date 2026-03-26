package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_18_Code_of_convertion_from_binary_to_decimal {

    public static void binToDec(int binNum){

        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {

            int lastDigit = binNum % 10;
            decNum = decNum+(lastDigit*(int) Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
            
        }System.out.println("Decimal number of "+myNum+" is : "+decNum);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number whose decimal number you needed : ");
        int n=sc.nextInt();
        
        binToDec(n);

    }
}
