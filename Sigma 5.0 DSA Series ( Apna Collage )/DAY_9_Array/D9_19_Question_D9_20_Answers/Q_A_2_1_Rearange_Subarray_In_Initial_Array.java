package DAY_9_Array.D9_19_Question_D9_20_Answers;

import java.util.Arrays;

public class Q_A_2_1_Rearange_Subarray_In_Initial_Array {

    // It is a My Code For Rearange_Subarray_In_Initial_Array.

    /* This Approach is true for target = 3 only because this is not a optimized approach 
       (optimized code) and for optimized approach (optimized code) you can see the code 
       of Q_A_2_2_Rearange_Subarray_In_Initial_Array. */
 
    public static void rearangeSubarrayInInitialArray(int a[], int target){
        int[] b = new int[target];
        
        for(int i=0; i<a.length; i++){
          if((i<b.length)){
              b[i] = a[i];
          }else {
              a[i-target] = a[i];
              a[i] = b[i-target];
          }
        }
    }
    public static void main(String[] args) {
        int[] a={-1,0,1,2,-1,-4};
        int target = 3;
        System.out.println("Array before revert : "+Arrays.toString(a));
        rearangeSubarrayInInitialArray(a,target);
        System.out.println("Array after revert  : "+Arrays.toString(a));
    }
}
