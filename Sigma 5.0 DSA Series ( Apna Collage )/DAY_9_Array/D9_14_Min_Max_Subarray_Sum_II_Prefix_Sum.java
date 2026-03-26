package DAY_9_Array;

public class D9_14_Min_Max_Subarray_Sum_II_Prefix_Sum {
    
    public static void minMaxSubarraySumIIPrefixSum(int a[]){

        int currentSum = 0;
        int maxSubarraySum = Integer.MIN_VALUE;
        int minSubarraySum = Integer.MAX_VALUE;
        int prefix[] = new int[a.length];
        prefix[0] = a[0];

        for(int i=1; i<a.length; i++){
            prefix[i] = prefix[i-1] + a[i];
        }

        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                currentSum = i == 0? prefix[j] : prefix[j] - prefix[i-1];

                if(currentSum > maxSubarraySum){
                    maxSubarraySum = currentSum;
                }
                if(currentSum < minSubarraySum){
                    minSubarraySum = currentSum;
                }
            }
        }
        System.out.println("Maximum SubArray Sum is : "+maxSubarraySum);
        System.out.println("Minimum SubArray Sum is : "+minSubarraySum);
    }

    public static void main(String[] args) {

        int a[] = {1,5,-2,-6,5,8};

        minMaxSubarraySumIIPrefixSum(a);
        
    }
}
