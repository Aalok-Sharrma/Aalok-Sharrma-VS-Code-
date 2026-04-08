package DAY_10_Basic_Sorting_Algorithums;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class D10_8_Java_Inbuild_Function_For_Sorting {

    public static void main(String[] args) {
        
    /*
    ------------------------------------- (1) ------------------------------------- 

    import java.util.Arrays;                           --> It is mandatory line to import below functions (i) and (ii)
    
    (i)  Arrays.sort(arr);                             --> To sort complete array arr[]
    (ii) Arrays.sort(arr,startingIndex, endingIndex);  --> To sort an array arr[] in a range(From startingIndex to endingIndex)


    *    The Time Complexitiy of Function (1) [(i) and (ii)] AND (2) [(iii) and (iv)] is O(nlogn) Best Time Complexity ** 
    **   This Function (1) [(i) and (ii)] sortes the array in Ascending Order.
    ***  endingIndex is not inclusive means it is not included in sorted part.
    **** What ever array we pass in this function (1) [(i) and (ii)] it can be an int etc(Premitive) DataTypes.

    */

    int a[] = {2,7,1,0,3,7,5}; // *** What ever array we pass in this function (1) [(i) and (ii)] it can be an int etc(Premitive) DataTypes.

    Arrays.sort(a, 0, 3);
    System.out.println("Array sorted by (ii) form index 0 to 3 in Ascending Order looks like     "+Arrays.toString(a));

    Arrays.sort(a);
    System.out.println("Array sorted by (i) complete sort array in Ascending Order looks like    "+Arrays.toString(a));

    /*
    ------------------------------------- (2) ------------------------------------- 

    import java.util.Collections;                                                   --> It is mandatory line to import below functions (i) and (ii)
    
    (iii)  Arrays.sort(arr, Collection.reverseOrder());                             --> To sort complete array arr[]
    (iv)   Arrays.sort(arr,startingIndex, endingIndex, Collection.reverseOrder());  --> To sort an array arr[] in a range(From startingIndex to endingIndex)


    *    The Time Complexitiy of Function (1) [(i) and (ii)] AND (2) [(iii) and (iv)] is O(nlogn) Best Time Complexity ** 
    **   This Function (2) [(iii) and (iv)] sortes the array in Descending Order.
    ***  endingIndex is not inclusive means it is not included in sorted part.
    **** What ever array we pass in this function (2) [(iii) and (iv)] it should be Integer(Non-Premitive) DataTypes.

    */

    Integer b[] = {2,7,1,0,3,7,5}; // *** What ever array we pass in this function (2) [(iii) and (iv)] it should be Integer(Non-Premitive) DataTypes.


    Arrays.sort(b, 0, 3, Collections.reverseOrder());
    System.out.println("Array sorted by (iv) form index 0 to 3 in Descending Order looks like    "+Arrays.toString(b));

    Arrays.sort(b, Collections.reverseOrder());
    System.out.println("Array sorted by (iii) complete sort array in Descending Order looks like "+Arrays.toString(b));
    
    }

}
