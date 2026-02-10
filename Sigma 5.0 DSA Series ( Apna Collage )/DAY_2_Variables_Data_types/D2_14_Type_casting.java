package DAY_2_Variables_Data_types;

import java.util.Scanner;

public class D2_14_Type_casting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Conversion which are not allow in java but we do that conversion force full.
        // According to java if we are going to use this way of conversion we going to loss some data.

        // Example - 1    Float --> Int ( Possible )       This is possible in both 'Type Conversion' and 'Type Casting'  
        //                Float --> Int ( Not Possible )   This is not possible in 'Type Conversion' but possible in 'Type Casting'

        // INPUT 

        // float a = 15.6f;
        // int b = a;                   ( Not Possible )   This is possible in both 'Type Conversion' and 'Type Casting'             (Wrong way to do)
        // int b = (int) a;             ( Possible )       This is not possible in 'Type Conversion' but possible in 'Type Casting'  (Right way to do)
        // System.out.println(b);

        // OUTPUT

        // 15                           ( Here we get lossed 0.6 data in this )


        // IMPORTANT  notes me Example - 2 bhi he vo bhi code kar dena bad me

    }
}
