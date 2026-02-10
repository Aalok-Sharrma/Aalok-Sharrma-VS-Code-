package DAY_7_Functions_And_Methods.D7_23_Question_D7_24_Answers;

import java.util.Scanner;

public class Q_A_3_Check_if_number_is_palindrome_or_not {

    public static void palindrome(int a){

        int MyNum = a;
        int Last_Digit = 0;
        int Reverse = 0;

        while (a > 0) {
            Last_Digit = a%10;
            Reverse=(Reverse*10)+Last_Digit;
            a/=10;
        }

        if(MyNum == Reverse){
            System.out.println(MyNum+" is palindrome");
        }else{
            System.out.println(MyNum+" is not palindrome");
        }

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number whose you want to check if it is palindrome or not : ");
        int a=sc.nextInt();

        palindrome(a);
        
    }
}
