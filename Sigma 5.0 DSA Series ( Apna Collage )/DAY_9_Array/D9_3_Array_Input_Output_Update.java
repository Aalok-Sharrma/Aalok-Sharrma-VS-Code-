package DAY_9_Array;

import java.util.Scanner;

public class D9_3_Array_Input_Output_Update {
    
    public static void main(String[] args) {
        
        int marks[] = new int[5];

        Scanner sc = new Scanner(System.in);

        // Array Input

        System.out.print("Enter your physics marks : ");
        marks[0]=sc.nextInt();                                    // Input 5
        System.out.print("Enter your mathmatics marks : ");
        marks[1]=sc.nextInt();                                    // Input 6
        System.out.print("Enter your chemistry marks : ");
        marks[2]=sc.nextInt();                                    // Input 15

        System.out.println(); // NextLine

        // Array Output

        System.out.println("Your physics marks are : "+marks[0]);
        System.out.println("Your mathmetics marks are : "+marks[1]);
        System.out.println("Your chemistry marks are : "+marks[2]);

        System.out.println(); // NextLine

        // Array Updation

          // Way - 1

          System.out.println("Your physics updated marks are : "+(marks[0]+1)); // if you write it like this +Marks[0]+1 it will give output 51 and if you write it like this +(Marks[0]+1) it will give output 6

          // Way - 2
          
          marks[1]+=1;
          System.out.println("Your mathmetics updated marks are : "+marks[1]);

          System.out.println(); //NextLine


    }
}
