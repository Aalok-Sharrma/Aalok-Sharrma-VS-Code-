package DAY_9_Array;

public class D9_12_Print_Subarrays {
    
    public static int Print_Subarrays(int a[]){

/*
         ------------------------------------ Logic to calculate TotalSubarrays ------------------------------------

                                    -------------- By Arithmetic Progration --------------

         TotalSubarrays = (n*(n+1))/2;  It means that the sum of n to 1 

         EXAMPLE :-  As here we have n=5 (n is the range of array n<a.length;)
                     TotalSubarrays = n+(n-1)+(n-2)+...+1 = 5+4+3+2+1 = 15
         
*/

        int TotalSubArray=0;
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(a[k]+" ");
                }
                TotalSubArray++;
                System.out.print("  ");
            }
            System.out.println();
        }
        return TotalSubArray;
    }

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        System.out.println("Total number of Subarrays are : "+Print_Subarrays(a));
    }
}
