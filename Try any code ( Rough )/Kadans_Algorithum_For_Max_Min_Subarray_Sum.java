public class Kadans_Algorithum_For_Max_Min_Subarray_Sum {
    
    public static void Kadans_Algorithum_For_Max_Min_Subarray_Sum(int a[]){

        int MinSubarraySum = 0;
        int MaxSubarraySum = Integer.MIN_VALUE;
        int CurrentSum = 0;

        for(int i=0; i<a.length; i++){
            CurrentSum+=a[i];
            MinSubarraySum = Math.min(MinSubarraySum + a[i], MinSubarraySum);
            if(CurrentSum < 0){
            CurrentSum = 0;
            }
            MaxSubarraySum = Math.max(CurrentSum , MaxSubarraySum);
        }

        System.out.println("Maximum SubArray Sum is : "+MaxSubarraySum);
        System.out.println("Minimum SubArray Sum is : "+MinSubarraySum);
    }

    public static void main(String[] args) {
        
        int a[] = {1,5,-2,-6,5,8};
        Kadans_Algorithum_For_Max_Min_Subarray_Sum(a);
    }
}
