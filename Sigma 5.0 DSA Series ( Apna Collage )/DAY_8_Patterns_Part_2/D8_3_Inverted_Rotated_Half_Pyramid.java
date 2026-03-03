package DAY_8_Patterns_Part_2;

public class D8_3_Inverted_Rotated_Half_Pyramid {

    public static void Inverted_Rotated_Half_Pyramid(int n){
        for(int i=0; i<n; i++){ // outer loop for line
            for(int j=0; j<=n-i; j++){ // inner loop for space printing
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){ // inner loop for star priniting
                System.out.print("*");
            }
            System.out.println(); //for next line
        }
    }
    public static void main(String[] args) {

        Inverted_Rotated_Half_Pyramid(4); //function/method calling
    }
}
