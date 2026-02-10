package DAY_4_Conditional_Statements;

import java.util.Scanner;

public class D4_9_Switch_statement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Syntax

        // switch (args) {       // switch (variable)
        //     case value1:      // value1 can be int, float, char etc
                
        //         break;
        //     case value2:      // value2 can be int, float, char etc
                
        //         break;
        //     case value3:      // value3 can be int, float, char etc
                
        //         break;
        
        //     default:
        //         break;
        // }

        // Coding

        System.out.print("Enter first number : ");
        int a=sc.nextInt();
        System.out.print("Enter second number : ");
        int b=sc.nextInt();
        System.out.print("Enter third number : ");
        int c=sc.nextInt();
        
        System.out.println();

        System.out.println("Following are your choice\n1. For addition of "+a+","+b+","+c+"\n2. For subtration of "+a+","+b+","+c+"\n3. For multiplication of "+a+","+b+","+c+"\n4. For division of "+a+","+b+","+c+"\n5. For modulus of "+a+","+b+","+c);

        System.out.println();

        System.out.print("Enter your choice : ");
        int ch=sc.nextInt();

        System.out.println();

        switch (ch) {
            case 1:{ int add = a+b+c;
                System.out.println("Addition of "+a+","+b+","+c+" is : "+add);
            }
                break;
            case 2:{ int sub = a-b-c;
                System.out.println("Subtraction of "+a+","+b+","+c+" is : "+sub);
            }
                break;
            case 3:{ int multi = a*b*c;
                System.out.println("Multiplication of "+a+","+b+","+c+" is : "+multi);
            }
                break;
            case 4:{ int div = (a/(b/c));
                System.out.println("Division of "+a+","+b+","+c+" is : "+div);
            }
                break;
            case 5:{ int mod = (a%(b%c));
                System.out.println("Modulus of "+a+","+b+","+c+" is : "+mod);
            }
                break;
            default:{
                System.out.println("Entered wrong choice");
            }
                break;
        }

    }
}
