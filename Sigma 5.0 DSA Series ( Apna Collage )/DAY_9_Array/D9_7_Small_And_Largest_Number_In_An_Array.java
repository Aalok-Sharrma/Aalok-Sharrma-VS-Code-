package DAY_9_Array;

public class D9_7_Small_And_Largest_Number_In_An_Array {
    
    public static void smallAndLargestNumberInAnArray(int a[]){

        int samllestNumber = Integer.MAX_VALUE;
        int largestNumber  = Integer.MIN_VALUE;
        int smallestNumberIndex = -1;
        int largestNumberIndex  = -1;

        for(int i=0; i<a.length; i++){

            if(a[i]<samllestNumber){
                samllestNumber=a[i];
                smallestNumberIndex=i;
            }
            if(a[i]>largestNumber){
                largestNumber=a[i];
                largestNumberIndex=i;
            }
        }

        System.out.println("Largest number in a[] Array is  : "+largestNumber+" at Index no. : "+largestNumberIndex);
        System.out.println("Smallest number in a[] Array is : "+samllestNumber+" at Index no. : "+smallestNumberIndex);

    }

    public static void main(String[] args) {
        int a[] = {1,2,8,2,87,-3,-2,-5};
        smallAndLargestNumberInAnArray(a);
    }
}
