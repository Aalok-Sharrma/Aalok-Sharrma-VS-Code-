package DAY_10_Basic_Sorting_Algorithums;

import java.util.Arrays;

public class D10_7_Insertion_Sort_Code {
    
    public static void main(String[] args) {
        
        int a[] = {2,7,1,0,3,7,5};

        System.out.println("Before Asce/Desc Insertion Sort  "+Arrays.toString(a)); // printed array a[] before Ascending (or) Descending insertion sort

        AscendingInsertionSort  ais = new AscendingInsertionSort();  // Created a object 'ais' of 'AscendingInsertionSort' class 
        DescendingInsertionSort dis = new DescendingInsertionSort(); // Created a object 'dis' of 'DescendingInsertionSort' class 

        ais.ascendingInsertionSort(a); // Call the 'ascendingInsertionSort()' method which is present in 'AscendingInsertionSort' class and call by it's object 'ais'
        System.out.println("After Ascending Insertion Sort   "+Arrays.toString(a)); // printed array a[] after ascending insertion sort

        dis.descendingInsertionSort(a); // Call the 'descendingInsertionSort()' method which is present in 'AscendingInsertionSort' class and call by it's object 'dis'
        System.out.println("After Descending Insertion Sort  "+Arrays.toString(a)); // printed array a[] after descending insertion sort




    }
}

class AscendingInsertionSort{

    public void ascendingInsertionSort(int a[]){

        for(int i=1; i<a.length; i++){
             int curr = a[i];
             int prev = i-1;

             while(prev>=0 && a[prev]>curr){
               a[prev+1] = a[prev];
               prev--;
             }
             a[prev+1] = curr;
           }

    }

}

class DescendingInsertionSort{

    public void descendingInsertionSort(int a[]){

        for(int i=1; i<a.length; i++){
             int curr = a[i];
             int prev = i-1;

             while(prev>=0 && a[prev]<curr){
               a[prev+1] = a[prev];
               prev--;
             }
             a[prev+1] = curr;
           }

    }

}


