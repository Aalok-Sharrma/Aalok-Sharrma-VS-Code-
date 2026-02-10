package DAY_6_Patterns_Part_1;

import java.util.Scanner;

public class D6_4_Print_character_pattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of line you needed : ");
        int n=sc.nextInt();
        char ch='A';
        
        for(int line=1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }System.out.println();
        }
        
    }
}
