package DAY_9_Array;

public class D9_13_Min_Max_Subarray_Sum_I_Brute_Force {
    
    public static void minMaxSubarraySumIBruteForce(int a[]){

/*

       --> Time Complexitiy of below code is :- O(n^3).

       --> This is very bad Time Complexitiy but this is a basic(Brute Force)
           solution to calculate Max and Min Subarray Sum.

*/

        int maxSubarraySum = Integer.MIN_VALUE;
        int minSubarraySum = Integer.MAX_VALUE;
        int b = 1;

        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                int currentSum = 0;
                for(int k=i; k<=j; k++){
                    currentSum += a[k];
                }
                System.out.println("("+b+") "+currentSum);
                b++;
                if(currentSum > maxSubarraySum){
                    maxSubarraySum = currentSum;
                }
                if(currentSum < minSubarraySum){
                    minSubarraySum = currentSum;
                }
            }
            System.out.println();
        }

        System.out.println("Maximum SubArray Sum is : "+maxSubarraySum);
        System.out.println("Minimum SubArray Sum is : "+minSubarraySum);
    }

    public static void main(String[] args) {

        int a[] = {1,5,-2,-6,5,8};

        minMaxSubarraySumIBruteForce(a);
        
    }
}
