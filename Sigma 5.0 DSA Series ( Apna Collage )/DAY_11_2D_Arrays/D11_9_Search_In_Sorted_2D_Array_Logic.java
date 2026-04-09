package DAY_11_2D_Arrays;

public class D11_9_Search_In_Sorted_2D_Array_Logic {
    /*
    
    ------------------------------Approach 1(Brute Force)[O(n^2)]------------------------------

    for(int i=0; i<a.length; i++){
      for(int j=0; j<a.length; j++){
        if(a[i][j]==key){               // key(Element to search)
          sout("Key is at i="+i+" and j="+j);
        } else{
             sout("Key is not there");
          }
      }
    }

    ------------------------------Approach 2(Row Wise)[O(nlogn)]------------------------------

    -----------------------------Approach 3(Column Wise)[O(nlogn)]-----------------------------

    ------------------------------Approach 4(Staircase Search)------------------------------

    Approach 4 IDEA :- It's IDEA is that (n,0) and (0,m) is best index to start search
                       n = a.length-1;
                       m = a[0].length-1;

        (1) Starting Cell (n,0)
            if(key < cell value){
              MOVE TOP
            }
            if(key > cell value){
              MOVE RIGHT
            }
            else{
              we get the key
            }

        (2) Starting Cell (0,m)
            if(key < cell value){
              MOVE LEFT
            }
            if(key > cell value){
              MOVE BOTTOM
            }
            else{
              we get the key
            }


    
    */
}
