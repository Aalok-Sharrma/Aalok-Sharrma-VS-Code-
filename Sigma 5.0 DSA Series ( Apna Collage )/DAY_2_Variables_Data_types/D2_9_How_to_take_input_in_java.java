package DAY_2_Variables_Data_types;

import java.util.Scanner;

public class D2_9_How_to_take_input_in_java {
    public static void main(String[] args) {
        
        // import java.util.*;

        // public class class_name{
        //     public static void main(strings args[]){
        //         Scanner sc = new Scanner(System.in);
        //         System.out.println("Enter your first name : ");
        //         String Input = sc.next();
        //     }
        // }

        // Input function in java

        // 1. next
        // 2. nextLine
        // 3. nextInt
        // 4. nextByte
        // 5. nextFloat
        // 6. nextDouble
        // 7. nextBoolean
        // 8. nextShort
        // 9. nextLong

        // Example

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name : ");
        String input = sc.next();
        System.out.print("Enter your full name : ");
        String input1 = sc.nextLine();                        // Why this is not working ?
        System.out.print("Enter your age : ");
        int input2 = sc.nextInt();
        System.out.print("Enter your age : ");
        byte input3 = sc.nextByte();
        System.out.print("Enter your age : ");
        float input4 = sc.nextFloat();
        System.out.print("Enter your age : ");
        double input5 = sc.nextDouble();
        System.out.print("Enter your age : ");
        short input8 = sc.nextShort();
        System.out.print("Enter your age : ");
        long input9 = sc.nextLong();
        System.out.print("Are your smart : ");
        boolean input6 = sc.nextBoolean();
        System.out.print("Are your not smart : ");
        boolean input7 = sc.nextBoolean();
        
        System.out.println();

        System.out.println("Your first name : "+input);
        System.out.println("Your full name : "+input1);
        System.out.println("Your int age is : "+input2);
        System.out.println("Your byte age is : "+input3);
        System.out.println("Your float age is : "+input4);
        System.out.println("Your double age is : "+input5);
        System.out.println("Your short age is : "+input8);
        System.out.println("Your long age is : "+input9);
        System.out.println("Your are smart is : "+input6);
        System.out.println("Your not smart is : "+input7);



    }
}
