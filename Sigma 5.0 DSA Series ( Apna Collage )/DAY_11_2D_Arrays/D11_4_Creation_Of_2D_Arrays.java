package DAY_11_2D_Arrays;

import java.util.Scanner;

public class D11_4_Creation_Of_2D_Arrays {
    
    /*
    
      (1) Creation of 2D Arrays

        int matrix[][] = new int[3][3];

      (2) Input/Output elements in 2D Arrays

        for(int i=0; i<n; i++){     // n=number of rows
          for(int j=0; j<m; j++){   // m=number of columns
            User Input/Output
          }
        }

    */ 

    public static void main(String[] args) {
        
        int matrix[][] = new int[3][3];        // 2D Array

        UserInput  ui  = new UserInput();      // It's a object 'ui' of 'UserInput' class 
        UserOutput uo  = new UserOutput();     // It's a object 'uo' of 'UserOutput' class

        ui.userInput(matrix);                  // calling 'userInput()' method of 'UserInput' class by it's object 'ui'

        uo.userOutput(matrix);                 // calling 'userOutput()' method of 'UserOutput' class by it's object 'uo'

    }
}

class UserInput{

    public void userInput(int matrix[][]){    // Method to take input elements of 2D Array from user.

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print("Enter your number at ("+i+","+j+") cell of the matrix : ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}

class UserOutput{

    public void userOutput(int matrix[][]){    // Method to print elements of 2D Array.

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
