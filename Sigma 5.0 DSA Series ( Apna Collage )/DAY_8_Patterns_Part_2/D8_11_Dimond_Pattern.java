package DAY_8_Patterns_Part_2;

public class D8_11_Dimond_Pattern { // While coding this code I got the logical problem so, if you are revising be carful
      
    public static void Dimond_Pattern(int n){
        //1st half
        for(int i=1; i<=n; i++){ //outer loop for line
            for(int j=1; j<=(n-i); j++){ //inner loop for space printing
                System.out.print("  ");
            }
            for(int k=1; k<=((2*i)-1); k++){ //inner loop for star printing
                System.out.print("* ");
            }
            System.out.println(); //for next line
        }

        //2st half
        for(int i=n; i>=1; i--){ //outer loop for line
            for(int j=1; j<=(n-i); j++){ //inner loop for space printing
                System.out.print("  ");
            }
            for(int k=1; k<=((2*i)-1); k++){ //inner loop for star printing
                System.out.print("* ");
            }
            System.out.println(); //for next line
        }
    }

    public static void main(String[] args) {
        Dimond_Pattern(4); //function/method calling
    }
}


/* 

//-----------------------------------------------What's wrong in this code ?-----------------------------------------------

package DAY_8_Patterns_Part_2;

public class D8_11_Dimond_Pattern {
    
    public static void Dimond_Pattern(int n){
        //1st half
        int a=1;
        int b=((2*n)-1); 
        for(int i=1; i<=n; i++){ //outer loop for line
            for(int j=1; j<=n-i; j++){ //inner loop for space printing
                System.out.print("  ");
            }
            for(int k=1; k<=a; k++){ //inner loop for star printing
                System.out.print("* ");
            }
            a=+2;
            System.out.println(); //for next line
        }

        //2st half
        for(int i=n; i>=1; i--){ //outer loop for line
            for(int j=1; j<=n-i; j++){ //inner loop for space printing
                System.out.print("  ");
            }
            for(int k=1; k<=b; k++){ //inner loop for star printing
                System.out.print("* ");
            }
            b=-2;
            System.out.println(); //for next line
        }
    }

    public static void main(String[] args) {
        Dimond_Pattern(4); //function/method calling
    }
}

*/
