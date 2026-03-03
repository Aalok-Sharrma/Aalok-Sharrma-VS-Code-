package DAY_8_Patterns_Part_2;

public class D8_5_FLOYD_S_Triangle {

    public static void FLOYD_S_Triangle(int n){
        int a=1;
        for(int i=1; i<=n; i++){ //outer loop for line
            for(int j=1; j<=i; j++){ //inner loop for printing pattern
                System.out.print(a+" ");
                a++;
            }
            System.out.println(); //for next line
        }
    }
    public static void main(String[] args) {
        
        FLOYD_S_Triangle(5); //function/method calling
        
    }
}
