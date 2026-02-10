package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_18_Code_of_convertion_from_binary_to_decimal {

    public static void BinToDec(int BinNum){

        int MyNum = BinNum;
        int Pow = 0;
        int DecNum = 0;
        while (BinNum > 0) {

            int LastDigit = BinNum % 10;
            DecNum = DecNum+(LastDigit*(int) Math.pow(2,Pow));
            Pow++;
            BinNum = BinNum/10;
            
        }System.out.println("Decimal number of "+MyNum+" is : "+DecNum);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number whose decimal number you needed : ");
        int n=sc.nextInt();
        
        BinToDec(n);

    }
}
