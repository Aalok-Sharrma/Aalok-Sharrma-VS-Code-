package DAY_5_Loops_Flow_Control;

import java.util.Scanner;

public class D5_15_Check_if_a_number_is_prime_or_not {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n=sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            return;
        }

        if(n == 2){
            System.out.println(n+" is a prime number");
            return;
        }else{
            boolean isprime=true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }if(isprime==true){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }
        }

    }
}
