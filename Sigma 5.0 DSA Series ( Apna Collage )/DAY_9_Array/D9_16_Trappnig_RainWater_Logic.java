package DAY_9_Array;

public class D9_16_Trappnig_RainWater_Logic {
    
/*

----------------------------------------- LOGIC -----------------------------------------

            1) Minimum no. of bars > 2.
            2) Ascending and Decending bars not trappes water.
            3) Formula to calculate Water Trapped.
               WaterTrapped = (WaterLevel - Bar Level / Height) * Width;
            4) WaterLevel is always Minimum of Maximum Left and Maximum Right.
               WaterLevel = Math.min(MaxLeft , MaxRight);
            
            * To calculate left and right maximum bar we use Auxiliary(Helper) arrays.
            
            * Auxiliary arrays :- This are exectly like array only but it is named like that because
                                  they help us to get our final. answer.
                                  
                                  int height   = {4,2,0,6,3,2,5};

                                  int LeftMax  = {4,4,4,6,6,6,6};
                                  int rightMax = {6,6,6,6,5,5,5};

*/
}
