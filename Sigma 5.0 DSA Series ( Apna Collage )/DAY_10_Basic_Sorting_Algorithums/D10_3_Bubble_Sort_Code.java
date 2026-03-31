package DAY_10_Basic_Sorting_Algorithums;

import java.util.Arrays;

public class D10_3_Bubble_Sort_Code {

    public static void main(String[] args) {
        
        int a[] = {2,7,1,0,3,7,5};

        System.out.println("Before Asce/Desc Bubble Sort  "+Arrays.toString(a)); // printed array a[] before Ascending (or) Descending bubble sort

        DescendingBubbleSort dbs = new DescendingBubbleSort();  // Created a object 'dbs' of 'DescendingBubbleSort' class 
        AscendingBubbleSort  abs = new AscendingBubbleSort();   // Created a object 'abs' of 'AscendingBubbleSort' class

        dbs.bubbleSortDescending(a);  // Call the 'bubbleSortDescending()' method which is present in 'DescendingBubbleSort' class and call by it's object 'dbs'
        System.out.println("After Descending Bubble Sort  "+Arrays.toString(a)); // printed array a[] after descending bubble sort

        abs.bubbleSortAscending(a);   // Call the 'bubbleSortAscending()' method which is present in 'AscendingBubbleSort' class and call by it's object 'abs'
        System.out.println("After Ascending Bubble Sort   "+Arrays.toString(a)); // printed array a[] after ascending bubble sort

    }
}

class DescendingBubbleSort{

    public void bubbleSortDescending(int a[]){

        int swap = 0; /* We are creating this to check if user has given sort array or not and 
                      if user has given a sorted array then we are not suppose to sort this array */

        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-1-i; j++){
                if(a[j]<a[j+1]){                 // Descending Bubble Sort 
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    swap ++;
                }
            }
            if(swap == 0){
                System.out.println("Array is already sorted Descending Order");
                break;
            }
        }
    }

}

class AscendingBubbleSort{

    public void bubbleSortAscending(int a[]){

        int swap = 0; /* We are creating this to check if user has given sort array or not and 
                      if user has given a sorted array then we are not suppose to sort this array */

        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-1-i; j++){
                if(a[j]>a[j+1]){                 // Ascending Bubble Sort
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    swap ++;
                }
            }
            if(swap == 0){
                System.out.println("Array is already sorted in Ascending Order");
                break;
            }
        }
    }

}
