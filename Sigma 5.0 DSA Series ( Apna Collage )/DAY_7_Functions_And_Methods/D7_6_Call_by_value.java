package DAY_7_Functions_And_Methods;

public class D7_6_Call_by_value {

    // Java always use call by value

    public static void swap(int a, int b){
        // swaping 

        int temp=a;
        a=b;
        b=temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println("Final value get swaped");

    }
    public static void main(String[] args) {
        // original value before swap

        int a=5;
        int b=10;

        swap(a,b);

    }
}
