package DAY_9_Array;

// It is a Shradha Kapara Ma'am Code For Kadanes Max Subarray Sum Algorithum.

public class D9_15_1_Max_Subarray_Sum_III_Kadanes_Algorithum {
    
    public static int Max_Subarray_Sum_III_Kadanes_Algorithum(int a[]){

        int MaxSubarraySum = Integer.MIN_VALUE;
        int CurrentSum = 0;

        for(int i=0; i<a.length; i++){
            CurrentSum+=a[i];

            if(CurrentSum < 0){
            CurrentSum = 0;
            }
            MaxSubarraySum = Math.max(CurrentSum , MaxSubarraySum);
        }

        return MaxSubarraySum;
    }

    public static void main(String[] args) {
        
        int a[] = {1,5,-2,-6,5,8};
        System.out.println("Maximum SubArray Sum is : "+Max_Subarray_Sum_III_Kadanes_Algorithum(a));
    }
}
