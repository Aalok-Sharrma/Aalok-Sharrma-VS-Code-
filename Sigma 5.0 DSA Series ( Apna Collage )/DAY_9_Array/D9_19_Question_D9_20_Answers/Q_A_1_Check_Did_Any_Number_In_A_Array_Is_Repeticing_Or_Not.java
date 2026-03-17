package DAY_9_Array.D9_19_Question_D9_20_Answers;

public class Q_A_1_Check_Did_Any_Number_In_A_Array_Is_Repeticing_Or_Not {
    
    public static boolean DidAnyNumberRepetedInArray(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,1,6};
        boolean b=DidAnyNumberRepetedInArray(a);
        if(b == true){
        System.out.println("Yes in array a[] numbers repets");
        }
        else{
        System.out.println("No in array a[] No number repets");
        }
    }
}
