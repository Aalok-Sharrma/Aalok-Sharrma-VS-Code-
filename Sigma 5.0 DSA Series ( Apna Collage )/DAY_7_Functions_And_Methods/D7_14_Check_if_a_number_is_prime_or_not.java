package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_14_Check_if_a_number_is_prime_or_not {

    public static void isprime(int n){

        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            return;
        }if(n == 2) {
            System.out.println(n+" is a prime number");
            return;
        }else{
            boolean isprime=true;
            for(int i = 2; i <= n-1; i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }if(isprime == true){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }
        }
         
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n=sc.nextInt();

        isprime(n);

    }

}

/* 


package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_14_Check_if_a_number_is_prime_or_not {

    public static void isprime(int n) {
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            return;
        }

        if (n == 2) {
            System.out.println(n + " is a prime number");
            return;
        }

        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
                break; // optimization: exit loop when divisor found
            }
        }

        if (isprime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        isprime(n);
    }
}


 */
