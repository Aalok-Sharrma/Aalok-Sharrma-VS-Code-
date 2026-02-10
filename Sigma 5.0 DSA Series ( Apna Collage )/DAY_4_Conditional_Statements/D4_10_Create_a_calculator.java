package DAY_4_Conditional_Statements;

import java.util.Scanner;

public class D4_10_Create_a_calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a=sc.nextInt();
        System.out.print("Enter second number : ");
        int b=sc.nextInt();
        System.out.print("Enter third number : ");
        int c=sc.nextInt();
        
        System.out.println();

        System.out.println("Following are your choice\nPress + For addition of "+a+","+b+","+c+"\nPress - For subtration of "+a+","+b+","+c+"\nPress * For multiplication of "+a+","+b+","+c+"\nPress / For division of "+a+","+b+","+c+"\nPress % For modulus of "+a+","+b+","+c);

        System.out.println();

        System.out.print("Enter your choice : ");
        char ch=sc.next().charAt(0);

        System.out.println();

        switch (ch) {
            case '+':{ int add = a+b+c;
                System.out.println("Addition of "+a+","+b+","+c+" is : "+add);
            }
                break;
            case '-':{ int sub = a-b-c;
                System.out.println("Subtraction of "+a+","+b+","+c+" is : "+sub);
            }
                break;
            case '*':{ int multi = a*b*c;
                System.out.println("Multiplication of "+a+","+b+","+c+" is : "+multi);
            }
                break;
            case '/':{ int div = (a/(b/c));
                System.out.println("Division of "+a+","+b+","+c+" is : "+div);
            }
                break;
            case '%':{ int mod = (a%(b%c));
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
