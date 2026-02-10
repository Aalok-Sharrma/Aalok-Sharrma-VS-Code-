import java.util.*;

public class round_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        //int ch=sc.nextInt();

        System.out.println("------------------------------------- ROUND-1 BEGINS -------------------------------------\n");
        System.out.println("------------------------------------- ROUND-1 LEVEL-1 -------------------------------------\n");
        System.out.println();
        System.out.println("Enter the number of option which show more efficint code to print a square pattern with stars(*)\n( Hint : check the syntex of code )\n");
        
        // option (1). is correct
        
        System.out.println("(1).  import java.util.*;\n" + //
                        "\n" + //
                        "public class print_square_patten {\n" + //
                        "\n" + //
                        "    public static void main(String[] args) {\n" + //
                        "\n" + //
                        "        Scanner sc = new Scanner(System.in);\n" + //
                        "\n" + //
                        "        System.out.print(\"Enter the number of lines you needed in your square patten : \");\n" + //
                        "        int n=sc.nextInt();\n" + //
                        "        \n" + //
                        "        System.out.print(\"Enter the number of stars you needed in each lines of your square patten : \");\n" + //
                        "        int x=sc.nextInt();\n" + //
                        "\n" + //
                        "        for(loop for lines){\n" + //
                        "            for(loop for stars){\n" + //
                        "                System.out.print(\"*\");\n" + //
                        "            }\n" + //
                        "        }\n" + //
                        "\n" + //
                        "        \n" + //
                        "    }\n" + //
                        "    \n" + //
                        "}\n" + //
                        "");

    System.out.println("(2).  import java.util.*;\n" + //
                "\n" + //
                "public class print_square_patten {\n" + //
                "\n" + //
                "    public static void main(String[] args) {\n" + //
                "\n" + //
                "        Scanner sc = new Scanner(System.in):\n" + //
                "\n" + //
                "        System.out.print(\"Enter the number of lines you needed in your square patten : \");\n" + //
                "        int n=sc.nextInt()\n" + // here we removed the termination (;)
                "        \n" + //
                "        System.out.print(\"Enter the number of stars you needed in each lines of your square patten : \");\n" + //
                "        int x=sc.nextInt()\n" + // here we removed the termination (;)
                "\n" + //
                "        for(loop for lines){\n" + //
                "            for(loop for stars){\n" + //
                "                System.out.print(\"*\");\n" + //
                "            }\n" + //
                "        }\n" + //
                "\n" + //
                "        \n" + //
                "    \n" + // here we removed  ' } '
                "    \n" + //
                "}\n" + //
                "");

    System.out.println("(3).  import java.util.*;\n" + //
                        "\n" + //
                        "public class print_square_patten {\n" + //
                        "\n" + //
                        "    public static void main(String() args) {\n" + //  here insted of () we need to write []
                        "\n" + //
                        "        Scanner sc = new Scanner(System.in);\n" + //
                        "\n" + //
                        "        System.out.print(\"Enter the number of lines you needed in your square patten : \");\n" + //
                        "        int n=sc.nextInt()\n" + // here we removed the termination (;)
                        "        \n" + //
                        "        System.out.print(\"Enter the number of stars you needed in each lines of your square patten : \");\n" + //
                        "        int x=sc.nextInt()\n" + // here we removed the termination (;)
                        "\n" + //
                        "        for(loop for lines){\n" + //
                        "            for(loop for stars){\n" + //
                        "                System.out.print(\"*\");\n" + //
                        "            }\n" + //
                        "        }\n" + //
                        "\n" + //
                        "        \n" + //
                        "    }\n" + //
                        "    \n" + //
                        "}\n" + //
                        "");

    System.out.println("(4).  import java.util;\n" + //.* is removed
                        "\n" + //
                        "public class print_square_patten {\n" + //
                        "\n" + //
                        "    public static void main(String[] args) {\n" + //
                        "\n" + //
                        "        Scanner sc = new Scanner(System.in);\n" + //
                        "\n" + //
                        "        System.out.print(\"Enter the number of lines you needed in your square patten : \");\n" + //
                        "        int n=sc.nextInt();\n" + //
                        "        \n" + //
                        "        System.out.print(\"Enter the number of stars you needed in each lines of your square patten : \");\n" + //
                        "        int x=sc.nextInt();\n" + //
                        "\n" + //
                        "        for(loop for lines){\n" + //
                        "            for(loop for lines){\n" + //
                        "                System.out.print(\"*\");\n" + //
                        "            }\n" + //
                        "        }\n" + //
                        "\n" + //
                        "        \n" + //
                        "    }\n" + //
                        "    \n" + //
                        "\n" + // here we removed  ' } '
                        "");


    int n=sc.nextInt();

    switch (n) {
        case 1:
            
            break;

        case 2:
            
            break;

        case 3:
            
            break;

        case 4:
            
            break;
    
        default:
            break;
    }


        


    }
    
}
