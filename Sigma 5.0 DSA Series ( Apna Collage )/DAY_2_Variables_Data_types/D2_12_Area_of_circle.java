package DAY_2_Variables_Data_types;

import java.util.Scanner;

public class D2_12_Area_of_circle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");
        float rad = sc.nextFloat();
        float area = 3.14f*rad*rad;

        System.out.println("Area of a circle with radius "+rad+" is : "+area);

    }
}
