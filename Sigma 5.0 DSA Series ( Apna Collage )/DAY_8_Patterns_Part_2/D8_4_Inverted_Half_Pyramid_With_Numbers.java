package DAY_8_Patterns_Part_2;

public class D8_4_Inverted_Half_Pyramid_With_Numbers {

    public static void Inverted_Half_Pyramid_With_Numbers(int n){

        for(int i=n; i>=1; i--){ //outer loop for line
            for(int j=1; j<=i; j++){ //inner loop for printing pattern
                System.out.print(j+" ");
            }
            System.out.println(); //for next line
        }
    }
    public static void main(String[] args) {

        Inverted_Half_Pyramid_With_Numbers(5); //function/method calling
        
    }
}
