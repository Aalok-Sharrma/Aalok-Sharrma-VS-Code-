/* we know that if we take any decimal value with float/double datatype (DT) and
   we give any value to that(DT a = 9.5) so, for float DT we need to write "f" after
   value if we donot write "f" after value it will automatically considered as double
   value even if we write DT as float */

/* so, we are checking that didi we need to write "f" after float 
   variable if we are taking input form user

   Conclusion is that we don't need to write "f" after float 
   variable if we are taking input form user
 */


import java.util.*;
public class Input_From_User {

    public static float sum(float a, float b, float c){

        float sum = (float)a+b+c;

    return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        float a = sc.nextFloat();
        System.out.print("Enter the value of b : ");
        float b = sc.nextFloat();
        System.out.print("Enter the value of c : ");
        float c = sc.nextFloat();
        
        // float a = 10.2f;
        // float b = 11.4f;
        // float c = 23.4f;

        float sum = sum(a,b,c);

        System.out.println("Sum of "+a+"+"+b+"+"+c+" is : "+sum);
        
    }
    
}
