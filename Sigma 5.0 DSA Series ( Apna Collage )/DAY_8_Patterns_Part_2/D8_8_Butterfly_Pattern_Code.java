package DAY_8_Patterns_Part_2;

public class D8_8_Butterfly_Pattern_Code {

    public static void Butterfly_Pattern(int n){
        //1st half
        for(int i=1; i<=n; i++){ //outer loop for line
            for(int j=1; j<=i; j++){ //inner loop for star printing
                System.out.print("* ");
            }
            for(int k=1; k<=2*(n-i); k++){ // Here at the place of condition instead of k<=2*(n-i); we can also write/use k<=(2*n)-(i*2);
                System.out.print("  "); //inner loop for space printing
            }
            for(int j=1; j<=i; j++){ //inner loop for star printing
                System.out.print("* ");
            }
            System.out.println(); //for next line
        }
        //2nd half
        for(int i=n; i>=1; i--){ //outer loop for line
            for(int j=1; j<=i; j++){ //inner loop for star printing
                System.out.print("* ");
            }
            for(int k=1; k<=2*(n-i); k++){ // Here at the place of condition instead of k<=2*(n-i); we can also write/use k<=(2*n)-(i*2);
                System.out.print("  "); //inner loop for space printing
            }
            for(int j=1; j<=i; j++){ //inner loop for star printing
                System.out.print("* ");
            }
            System.out.println(); //for next line
        }
    }

    public static void main(String[] args) {
        Butterfly_Pattern(5); //function/method calling
    }

    
}
