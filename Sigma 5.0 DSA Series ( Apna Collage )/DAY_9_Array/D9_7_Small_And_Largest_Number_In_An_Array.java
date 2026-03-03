package DAY_9_Array;

public class D9_7_Small_And_Largest_Number_In_An_Array {
    
    public static void Small_And_Largest_Number_In_An_Array(int a[]){

        int Samllest_Number = Integer.MAX_VALUE;
        int Largest_Number  = Integer.MIN_VALUE;
        int Smallest_Number_Index = -1;
        int Largest_Number_Index  = -1;

        for(int i=0; i<a.length; i++){

            if(a[i]<Samllest_Number){
                Samllest_Number=a[i];
                Smallest_Number_Index=i;
            }
            if(a[i]>Largest_Number){
                Largest_Number=a[i];
                Largest_Number_Index=i;
            }
        }

        System.out.println("Largest number in a[] Array is  : "+Largest_Number+" at Index no. : "+Largest_Number_Index);
        System.out.println("Smallest number in a[] Array is : "+Samllest_Number+" at Index no. : "+Smallest_Number_Index);

    }

    public static void main(String[] args) {
        int a[] = {1,2,8,2,87,-3,-2,-5};
        Small_And_Largest_Number_In_An_Array(a);
    }
}
