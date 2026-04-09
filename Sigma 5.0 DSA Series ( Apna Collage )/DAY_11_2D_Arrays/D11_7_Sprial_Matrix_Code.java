package DAY_11_2D_Arrays;

public class D11_7_Sprial_Matrix_Code {
    
    public static void main(String[] args) {
        
        int a[][] = {{1,2,3,4,5},
                     {6,7,8,9,10},
                     {11,12,13,14,15},
                     {16,17,18,19,20}};

        PrintSprialMatrix psm = new PrintSprialMatrix(); // It's a object 'psm' of 'PrintSprialMatrix' class

        psm.printSprialMatrix(a);  // calling 'printSprialMatrix()' method of 'PrintSprialMatrix' class by it's object 'psm'

    }
}

class PrintSprialMatrix{

    public void printSprialMatrix(int a[][]){       // Method to print a spiral matrix

        int StartRow=0;
        int StartColumn=0;
        int EndRow=a.length-1;
        int EndColumn=a[0].length-1;

        while (StartRow<=EndRow && StartColumn<=EndColumn) {
            
            for(int i=StartColumn; i<=EndColumn; i++){    // Top
                System.out.print(a[StartRow][i]+" ");
            }
            for(int j=StartRow+1; j<=EndRow; j++){        // Right
                System.out.print(a[j][EndColumn]+" ");
            }
            for(int k=EndColumn-1; k>=StartColumn; k--){  // Bottom
                if(StartRow==EndRow){
                    break;
                }
                System.out.print(a[EndRow][k]+" ");
            }
            for(int l=EndRow-1; l>=StartRow+1; l--){      // Left
                if(StartColumn==EndColumn){
                    break;
                }
                System.out.print(a[l][StartColumn]+" ");
            }
            StartColumn++;
            StartRow++;
            EndColumn--;
            EndRow--;
        }
        System.out.println();
    }
}
