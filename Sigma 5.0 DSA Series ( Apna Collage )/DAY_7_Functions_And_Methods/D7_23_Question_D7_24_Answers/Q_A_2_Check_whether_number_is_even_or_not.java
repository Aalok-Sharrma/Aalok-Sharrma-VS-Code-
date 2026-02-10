package DAY_7_Functions_And_Methods.D7_23_Question_D7_24_Answers;

import java.util.Scanner;

public class Q_A_2_Check_whether_number_is_even_or_not { 

    public static boolean isEven(int a){

        boolean x;

        if(a%2==0){
            x=true;
        }else{
            x=false;
        }

        return x;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number whose you want to check it is even or not : ");
        int a=sc.nextInt();

        boolean number=isEven(a);

        System.out.println("The number "+a+" is even : "+number);

    }
}
