package DAY_8_Patterns_Part_2;

public class D8_1_Print_Hollow_Rectangle_pattern {

    public static void Hollow_Rectangle(int n, int m){

        // outer loop - number of line/row

        for(int i=1; i<=n; i++){

            // inner loop for column

            for(int j=1; j<=m; j++){

                // cell - (i,j)

                if(i==1 || i==n || j==1 || j==m){

                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            } System.out.println();

        }
    }
    
    public static void main(String[] args) {

        Hollow_Rectangle(4,5);
        
    }
}
