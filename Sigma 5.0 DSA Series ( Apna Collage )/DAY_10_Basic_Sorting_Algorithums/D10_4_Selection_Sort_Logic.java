package DAY_10_Basic_Sorting_Algorithums;

public class D10_4_Selection_Sort_Logic {
    /*
    
      Selection Sort IDEA :- 
        (1) Ascending Order :-  Pick the smallest (From unsorted array), put it at the beginning. [this is for Ascending Order]
        (2) Descending Order :- Pick the largest (From unsorted array), put it at the beginning. [this is for Descending Order]

        --> Here we pick Smallest/Largest for i=0 to i=array.length-2 a put it at the beginning and again repeat this.

----------------------------------------- LOGIC START -----------------------------------------
   
                ------------------------Ascending Order------------------------

           for(int i=0; i<a.length-1; i++){
            int small=i;
             for(int j=i+1; j<a.length; j++){
               if(a[j] < a[small]){
                 small=j;
               }
             }
               int temp = a[small];
               a[small] = a[i];
               a[i] = temp;
           }
    
                ------------------------Descending Order------------------------

           for(int i=0; i<a.length-1; i++){
            int large=i;
             for(int j=i+1; j<a.length; j++){
               if(a[j] > a[large]){
                 large=j;
               }
             }
               int temp = a[large];
               a[large] = a[i];
               a[i] = temp;
           }

------------------------------------------ LOGIC END ------------------------------------------

       --> Time Complexity = O(n^2)   Not Good Time Complexity **


    */
}
