import java.util.Scanner;

public class Trying_3D_Arrays {
    
    public static void main(String[] args) {
        
        int matrix[][][] = new int[3][3][3];

        UserInput  ui  = new UserInput(); 
        UserOutput uo  = new UserOutput();

        ui.userInput(matrix);

        uo.userOutput(matrix);

    }
}

class UserInput{

    public void userInput(int matrix[][][]){

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                for(int k=0; k<matrix[0].length; k++){

                System.out.print("Enter your number at ("+i+","+j+","+k+") cell of the matrix : ");
                matrix[i][j][k] = sc.nextInt();
                
                }
            }
        }
    }
}

class UserOutput{

    public void userOutput(int matrix[][][]){

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                for(int k=0; k<matrix[0].length; k++){
                System.out.print(matrix[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}