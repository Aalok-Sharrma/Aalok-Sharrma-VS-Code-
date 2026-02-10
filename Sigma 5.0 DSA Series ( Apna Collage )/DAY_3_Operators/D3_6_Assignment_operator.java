package DAY_3_Operators;

public class D3_6_Assignment_operator {
    public static void main(String[] args) {
        
        // (4) Bitwise Operators ( ON DAY_13 ) 

        // (5) Assignment Operators 

        // =        a=x      -->    a=10 , b=5        ( In this value of a is 10 and b is 5 )
        // +=       a=a+10   -->    a+=10
        // -=       b=b-5    -->    b-=5
        // *=       a=a*2    -->    a*=2
        // /=       b=b/5    -->    b/=5
        // %=       b=b%5    -->    b%=5
        
        int a=10,b=5;
        System.out.println(a);        // 1
        System.out.println(b);        // 2
        System.out.println((a+=10));  // 3  here 'a' become '20' therefore, 'a=20'
        System.out.println((b-=5));   // 4  here 'b' become '0' therefore, 'b=0'
        System.out.println((a*=2));   // 5  here 'a' become '40' therefore, 'a=40'
        System.out.println((b/=5));   // 6  here 'b' be the same '0' therefore, 'b=0'
        System.out.println((b%=5));   // 7  here 'b' be the same '0' therefore, 'b=0'

    }
}
