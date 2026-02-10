package DAY_7_Functions_And_Methods;

import java.util.Scanner;

public class D7_9_Find_binomial_coefficient {

    public static long factorial(long n){
        int f=1;
        for(int i=1; i<=n; i++){
            f*=i;     // f=f*i
        }
        return f;  // It will going to return factorial 

    }

    public static int Bin_Coeff(int n, int r){

        long a=factorial(n);
        long b=factorial(r);
        long c=factorial(n-r);

        int Bin_Coeff=(int)(a/(b*c));
        
        return Bin_Coeff;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n of binomial coefficient : ");
        int n=sc.nextInt();
        System.out.print("Enter r of binomial coefficient : ");
        int r=sc.nextInt();

        int BC=Bin_Coeff(n,r);

        System.out.println("Binomial Coefficiant is = "+BC);

    }
}
