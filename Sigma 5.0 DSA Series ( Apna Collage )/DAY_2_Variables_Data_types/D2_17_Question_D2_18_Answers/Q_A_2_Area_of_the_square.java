package DAY_2_Variables_Data_types.D2_17_Question_D2_18_Answers;

import java.util.Scanner;

public class Q_A_2_Area_of_the_square {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the side of square : ");
        int side = sc.nextInt();

        float area = side*side;

        System.out.println("The area of square with side("+side+") is : "+area);
        
    }
    
}
