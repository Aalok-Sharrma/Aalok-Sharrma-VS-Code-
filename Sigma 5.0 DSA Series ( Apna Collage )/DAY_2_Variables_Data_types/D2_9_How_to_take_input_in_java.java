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
        String Input = sc.next();
        System.out.print("Enter your full name : ");
        String Input1 = sc.nextLine();                        // Why this is not working ?
        System.out.print("Enter your age : ");
        int Input2 = sc.nextInt();
        System.out.print("Enter your age : ");
        byte Input3 = sc.nextByte();
        System.out.print("Enter your age : ");
        float Input4 = sc.nextFloat();
        System.out.print("Enter your age : ");
        double Input5 = sc.nextDouble();
        System.out.print("Enter your age : ");
        short Input8 = sc.nextShort();
        System.out.print("Enter your age : ");
        long Input9 = sc.nextLong();
        System.out.print("Are your smart : ");
        boolean Input6 = sc.nextBoolean();
        System.out.print("Are your not smart : ");
        boolean Input7 = sc.nextBoolean();
        
        System.out.println();

        System.out.println("Your first name : "+Input);
        System.out.println("Your full name : "+Input1);
        System.out.println("Your int age is : "+Input2);
        System.out.println("Your byte age is : "+Input3);
        System.out.println("Your float age is : "+Input4);
        System.out.println("Your double age is : "+Input5);
        System.out.println("Your short age is : "+Input8);
        System.out.println("Your long age is : "+Input9);
        System.out.println("Your are smart is : "+Input6);
        System.out.println("Your not smart is : "+Input7);



    }
}
