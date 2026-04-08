package DAY_10_Basic_Sorting_Algorithums;

import java.util.Arrays;

public class D10_10_Counting_Sort_Code {
    
    public static void main(String[] args) {
        
        int a[] = {2,7,1,0,3,7,5};

        System.out.println("Before Asce/Desc Counting Sort  "+Arrays.toString(a)); // printed array a[] before Ascending (or) Descending counting sort

        AscendingCountingSort  acs = new AscendingCountingSort();  // Created a object 'acs' of 'AscendingCountingSort' class 
        DescendingCountingSort dcs = new DescendingCountingSort(); // Created a object 'dcs' of 'DescendingCountingSort' class 

        acs.ascendingCountingSort(a); // Call the 'ascendingCountingSort()' method which is present in 'AscendingCountingSort' class and call by it's object 'acs'
        System.out.println("After Ascending Counting Sort   "+Arrays.toString(a)); // printed array a[] after ascending counting sort

        dcs.descendingCountingSort(a); // Call the 'descendingCountingSort()' method which is present in 'AscendingCountingSort' class and call by it's object 'dcs'
        System.out.println("After Descending Counting Sort  "+Arrays.toString(a)); // printed array a[] after descending counting sort


    }
}

class AscendingCountingSort{

    public void ascendingCountingSort(int a[]){

        int largest=Integer.MIN_VALUE;

        // Here we are finding largest element(number) to created helping array count[] because that largest element+1(number) will be the size of helping array count[] and we added one in largest element(number) because there can be a zero also in give array a[] as it(zero) is also a positive(+ve) number.
        for(int i=1; i<a.length; i++){
            largest=Math.max(largest, a[i]);
        }

        // Creating helping array count[].
        int count[] = new int[largest+1]; // Here we added one in largest element(number) because there can be a zero also in give array a[] as it(zero) is also a positive(+ve) number.

        // Here we are filling helping array count[] by the frequencey(how may times that element come in given array a[]) of the elements of the given array a[].
        for(int j=0; j<a.length; j++){
            count[a[j]]++; // To understand this line suppose "a[j] = 7" then the index number 7 in helping array count[] count will increase by one means if 7 is came first time in given array a[] then index number 7 in helping array count[] will increse by one means get one from zero because it came first time that's why one because at initially at index number 7 there is garbage value(" [I@6b95977 " or " zero (0) " )
        }

        // Here we start Ascending Order Sorting
        int g=0;
        for(int k=0; k<count.length; k++){
            while (count[k]>0) {
                a[g] = k;
                g++;
                count[k]--;
            }
        }

    }

}

class DescendingCountingSort{

    public void descendingCountingSort(int a[]){

        int largest=Integer.MIN_VALUE;

        // Here we are finding largest element(number) to created helping array count[] because that largest element+1(number) will be the size of helping array count[] and we added one in largest element(number) because there can be a zero also in give array a[] as it(zero) is also a positive(+ve) number.
        for(int i=1; i<a.length; i++){
            largest=Math.max(largest, a[i]);
        }

        // Creating helping array count[].
        int count[] = new int[largest+1]; // Here we added one in largest element(number) because there can be a zero also in give array a[] as it(zero) is also a positive(+ve) number.

        // Here we are filling helping array count[] by the frequencey(how may times that element come in given array a[]) of the elements of the given array a[].
        for(int j=0; j<a.length; j++){
            count[a[j]]++; // To understand this line suppose "a[j] = 7" then the index number 7 in helping array count[] count will increase by one means if 7 is came first time in given array a[] then index number 7 in helping array count[] will increse by one means get one from zero because it came first time that's why one because at initially at index number 7 there is garbage value(" [I@6b95977 " or " zero (0) " )
        }

        // Here we start Descending Order Sorting
        int g=0;
        for(int k=count.length-1; k>=0; k--){
            while (count[k]>0) {
                a[g] = k;
                g++;
                count[k]--;
            }
        }
    }

}

