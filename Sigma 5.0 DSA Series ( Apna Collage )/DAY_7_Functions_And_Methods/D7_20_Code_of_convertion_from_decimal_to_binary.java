package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_20_Code_of_convertion_from_decimal_to_binary {

    public static void decToBin(int decNum){

        int myNum = decNum;
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {

            int rem = decNum%2;
            binNum = binNum+(rem*(int) Math.pow(10,pow));
            pow++;
            decNum = decNum/2;
            
        }System.out.println("Binary number of "+myNum+" is : "+binNum);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the decimal number whose binary number you needed : ");
        int n=sc.nextInt();
        
        decToBin(n);
    }
}
