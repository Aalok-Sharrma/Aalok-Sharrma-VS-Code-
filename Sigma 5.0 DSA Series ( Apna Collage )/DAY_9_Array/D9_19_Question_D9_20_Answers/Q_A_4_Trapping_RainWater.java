package DAY_9_Array.D9_19_Question_D9_20_Answers;

public class Q_A_4_Trapping_RainWater {

    // It is a Shradha Kapara Ma'am and my code For Trapping_RainWater.
    
    public static int Trapping_RainWater_Code(int Height[] , int Width){

        // Calculating Left Max Bounday - Array
        int LeftMax[] = new int[Height.length];
        LeftMax[0] = Height[0];

        for(int i=1; i<Height.length; i++){
            LeftMax[i] = Math.max(Height[i], LeftMax[i-1]);
        }

        // Calculating Right Max Bounday - Array
        int RightMax[] = new int[Height.length];
        RightMax[Height.length - 1] = Height[Height.length - 1];
        for(int j=Height.length - 2; j>=0; j--){
            RightMax[j] = Math.max(Height[j], RightMax[j+1]);
        }
        // Calculating Total Trapped Water using for loop
        int TotalTrappedWater = 0;
        for(int k=0; k<Height.length; k++){
            int WaterLevel = Math.min(LeftMax[k] , RightMax[k]);
            TotalTrappedWater += (WaterLevel - Height[k])*Width;
        }

        return TotalTrappedWater;
    }

    public static void main(String[] args) {
        
        int Height[] = {4,2,0,6,3,2,5};
        int Width = 1;
        System.out.println("Total trapped Water is : "+Trapping_RainWater_Code(Height,Width));
    }
}
