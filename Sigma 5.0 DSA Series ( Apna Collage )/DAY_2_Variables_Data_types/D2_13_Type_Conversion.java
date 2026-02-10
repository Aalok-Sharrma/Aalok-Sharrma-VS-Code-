package DAY_2_Variables_Data_types;

import java.util.Scanner;

public class D2_13_Type_Conversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Conversion happens when :-

        // (i)  Type is compatible

        //     int  -->  long                  Possible
        //     long -->  int                   Not Possible
        //     int  -->  boolean               Not Possible

        // (ii) Destination Type > Source Type

        //      int  a = 15;
        //      long b = a;                    Possible

        //      System.out.println(b);  

        //      long x = 15;
        //      int  y = x;                    Not Possible

        //      System.out.println(b);


        // Exter Knowledge

        // (i)  float no = sc.nextInt();       Possible 

        // (ii) int no = sc.nextFloat();       Not Possible

    }
}
