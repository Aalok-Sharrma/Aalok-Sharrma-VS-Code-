package DAY_11_2D_Arrays;

public class D11_8_Diagonal_Sum {
    
    // This Diagonal Sum is only when n==m (n = number of rows, m = number of columns)

    public static void main(String[] args) {
        
        int a[][] = {{1,2,3,4,5},
                     {6,7,8,9,10},
                     {11,12,13,14,15},
                     {16,17,18,19,20},
                     {21,22,23,24,25}};

        DiagonalSum ds = new DiagonalSum();// It's a object 'ds' of 'DiagonalSum' class

        int diagonalSum = ds.diagonalSum(a);// calling 'diagonalSum()' method of 'DiagonalSum' class by it's object 'psm' and storing what ever it return in 'diagonalSum' variable.

        System.out.println("Diagonal Sum of 2D Array a[][] : "+diagonalSum); // Printing Diagonal Sum of 2D Array a[][]
    }
}

class DiagonalSum{

    public int diagonalSum(int a[][]){

        int diagonalSum = 0;

        for(int i=0; i<a.length; i++){       // Here I used only one For Loop because as I early mentioned " This Diagonal Sum is only when n==m (n = number of rows, m = number of columns) "
            // PD
            diagonalSum += a[i][i];

            // SD
            if(i!=a.length-i-1){
                diagonalSum += a[i][a.length-i-1];
            }
        }

        return diagonalSum;
    }
}
