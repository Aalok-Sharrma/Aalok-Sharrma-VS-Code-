package DAY_9_Array;

// It is a My Code For Kadanes Max and Min Subarray Sum Algorithum.

public class D9_15_2_Max_Subarray_Sum_III_Kadanes_Algorithum {
    
    public static void Max_Min_Subarray_Sum(int a[]){

        int CurrentMax = 0;
        int MaxSubarraySum = Integer.MIN_VALUE;
        int CurrentMin = 0;
        int MinSubarraySum = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++){
            CurrentMax = Math.max(CurrentMax + a[i], a[i]);
            MaxSubarraySum = Math.max(CurrentMax , MaxSubarraySum);

            CurrentMin = Math.min(CurrentMin + a[i], a[i]);
            MinSubarraySum = Math.min(CurrentMin, MinSubarraySum);
        }
        System.out.println("Maximum SubArray Sum is : "+MaxSubarraySum);
        System.out.println("Minimum SubArray Sum is : "+MinSubarraySum);
    }

    public static void main(String[] args) {
        
        int a[] = {1,5,-2,-6,5,8};
        Max_Min_Subarray_Sum(a);
    }
}
