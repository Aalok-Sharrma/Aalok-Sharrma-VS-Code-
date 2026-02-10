package DAY_4_Conditional_Statements.D4_11_Question_D4_12_Answers;

import java.util.Scanner;

public class Q_A_5_Find_the_year_is_leap_year_or_not {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year as input : ");
        int year=sc.nextInt();

        boolean x=(year%4)==0;
        boolean y=(year%100)!=0;
        boolean z=((year%100==0)&&(year%400==0));

        if(x&&(y||z)){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
        
    }
}
