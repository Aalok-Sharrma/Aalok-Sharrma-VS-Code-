package DAY_7_Functions_And_Methods.D7_23_Question_D7_24_Answers;

import java.util.Scanner;

public class Q_A_3_Check_if_number_is_palindrome_or_not {

    public static void palindrome(int a){

        int myNum = a;
        int lastDigit = 0;
        int reverse = 0;

        while (a > 0) {
            lastDigit = a%10;
            reverse=(reverse*10)+lastDigit;
            a/=10;
        }

        if(myNum == reverse){
            System.out.println(myNum+" is palindrome");
        }else{
            System.out.println(myNum+" is not palindrome");
        }

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number whose you want to check if it is palindrome or not : ");
        int a=sc.nextInt();

        palindrome(a);
        
    }
}
