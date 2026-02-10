package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_20_Code_of_convertion_from_decimal_to_binary {

    public static void DecToBin(int DecNum){

        int MyNum = DecNum;
        int Pow = 0;
        int BinNum = 0;
        while (DecNum > 0) {

            int Rem = DecNum%2;
            BinNum = BinNum+(Rem*(int) Math.pow(10,Pow));
            Pow++;
            DecNum = DecNum/2;
            
        }System.out.println("Binary number of "+MyNum+" is : "+BinNum);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the decimal number whose binary number you needed : ");
        int n=sc.nextInt();
        
        DecToBin(n);
    }
}
