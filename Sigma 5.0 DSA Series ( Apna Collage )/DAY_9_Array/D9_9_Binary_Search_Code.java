package DAY_9_Array;

public class D9_9_Binary_Search_Code {
    
    public static int Binary_Search(int a[], int key){  /* We can also write this function in another when which is give 
                                                           at the end of this file/code but this(which function we are currently runing)
                                                           it the best for the Binary Search below code is just an another way or approach (a little tiwsted approch)*/
        int mid = 0;
        int start = 0;
        int end = a.length-1;
            while(start<=end){
                mid = (start+end)/2;

                if(a[mid] == key){
                    return mid;
                }
                if(a[mid] > key){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {-5,-3,-1,1,2,3,5,8,9};
        int key = 0;
        int ans = Binary_Search(a, key);

        if(ans>=0){
            System.out.println("we found our key = "+key+" at index no. = "+ans);
        }
        else{
            System.out.println("we are not able to found our key = "+key+" in the a[] array");
        }

    }
}


/*  public static int Binary_Search(int a[], int key){

        int mid = -1;
        int start = 0;
        int end = a.length-1;
            while(start<=end){
                mid = (start+end)/2;

                if(a[mid] == key){
                    break;
                }
                if(a[mid] > key){
                    end = mid-1;
                }
                if(a[mid] < key){
                    start = mid+1;
                }else{               // it will run when we don't get our key in our whole a[] Array
                    mid = -1;
                }
            }
        
        return mid;
    } */
