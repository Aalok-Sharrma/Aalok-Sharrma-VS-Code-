package DAY_9_Array;

public class D9_17_Trapping_RainWater_Code {
    
    public static int trappingRainWaterCode(int height[] , int width){

        // Calculating Left Max Bounday - Array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];

        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Calculating Right Max Bounday - Array
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for(int j=height.length - 2; j>=0; j--){
            rightMax[j] = Math.max(height[j], rightMax[j+1]);
        }
        // Calculating Total Trapped Water using for loop
        int totalTrappedWater = 0;
        for(int k=0; k<height.length; k++){
            int waterLevel = Math.min(leftMax[k] , rightMax[k]);
            totalTrappedWater += (waterLevel - height[k])*width;
        }

        return totalTrappedWater;
    }

    public static void main(String[] args) {
        
        int height[] = {4,2,0,6,3,2,5};
        int width = 1;
        System.out.println("Total trapped Water is : "+trappingRainWaterCode(height,width));
    }
}
