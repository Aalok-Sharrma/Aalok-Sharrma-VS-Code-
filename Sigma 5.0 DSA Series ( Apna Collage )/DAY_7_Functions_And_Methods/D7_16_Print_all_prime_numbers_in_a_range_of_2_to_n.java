package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_16_Print_all_prime_numbers_in_a_range_of_2_to_n {

    public static boolean isprime(int n){
        boolean isprime=true;
        if(n==2){
            return isprime;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }return isprime;
    }

    public static void PrimeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number till you need prime numbers : ");
        int n=sc.nextInt();

        PrimeInRange(n);

    }
}
