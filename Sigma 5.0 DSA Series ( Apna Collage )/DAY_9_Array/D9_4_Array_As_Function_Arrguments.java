package DAY_9_Array;

import java.util.Arrays;

public class D9_4_Array_As_Function_Arrguments {
    
    /*
    
    There are two type of argument passing :

      (1) Pass By Value :- In this if I pass the value of (x) from main function (psvm) to a function name 
                           sum() and if the value of (x) get changed in sum() function that changed value 
                           of (x) will be stay in sum() function only and not going to reflect to main 
                           function.

      (2) Pass By Reference :- In this if I pass the value of (x) from main function (psvm) to a function name 
                               sum() and if the value of (x) get changed in sum() function that changed value 
                               of (x) will going be reflect to main function even if sum() function is of void type.

    -----------------------------------------------(A)-----------------------------------------------

    here we passed (Non-Premitive Variable)Array --> mark[]={1,2,3,4,5} and (premitive variable)Integer --> a=10

    -----------------------------------------------(B)-----------------------------------------------

    IMPORTANT: when ever "it's or it" is use in below text it means that we are taking about {(Premitive Variable)Integer --> a}

    here we get 10 as output which we already know because we have assigned a=10 even when we have passed 
    it's a=10 value to Updates() function it don't get changed or updated even if it has changed or updated 
    in Updates() function it has two reason behind this.

        (1) Updates() function has void return type and even if it has the int(Integer) as it's 
            return type it will not get updated until it get return in the end in return 
            statement like this "return a;".
        (2) It is a Premitive variable or normal variable which follows "PASS BY VALUE".

    -----------------------------------------------(C)-----------------------------------------------

    IMPORTANT: when ever "it's or it" is use in below text it means that we are taking about {(Non-Premitive Variable)Array --> marks[]}

    here we get [2, 3, 4, 5, 6] as output which we don't know because we thought we are going to get
    [1, 2, 3, 4, 5] because we assigned mark[]={1,2,3,4,5} even when we passed mark[]={1,2,3,4,5} to a 
    void function but then also we get it's updated value there is only one reason behind this. 

        (1) It is a Non-Premitive variable which follows "PASS BY REFERENCE".

    */
   
    public static void Updates(int mark[], int a){

        a=5;

        for(int i=0; i<mark.length; i++){
            mark[i] += 1;
        }

    }

    public static void main(String[] args) {
        int a=10;
        int mark[]={1,2,3,4,5};
        Updates(mark, a);                           // (A)
        System.out.println(a);                      // (B)                       
        System.out.println(Arrays.toString(mark));  // (C)
    }
}
