package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_16_Print_all_prime_numbers_in_a_range_of_2_to_n {

    public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            return isPrime;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }return isPrime;
    }

    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number till you need prime numbers : ");
        int n=sc.nextInt();

        primeInRange(n);

    }
}
