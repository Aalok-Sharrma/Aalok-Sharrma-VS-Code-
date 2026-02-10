package DAY_2_Variables_Data_types;

import java.util.Scanner;

public class D2_15_Type_promotion_in_expressions {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // (i)   Java automatically promotes (converts / increase size of) each byte, short, char operand to int when evaluating an Expression.
        
        // Example-1

        // char a = 'a';
        // char b = 'b';
        // System.out.println(b-a);  // In this first both a and b get converted into int (there ASCII value) then the opration (- subtraction here) proformed  a = 97, b = 98 

        // Example-2

        // char a = 'a';
        // char b = 'b';
        // System.out.println(a-b);  // In this first both a and b get converted into int (there ASCII value) then the opration (- subtraction here) proformed  a = 97, b = 98 

        
        // (ii)  If one operand in long, float, double the whole expression is promoted (convert / increase size to) to long, float, double respectively
        // (it mean each variable will going to convert into largest possible data-type like long, float, double)

        // Example-1 (Possible)
 
        // int    a   = 10;
        // float  b   = 20.25f;
        // long   c   = 25;
        // double d   = 30;
        // double ans = a+b+c+d;      // double
        // System.out.println(ans);

        // Example-2 (Not Possible)

        // int    a   = 10;
        // float  b   = 20.25f;
        // long   c   = 25;
        // double d   = 30;
        // int    ans = a+b+c+d;      // int 
        // System.out.println(ans);


    }
}
