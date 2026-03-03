package DAY_8_Patterns_Part_2;

public class D8_1_Print_Hollow_Rectangle_pattern {

    public static void Hollow_Rectangle(int n, int m){

        
        for(int i=1; i<=n; i++){ //outer loop for line

            for(int j=1; j<=m; j++){ //inner loop for pattern printing

                // cell - (i,j)

                if(i==1 || i==n || j==1 || j==m){ //condition where to print star

                    System.out.print("* ");
                }
                else{ //if condition will not true print space
                    System.out.print("  ");
                }
            } System.out.println(); //for next line

        }
    }
    
    public static void main(String[] args) {

        Hollow_Rectangle(4,5); //function/method calling
        
    }
}
