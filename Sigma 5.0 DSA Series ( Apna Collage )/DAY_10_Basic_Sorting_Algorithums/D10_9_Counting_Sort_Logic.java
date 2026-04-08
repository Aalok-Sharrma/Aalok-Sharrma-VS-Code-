package DAY_10_Basic_Sorting_Algorithums;

public class D10_9_Counting_Sort_Logic {
    
    /*
    
      Counting Sort IDEA :- 
             * In this sort the numbers which are in array that each element is not that big and element are positive(+ve).
            ** There we Created a helping array count[] and it range is maximum element in given array a[] and we put the frequence(how may times that element come in given array a[]) of element in index exactly same to the element.

        (1) Ascending Order :-  After creating helping array count[] we array element in array a[] according to frequence in helping array count[] from helping array's count[] index for(i=0; i<=count.lenght-1; i++) [For Ascending Order].
        (2) Descending Order :- After creating helping array count[] we array element in array a[] according to frequence in helping array count[] from helping array's count[] index for(i=count.lenght-1; i>=0; i--) [For Descending Order].
    

----------------------------------------- LOGIC START -----------------------------------------
   
                ------------------------Ascending Order------------------------


        int largest=Integer.MIN_VALUE;

        for(int i=1; i<a.length; i++){
            largest=Math.max(largest, a[i]);
        }

        int count[] = new int[largest+1]; 
        for(int j=0; j<a.length; j++){
            count[a[j]]++; 
        }

        int g=0;
        for(int k=0; k<count.length; k++){
            while (count[k]>0) {
                a[g] = k;
                g++;
                count[k]--;
            }
        }
    
                ------------------------Descending Order------------------------

        int largest=Integer.MIN_VALUE;

        for(int i=1; i<a.length; i++){
            largest=Math.max(largest, a[i]);
        }

        int count[] = new int[largest+1]; 
        for(int j=0; j<a.length; j++){
            count[a[j]]++; 
        }

        int g=0;
        for(int k=count.length-1; k>=0; k--){
            while (count[k]>0) {
                a[g] = k;
                g++;
                count[k]--;
            }
        }

------------------------------------------ LOGIC END ------------------------------------------

       --> Time Complexity = O(n + Range) It's Time Complexity is Good or Bad it all depends 
           on the Range means if range is small the Time Complexity is Good but if range is 
           very large then Time Complexity is Bad. **


    */


}
