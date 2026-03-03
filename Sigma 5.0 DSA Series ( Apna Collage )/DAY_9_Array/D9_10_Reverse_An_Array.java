package DAY_9_Array;

import java.util.Arrays;

public class D9_10_Reverse_An_Array {

    // ---------------------------------- IMPORTANT ----------------------------------

    /* THIS QUESTION HAVE VERY IMPORTANT LOGIC AND THIS IMPORTANT LOGIC IS 
       EXPLAINED AND PRACTICALLY SHOWN IN " D9_4_Array_As_Function_Arrguments " file. */

    public static void Reverse_An_Array(int a[]){

        int first = 0;
        int last = a.length-1;
        int temp;

        while(first<=last){

            temp = a[last];
            a[last] = a[first];
            a[first] = temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int a[] = {1,-2,3,4,-5};
        System.out.println("It is an a[] Array BEFORE it's Reverse : "+Arrays.toString(a));

        Reverse_An_Array(a);
        System.out.println("It is an a[] Array AFTER it's Reverse  : "+Arrays.toString(a));  
        
        /* How without any return from " public static void Reverse_An_Array(int a[]) " function 
           we are able to display reveresed Array in " public static void main(String[] args) " function 
           with is reveresed in " public static void Reverse_An_Array(int a[]) " function 
           and not in " public static void main(String[] args) " function it's complete LOGIC/CONCEPT/REASON 
           is already explained and practically shown in " D9_4_Array_As_Function_Arrguments " file.  */

    }
}