package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_8_Find_factorial_of_a_number_n {

    public static long factorial(long n){
        int f=1;
        for(int i=1; i<=n; i++){
            f*=i;     // f=f*i
        }
        return f;  // It will going to return factorial 

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number who's factorial you needed : ");
        long a=sc.nextLong();

        long factorial=factorial(a);

        System.out.println("Factorial of "+a+" is :"+factorial);

    }
}
