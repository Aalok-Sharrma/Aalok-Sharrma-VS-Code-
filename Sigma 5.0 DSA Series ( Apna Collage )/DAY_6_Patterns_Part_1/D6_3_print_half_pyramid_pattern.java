package DAY_6_Patterns_Part_1;

import java.util.Scanner;

public class D6_3_print_half_pyramid_pattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of line you needed : ");
        int n=sc.nextInt();
        
        for(int line=1; line<=n; line++){
            for(int no=1; no<=line; no++){
                System.out.print(no);
            }System.out.println();
        }
    }
}
