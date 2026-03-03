package DAY_8_Patterns_Part_2;

public class D8_7_Butterfly_Pattern_Logic {

    /*
    Here is the concept to print butterfly in brife if you want in detail you can reffer notes

    
  In --> public static void Butterfly_Pattern(int n)
  
    ==> 1st half


    --> outer loop (outer loop for line) -- for(int i=1; i<=n; i++)

      --> inner loop (inner loop for star printing) -- for(int j=1; j<=i; j++)
      --> inner loop (inner loop for space printing) --for(int k=1; k<=2*(n-i); k++){ // Here at the place of condition instead of k<=2*(n-i); we can also write/use k<=(2*n)-(i*2);
      --> inner loop (inner loop for star printing) -- for(int j=1; j<=i; j++)

      -->for next line

    ==> 2st half


    --> outer loop (outer loop for line) -- for(int i=n; i>=1; i--)

      --> inner loop (inner loop for star printing) -- for(int j=1; j<=i; j++)
      --> inner loop (inner loop for space printing) --for(int k=1; k<=2*(n-i); k++){ // Here at the place of condition instead of k<=2*(n-i); we can also write/use k<=(2*n)-(i*2);
      --> inner loop (inner loop for star printing) -- for(int j=1; j<=i; j++)

      -->for next line

  In --> public static void main(String[] args)
   
    function/method calling

    
    
    */
}