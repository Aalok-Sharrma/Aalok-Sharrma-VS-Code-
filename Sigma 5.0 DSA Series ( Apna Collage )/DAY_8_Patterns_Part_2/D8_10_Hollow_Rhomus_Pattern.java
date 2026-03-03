package DAY_8_Patterns_Part_2;

public class D8_10_Hollow_Rhomus_Pattern {
    
    public static void Hollow_Rhomus_Pattern(int n){
        for(int i=1; i<=n; i++){ //outer loop for line
            for(int j=1; j<=n-i; j++){ //inner loop for space printing
                System.out.print("  ");
            }
            for(int k=1; k<=n; k++){ //inner loop for star printing

                // cell - (i,j)

                if(i==1 || i==n || k==1 || k==n){ //condition where to print star
                    System.out.print("* ");
                } else{ //if condition will not true print space
                    System.out.print("  ");
                }
            }
            System.out.println(); //for next line
        }
    }

    public static void main(String[] args) {
        Hollow_Rhomus_Pattern(5); //function/method calling
    }
}
