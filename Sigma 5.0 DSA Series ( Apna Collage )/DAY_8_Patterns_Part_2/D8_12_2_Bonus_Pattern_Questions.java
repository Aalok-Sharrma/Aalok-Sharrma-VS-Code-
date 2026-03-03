package DAY_8_Patterns_Part_2;

public class D8_12_2_Bonus_Pattern_Questions { // Palindromic Pattern With Numbers

    public static void Palindromic_Pattern_With_Numbers(int n){

        for(int i=1; i<=n; i++){ //outer loop for line
            for(int j=1; j<=n-i; j++){ //inner loop for space printing
                System.out.print("  ");
            }
            for(int k=i; k>=1; k--){ //inner loop for part-1 number printing
                System.out.print(k+" ");
            }
            for(int k=2; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println(); //for next line
        }
    }

    public static void main(String[] args) {
        Palindromic_Pattern_With_Numbers(5); //function/method calling
    }
}
