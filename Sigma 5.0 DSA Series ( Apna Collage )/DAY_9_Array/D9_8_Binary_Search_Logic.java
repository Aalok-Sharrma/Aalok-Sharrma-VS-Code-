package DAY_9_Array;

public class D9_8_Binary_Search_Logic {

    /*
    
    PREREQUIREMENTS :- Array must to a Sorted Array

    EXAMPLE :- 

       int a[] = {1,2,3,4,5,6};

       PSEUDOCODE :-
        start = 0;
        end = a.length-1;
        while(start<=end){
             calcutale mid = (start + end)/2;
        }
        -------Compare mid and key-------

        if mid == key --> print it's index number
        if mid > key  --> search in first half and for that update end by end = mid-1;
        if mid < key  --> search in second half and for that update start by start = mid+1;
        

    */
}

/*    public static int Binary_Search(int a[], int key){
        
        return 0;
    }

    public static void main(String[] args) {
        int a[] = {1,2,8,2,87,-3,-2,-5};
        int key = -5;
        int ans = Binary_Search(a, key);

        if(ans>=0){
            System.out.println("Our "+key+" is at index no. = "+ans);
        }
        else{
            System.out.println("Our "+key+" is not present in the a[] array");
        }
    } */
