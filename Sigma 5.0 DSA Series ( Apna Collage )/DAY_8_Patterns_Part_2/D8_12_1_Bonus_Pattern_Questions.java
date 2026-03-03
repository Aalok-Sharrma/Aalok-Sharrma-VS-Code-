package DAY_8_Patterns_Part_2;

public class D8_12_1_Bonus_Pattern_Questions { // Number Pyramid Pattern

    public static void Number_Pyramid_Pattern(int n){

        for(int i=1; i<=n; i++){ //outer loop for line
            for(int k=1; k<=n-i; k++){ //inner loop for space printing
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){ //inner loop for number printing
                System.out.print(i+"   ");
            }
            System.out.println(); //for next line
        }
    }

    public static void main(String[] args) {
        Number_Pyramid_Pattern(5); //function/method calling
    }
}
