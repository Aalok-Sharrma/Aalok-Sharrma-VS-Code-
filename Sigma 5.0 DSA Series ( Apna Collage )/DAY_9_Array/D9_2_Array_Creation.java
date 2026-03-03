package DAY_9_Array;

import java.lang.reflect.Array;

public class D9_2_Array_Creation {
    public static void main(String[] args) {
        
        // DataTpye ArrayName[] = New DataType[Size];

        int Marks[] = new int[15];
        System.out.println(Array.getLength(Marks));

        int Class[] = {4,7,1,2,5};
        System.out.println(Array.getLength(Class));

        String Name[] = {"Aalok Sharrma"};
        System.out.println(Array.getLength(Name));
        
    }
}
