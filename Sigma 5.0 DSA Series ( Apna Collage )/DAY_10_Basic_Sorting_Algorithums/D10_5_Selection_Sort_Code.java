package DAY_10_Basic_Sorting_Algorithums;

import java.util.Arrays;

public class D10_5_Selection_Sort_Code {
    
    public static void main(String[] args) {
        
        int a[] = {2,7,1,0,3,7,5};

        System.out.println("Before Asce/Desc Selection Sort  "+Arrays.toString(a)); // printed array a[] before Ascending (or) Descending selection sort

        AscendingSelectionSort  ass = new AscendingSelectionSort();  // Created a object 'ass' of 'AscendingSelectionSort' class 
        DescendingSelectionSort dss = new DescendingSelectionSort(); // Created a object 'dss' of 'DescendingSelectionSort' class 

        ass.ascendingSelectionSort(a); // Call the 'ascendingSelectionSort()' method which is present in 'AscendingSelectionSort' class and call by it's object 'ass'
        System.out.println("After Ascending Selection Sort   "+Arrays.toString(a)); // printed array a[] after ascending selection sort

        dss.descendingSelectionSort(a); // Call the 'descendingSelectionSort()' method which is present in 'AscendingSelectionSort' class and call by it's object 'dss'
        System.out.println("After Descending Selection Sort  "+Arrays.toString(a)); // printed array a[] after descending selection sort




    }
}

class AscendingSelectionSort{

    public void ascendingSelectionSort(int a[]){

        for(int i=0; i<a.length-1; i++){
          int minPosition = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j] < a[minPosition]){
                    minPosition=j;
                }
            }
            // swap
            int temp = a[minPosition];
            a[minPosition] = a[i];
            a[i] = temp;
        }

    }

}

class DescendingSelectionSort{

    public void descendingSelectionSort(int a[]){

        for(int i=0; i<a.length-1; i++){
          int maxPosition = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j] > a[maxPosition]){
                    maxPosition=j;
                }
            }
            // swap
            int temp = a[maxPosition];
            a[maxPosition] = a[i];
            a[i] = temp;
        }

    }

}

