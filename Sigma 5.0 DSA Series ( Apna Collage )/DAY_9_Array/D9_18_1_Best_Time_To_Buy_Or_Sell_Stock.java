package DAY_9_Array;

// It is a Shradha Kapara Ma'am Code For Best Time To Buy Or Sell Stock

public class D9_18_1_Best_Time_To_Buy_Or_Sell_Stock {

    public static int Best_Time_To_Buy_Or_Sell_Stock(int Prices[]){

        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int i=0; i<Prices.length; i++){

            if(Prices[i]>BuyPrice){
                int Profit = Prices[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit, Profit);

            }else{
                BuyPrice = Prices[i];
            }
        }
        return MaxProfit;
    }
    
    public static void main(String[] args) {
        
        int Prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit which we can make is : "+Best_Time_To_Buy_Or_Sell_Stock(Prices));
    }
}
