package DAY_11_2D_Arrays;

public class D11_10_Search_In_Sorted_2D_Array_Staircase_Search_Code {
    
    public static void main(String[] args) {
        
        int a[][] = {{1,2,3,4,5},
                     {6,7,8,9,10},
                     {11,12,13,14,15},
                     {16,17,18,19,20}};

        StaircaseSearch ss = new StaircaseSearch();  // It's a object 'ss' of 'StaircaseSearch' class

        ss.staircaseSearch(a, 5);  // calling 'staircaseSearch()' method of 'StaircaseSearch' class by it's object 'ss'

    }
}

class StaircaseSearch{

    public boolean staircaseSearch(int a[][], int key){ // Here we used Starting Cell = (0,m).

        int row = 0;
        int column = a[0].length-1;

        while(row < a.length && column >= 0){
            if(a[row][column] == key){
                System.out.println("Key = "+key+" found at ("+row+","+column+") index");
                return true;
            }else if(key < a[row][column]){
                column--;
            }else{
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
}
