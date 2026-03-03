package DAY_9_Array;

public class D9_6_Linear_Search {

    public static int Linear_Search(int a[], int key){

        int index = -1;
        for(int i=0; i<a.length; i++){
            if(a[i]==key){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int a[] = {1,2,8,2,87,-3,-2,-5};
        int key = -5;
        int ans = Linear_Search(a, key);

        if(ans>=0){
            System.out.println("Our "+key+" is at index no. = "+ans);
        }
        else{
            System.out.println("Our "+key+" is not present in the a[] array");
        }
    }
}
