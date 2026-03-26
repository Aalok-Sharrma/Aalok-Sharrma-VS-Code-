package DAY_9_Array;

// It is a Shradha Kapara Ma'am Code For Kadanes Max Subarray Sum Algorithum.

public class D9_15_1_Max_Subarray_Sum_III_Kadanes_Algorithum {
    
    public static int maxSubarraySumIIIKadanesAlgorithum(int a[]){

        int maxSubarraySum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0; i<a.length; i++){
            currentSum+=a[i];

            if(currentSum < 0){
            currentSum = 0;
            }
            maxSubarraySum = Math.max(currentSum , maxSubarraySum);
        }

        return maxSubarraySum;
    }

    public static void main(String[] args) {
        
        int a[] = {1,5,-2,-6,5,8};
        System.out.println("Maximum SubArray Sum is : "+maxSubarraySumIIIKadanesAlgorithum(a));
    }
}
