import java.util.Scanner;

public class factorial_of_n {

    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;  // factorial in n
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of n who's factorial you want: ");
        int n=sc.nextInt();
        System.out.println("factorial of "+n+" = "+factorial(n));
    }
}
