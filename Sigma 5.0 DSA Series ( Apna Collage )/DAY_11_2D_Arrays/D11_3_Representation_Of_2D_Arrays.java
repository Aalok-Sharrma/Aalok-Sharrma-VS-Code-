package DAY_11_2D_Arrays;

import java.util.Arrays;

public class D11_3_Representation_Of_2D_Arrays {
    
    public static void main(String[] args) {
        
        int a[][] = {{1,2,3,4,5},
                     {6,7,8,9,10},
                     {11,12,13,14,15},
                     {16,17,18,19,20}};

        
        // To display/print 2D Arrays as string we use this function ----> " Arrays.deepToString(arrayName); "
        System.out.println("A 2D Array a[][] "+Arrays.deepToString(a));

        /* 
        
        Rows    = 5 (n)
        Columns = 5 (m)

        Size    = nxm = 5x5 = 25
        
        */
    
    }
}
