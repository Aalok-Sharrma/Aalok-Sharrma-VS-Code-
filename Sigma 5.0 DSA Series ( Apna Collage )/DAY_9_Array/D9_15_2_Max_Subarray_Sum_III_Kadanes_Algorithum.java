package DAY_9_Array;

// It is a My Code For Kadanes Max and Min Subarray Sum Algorithum.

public class D9_15_2_Max_Subarray_Sum_III_Kadanes_Algorithum {
    
    public static void maxMinSubarraySum(int a[]){

        int currentMax = 0;
        int maxSubarraySum = Integer.MIN_VALUE;
        int currentMin = 0;
        int minSubarraySum = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++){
            currentMax = Math.max(currentMax + a[i], a[i]);
            maxSubarraySum = Math.max(currentMax , maxSubarraySum);

            currentMin = Math.min(currentMin + a[i], a[i]);
            minSubarraySum = Math.min(currentMin, minSubarraySum);
        }
        System.out.println("Maximum SubArray Sum is : "+maxSubarraySum);
        System.out.println("Minimum SubArray Sum is : "+minSubarraySum);
    }

    public static void main(String[] args) {
        
        int a[] = {1,5,-2,-6,5,8};
        maxMinSubarraySum(a);
    }
}
