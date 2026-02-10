package DAY_7_Functions_And_Methods;

public class D7_22_Scope_block_scope {
    public static void main(String[] args) {
        
        // {     }  --> This is a block also know as block of code

        // If we define/declaration/create any variable in any block so, we can use that variable
        // in that block only and we need to keep concept of method / function scope in our mind
        // in the block.

        // int x=6;
        // int y=5;
        // if(x > y) {
        //     int p=6;
        //     System.out.println(p);     // right
        // }System.out.println(p);        // wrong

        // int x=2,y=1,p=0;
        // if(x>y) {
        //     p=10;
        //     System.out.println(p);        // right
        //     y--;
        // }System.out.println(p);           // right
        
    }
}
