package DAY_9_Array.D9_19_Question_D9_20_Answers;

// It is a My Code For Triplates_Whos_Sum_Is_0.

/* For this code there was two conditions

    1. a[i]+a[j]+a[k]==0 (a[i]+a[j]+a[k] should be 0) -- this condition is satisfied in this code
    2. And no any triplet should repeat  -- this condition is not satisfied in this code
*/

public class Q_A_5_2_Triplates_Whos_Sum_Is_0 {
    
    public static void triplatesWhosSumIs0(int a[]){

        int b=0;

        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                for(int k=j+1; k<a.length; k++){
                    if(a[i]+a[j]+a[k]==0){
                        b++;
                        System.out.println("Set - "+b+" is ["+a[i]+","+a[j]+","+a[k]+"]");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int a[]={-1,0,-1,2,-1,-4};
        triplatesWhosSumIs0(a);
    }

}
