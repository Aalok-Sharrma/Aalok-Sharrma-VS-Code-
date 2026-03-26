package DAY_9_Array.D9_19_Question_D9_20_Answers;

import java.util.HashSet;

// It is a Shradha Kapara Ma'am code For Did Any Number is Repeted In Array.

public class Q_A_1_2_Check_Did_Any_Number_In_A_Array_Is_Repeticing_Or_Not {
    
    public static boolean didAnyNumberRepetedInArray(int[] nums){

        HashSet<Integer> Set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(Set.contains(nums[i])){
                return true;
            }else{
                Set.add(nums[i]);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,1,6};
        boolean b=didAnyNumberRepetedInArray(a); 
        if(b == true){
        System.out.println("Yes in array a[] numbers repets");
        }
        else{
        System.out.println("No in array a[] No number repets");
        }
    }
}
