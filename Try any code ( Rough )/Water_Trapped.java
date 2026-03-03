import java.math.*;

public class Water_Trapped {

    public static int Water_Trapped(int n[], int width){
    
        int lm=0;
        int rm=0;
        int left_max[];
        left_max = new int[n.length];
        int right_max[];
        right_max = new int[n.length];
        int water_level=0;
        int water_trapped=0;
        int total_water_trapped=0;
        
        for(int i=0; i<n.length; i++){
            for(int j=0; j<i; j++){
                if(n[j]>=lm){
                    lm=n[j];
                }
            }
            left_max[i]=lm;
            lm=0;
            for(int k=i+1; k<n.length; k++){
                if(n[k]>=rm){
                    rm=n[k];
                }
            }
            right_max[i]=rm;
            rm=0;
            
            water_level=Math.min(left_max[i],right_max[i]);
            // if(left_max[i]>=right_max[i]){
            //     water_level=right_max[i];
            // }
            // else{
            //     water_level=left_max[i];
            // }
            
            water_trapped=(water_level - n[i])*width;
            total_water_trapped +=water_trapped;
        }
        return total_water_trapped;
    }
    public static void main(String[] args) {
        int a[]={4,2,0,6,3,2,5};
        System.out.println("Total water trapped of array a[] is = "+Water_Trapped(a,1));
    }
}

// user.name = Aalok Sharrma
// user.email = aalokkumarsharrma@gmail.com
// user.passward = Vosmic-suhji4-sogpoxX@