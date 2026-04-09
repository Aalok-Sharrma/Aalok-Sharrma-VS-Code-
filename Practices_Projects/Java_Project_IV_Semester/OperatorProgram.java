package Practices_Projects.Java_Project_IV_Semester;

import java.util.Scanner;

public class OperatorProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Operator Category:");
        System.out.println("1. Arithmetic");
        System.out.println("2. Unary");
        System.out.println("3. Relational");
        System.out.println("4. Logical");
        System.out.println("5. Assignment");
        System.out.println("6. Bitwise");
        System.out.println("7. Shift");
        System.out.println("8. Ternary");
        System.out.println("9. Instanceof");

        System.out.println();
        System.out.print("Enter Your Choice : ");

        int choice = sc.nextInt();

        switch(choice) {

            // 🔹 Arithmetic
            case 1:
                System.out.println("Select Operator (+, -, *, /, %): ");
                System.out.println();
                System.out.print("Enter Your Choice : ");
                char op = sc.next().charAt(0);

                System.out.print("Enter first numbers: ");
                int a = sc.nextInt();
                System.out.print("Enter second numbers: ");
                int b = sc.nextInt();

                switch(op) {
                    case '+': System.out.println("Result: " + (a + b)); break;
                    case '-': System.out.println("Result: " + (a - b)); break;
                    case '*': System.out.println("Result: " + (a * b)); break;
                    case '/': System.out.println("Result: " + (a / b)); break;
                    case '%': System.out.println("Result: " + (a % b)); break;
                }
                break;

            // 🔹 Unary
            case 2:
                System.out.println("Select Operator (++, --, !): ");
                System.out.println();
                System.out.print("Enter Your Choice : ");
                String uop = sc.next();

                System.out.print("Enter number: ");
                int x = sc.nextInt();

                if (uop.equals("++")) System.out.println("Result: " + (++x));
                else if (uop.equals("--")) System.out.println("Result: " + (--x));
                else if (uop.equals("!")) System.out.println("Result: " + (!(x != 0)));
                break;

            // 🔹 Relational
            case 3:
                System.out.println("Select Operator (>, <, >=, <=, ==, !=): ");
                System.out.println();
                System.out.print("Enter Your Choice : ");
                String rop = sc.next();

                System.out.print("Enter two numbers: ");
                int r1 = sc.nextInt();
                int r2 = sc.nextInt();

                switch(rop) {
                    case ">": System.out.println(r1 > r2); break;
                    case "<": System.out.println(r1 < r2); break;
                    case ">=": System.out.println(r1 >= r2); break;
                    case "<=": System.out.println(r1 <= r2); break;
                    case "==": System.out.println(r1 == r2); break;
                    case "!=": System.out.println(r1 != r2); break;
                }
                break;

            // 🔹 Logical
            case 4:
                System.out.println("Select Operator (&&, ||): ");
                System.out.println();
                System.out.print("Enter Your Choice : ");
                String lop = sc.next();

                System.out.print("Enter first condition (true/false): ");
                boolean c1 = sc.nextBoolean();

                System.out.print("Enter second condition (true/false): ");
                boolean c2 = sc.nextBoolean();

                if (lop.equals("&&"))
                    System.out.println("Result: " + (c1 && c2));
                else if (lop.equals("||"))
                    System.out.println("Result: " + (c1 || c2));
                break;

            // 🔹 Assignment
            case 5:
                System.out.println("Select Operator (=, +=, -=, *=, /=): ");
                System.out.println();
                System.out.print("Enter Your Choice : ");

                String aop = sc.next();

                System.out.print("Enter first numbers: ");
                int as1 = sc.nextInt();
                System.out.print("Enter second numbers: ");
                int as2 = sc.nextInt();
                

                switch(aop) {
                    case "=": System.out.println("Result: " + as2); break;
                    case "+=": System.out.println("Result: " + (as1 += as2)); break;
                    case "-=": System.out.println("Result: " + (as1 -= as2)); break;
                    case "*=": System.out.println("Result: " + (as1 *= as2)); break;
                    case "/=": System.out.println("Result: " + (as1 /= as2)); break;
                }
                break;

            // 🔹 Bitwise
            case 6:
                System.out.println("Select Operator (&, |, ^, ~): ");
                System.out.println();
                System.out.print("Enter Your Choice : ");
                String bop = sc.next();

                System.out.print("Enter number: ");
                int b1 = sc.nextInt();

                if (bop.equals("~")) {
                    System.out.println("Result: " + (~b1));
                } else {
                    System.out.print("Enter second number: ");
                    int b2 = sc.nextInt();

                    switch(bop) {
                        case "&": System.out.println("Result: " + (b1 & b2)); break;
                        case "|": System.out.println("Result: " + (b1 | b2)); break;
                        case "^": System.out.println("Result: " + (b1 ^ b2)); break;
                    }
                }
                break;

            // 🔹 Shift
            case 7:
                System.out.println("Select Operator (<<, >>): ");
                System.out.println();
                System.out.print("Enter Your Choice : ");
                String sop = sc.next();

                System.out.print("Enter number: ");
                int s1 = sc.nextInt();

                System.out.print("Enter shift value: ");
                int s2 = sc.nextInt();

                if (sop.equals("<<"))
                    System.out.println("Result: " + (s1 << s2));
                else if (sop.equals(">>"))
                    System.out.println("Result: " + (s1 >> s2));
                break;

            // 🔹 Ternary
            case 8:
                System.out.print("Enter condition (true/false): ");
                System.out.println();
                System.out.print("Enter Your Choice : ");
                boolean cond = sc.nextBoolean();

                System.out.print("Enter value if true: ");
                int t1 = sc.nextInt();

                System.out.print("Enter value if false: ");
                int t2 = sc.nextInt();

                int result = cond ? t1 : t2;
                System.out.println("Result: " + result);
                break;

            // 🔹 Instanceof
            case 9:
                String str = "Hello";
                System.out.println("Checking: str instanceof String");
                System.out.println("Result: " + (str instanceof String));
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}