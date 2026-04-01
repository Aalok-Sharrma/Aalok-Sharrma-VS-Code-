package DAY_10_Basic_Sorting_Algorithums;

public class D10_6_Insertion_Sort_Logic {
    
    /*
    
      Selection Sort IDEA :- 
        (1) Ascending Order :-  Pick an element (From unsorted array) and place in the right position in sorted part in Ascending Order.
        (2) Descending Order :- Pick an element (From unsorted array) and place in the right position in sorted part in Descending Order.

        --> Here we pick an element for i=1 to i=array.length-1 and place in the right position in sorted part in Asce/Desc order.

----------------------------------------- LOGIC START -----------------------------------------
   
                ------------------------Ascending Order------------------------

           for(int i=1; i<a.length; i++){
             int curr = a[i];
             int prev = i-1;

             while(prev>=0 && a[prev]>curr){
               a[prev+1] = a[prev];
               prev--;
             }
             a[prev+1] = curr;
           }
    
                ------------------------Descending Order------------------------

           for(int i=1; i<a.length; i++){
             int curr = a[i];
             int prev = i-1;

             while(prev>=0 && a[prev]<curr){
               a[prev+1] = a[prev];
               prev--;
             }
             a[prev+1] = curr;
           }

------------------------------------------ LOGIC END ------------------------------------------

       --> Time Complexity = O(n^2)   Not Good Time Complexity **


    */

}
