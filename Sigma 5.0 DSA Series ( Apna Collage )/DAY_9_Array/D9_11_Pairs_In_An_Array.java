package DAY_9_Array;

public class D9_11_Pairs_In_An_Array {
    
    public static int Pairs_In_An_Array(int a[]){

     /* 
         ------------------------------ Logic Behind The Condition Part Of i Loop ------------------------------

        In condition part of i loop(outer loop) we can give i<a.length-1; also and it will not going to affect 
        the final answer because in INNER LOOP we have intialized j with j=i+1; so, where 'i' will going to reach 
        to last index number j will already excide the limit of the array(means j will going to reach 
        to j=a.length+1;) so, code will going to stop/conclued/return there beacuse j has the limit/condition 
        that j should be less then a.length(j<a.length;) and j is already excided it's limit by
         one(j= i+1 = a.length+1) at the end of the i&j loop. 

         ------------------------------------ Logic to calculate TotalPairs ------------------------------------

                                 -------------- By Arithmetic Progration --------------

         TotalPairs = (n*(n-1))/2;  It means that the sum of n-1 to 1 

         EXAMPLE :-  As here we have n=5 (n is the range of array n<a.length;)
                     TotalPairs = (n-1)+(n-2)+...+1 = 4+3+2+1 = 10
         
     */ 

        int TotalPairs = 0;
        for(int i=0; i<a.length; i++){           
            for(int j=i+1; j<a.length; j++){
                System.out.print(" ["+a[i]+","+a[j]+"] ");
                TotalPairs++;
            }
            System.out.println();
        }

        return TotalPairs;
    }

    public static void main(String[] args) {
        
        int a[] = {2,4,6,8,10};

        System.out.println("Total Pairs are : "+Pairs_In_An_Array(a));
    }
}
