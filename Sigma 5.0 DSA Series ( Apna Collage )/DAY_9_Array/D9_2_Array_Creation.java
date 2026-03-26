package DAY_9_Array;

import java.lang.reflect.Array;

public class D9_2_Array_Creation {
    public static void main(String[] args) {
        
        // DataTpye ArrayName[] = New DataType[Size];

        int marks[] = new int[15];
        System.out.println(Array.getLength(marks));

        int cclass[] = {4,7,1,2,5};
        System.out.println(Array.getLength(cclass));

        String name[] = {"Aalok Sharrma"};
        System.out.println(Array.getLength(name));
        
    }
}
