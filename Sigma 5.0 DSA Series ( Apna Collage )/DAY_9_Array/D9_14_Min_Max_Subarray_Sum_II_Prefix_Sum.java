package DAY_9_Array;

public class D9_14_Min_Max_Subarray_Sum_II_Prefix_Sum {
    
    public static void Min_Max_Subarray_Sum_II_Prefix_Sum(int a[]){

        int CurrentSum = 0;
        int MaxSubarraySum = Integer.MIN_VALUE;
        int MinSubarraySum = Integer.MAX_VALUE;
        int Prefix[] = new int[a.length];
        Prefix[0] = a[0];

        for(int i=1; i<a.length; i++){
            Prefix[i] = Prefix[i-1] + a[i];
        }

        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                CurrentSum = i == 0? Prefix[j] : Prefix[j] - Prefix[i-1];

                if(CurrentSum > MaxSubarraySum){
                    MaxSubarraySum = CurrentSum;
                }
                if(CurrentSum < MinSubarraySum){
                    MinSubarraySum = CurrentSum;
                }
            }
        }
        System.out.println("Maximum SubArray Sum is : "+MaxSubarraySum);
        System.out.println("Minimum SubArray Sum is : "+MinSubarraySum);
    }

    public static void main(String[] args) {

        int a[] = {1,5,-2,-6,5,8};

        Min_Max_Subarray_Sum_II_Prefix_Sum(a);
        
    }
}
