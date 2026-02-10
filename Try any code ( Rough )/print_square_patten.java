import java.util.*;

public class print_square_patten {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines you needed in your square patten : ");
        int n=sc.nextInt();
        
        System.out.print("Enter the number of stars you needed in each lines of your square patten : ");
        int x=sc.nextInt();

        for(int line=1; line<=n; line++){
            for(int star=1; star<=x; star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
