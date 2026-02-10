package DAY_6_Patterns_Part_1;

import java.util.Scanner;

public class D6_1_Print_star_pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of line you needed : ");
        int n=sc.nextInt();
        
        for(int line=1; line<=n; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }System.out.println();                  // For next line
        }
        
    }
}
