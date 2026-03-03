public class Rotated_K_Pattern {

    public static void Rotated_K_Pattern(int n){
        // 1st half
        for(int i=n; i>=1; i--){
            // space
            for(int sp=n-i; sp>=1; sp--){
                System.out.print(" ");
            }
            // star
            for(int st=i; st>=1; st--){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half 
        for(int i=2; i<=n; i++){
            // space
            for(int sp=n-i; sp>=1; sp--){
                System.out.print(" ");
            }
            // star
            for(int st=i; st>=1; st--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Rotated_K_Pattern(3);
    }
    
}
