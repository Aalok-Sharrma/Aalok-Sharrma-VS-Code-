import java.util.Arrays;

public class Try_D9_Q_A_2 {
    
    public static void revert(int a[], int target){
        int[] b = new int[target];
        
        for(int i=0; i<a.length; i++){
          if((i<b.length)){
              b[i] = a[i];
          }else {
              a[i-target] = a[i];
              a[i] = b[i-target];
          }
        }
    }
    public static void main(String[] args) {
        int[] a={-1,0,1,2,-1,-4};
        int target = 3;
        System.out.println("Array before revert : "+Arrays.toString(a));
        revert(a,target);
        System.out.println("Array after revert : "+Arrays.toString(a));
    }
}
