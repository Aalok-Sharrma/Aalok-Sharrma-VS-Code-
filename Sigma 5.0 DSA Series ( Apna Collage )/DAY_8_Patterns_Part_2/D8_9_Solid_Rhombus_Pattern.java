package DAY_8_Patterns_Part_2;

public class D8_9_Solid_Rhombus_Pattern {
    
    public static void Solid_Rhombus_Pattern(int n){

        for(int i=1; i<=n; i++){ //outer loop for line
            for(int j=1; j<=n-i; j++){ //inner loop for space printing
                System.out.print("  ");
            }
            for(int k=1; k<=n; k++){ //inner loop for star printing
                System.out.print("* ");
            }
            System.out.println(); //for next line
        }
    }

    public static void main(String[] args) {
        Solid_Rhombus_Pattern(5); //function/method calling
    }
}
