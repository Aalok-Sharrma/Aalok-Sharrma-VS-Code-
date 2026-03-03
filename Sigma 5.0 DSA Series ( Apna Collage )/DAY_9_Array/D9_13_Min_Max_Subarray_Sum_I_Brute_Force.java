package DAY_9_Array;

public class D9_13_Min_Max_Subarray_Sum_I_Brute_Force {
    
    public static void Min_Max_Subarray_Sum_I_Brute_Force(int a[]){

/*

       --> Time Complexitiy of below code is :- O(n^3).

       --> This is very bad Time Complexitiy but this is a basic(Brute Force)
           solution to calculate Max and Min Subarray Sum.

*/

        int MaxSubarraySum = Integer.MIN_VALUE;
        int MinSubarraySum = Integer.MAX_VALUE;
        int A = 1;

        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                int CurrentSum = 0;
                for(int k=i; k<=j; k++){
                    CurrentSum += a[k];
                }
                System.out.println("("+A+") "+CurrentSum);
                A++;
                if(CurrentSum > MaxSubarraySum){
                    MaxSubarraySum = CurrentSum;
                }
                if(CurrentSum < MinSubarraySum){
                    MinSubarraySum = CurrentSum;
                }
            }
            System.out.println();
        }

        System.out.println("Maximum SubArray Sum is : "+MaxSubarraySum);
        System.out.println("Minimum SubArray Sum is : "+MinSubarraySum);
    }

    public static void main(String[] args) {

        int a[] = {1,5,-2,-6,5,8};

        Min_Max_Subarray_Sum_I_Brute_Force(a);
        
    }
}
