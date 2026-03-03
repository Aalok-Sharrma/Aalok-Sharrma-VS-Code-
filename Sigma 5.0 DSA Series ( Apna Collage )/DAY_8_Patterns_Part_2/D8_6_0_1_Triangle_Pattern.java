package DAY_8_Patterns_Part_2;

public class D8_6_0_1_Triangle_Pattern {

    public static void M_0_1_Triangle_Pattern(int n){

        for(int i=1; i<=n; i++){ //outer loop for line
            for(int j=1; j<=i; j++){ //inner loop for pattern printing
                int a=i+j;
                if(a%2==0){ //condition where to print star
                    System.out.print("1 ");
                } else{ //if condition will not true print space
                    System.out.print("0 ");
                }
            }
            System.out.println(); //for next line
        }
    }

    public static void main(String[] args) {
        M_0_1_Triangle_Pattern(5); //function/method calling
    }
}
