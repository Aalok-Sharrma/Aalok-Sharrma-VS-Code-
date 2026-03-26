package DAY_9_Array;

// It is a Shradha Kapara Ma'am Code For Best Time To Buy Or Sell Stock

public class D9_18_1_Best_Time_To_Buy_Or_Sell_Stock {

    public static int bestTimeToBuyOrSellStock(int prices[]){

        int buyPrice = Integer.MAX_VALUE;   // here we can have BuyPrice = Prices[0];
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){ // here we can start loop with i=1 if BuyPrice is initialted with Prices[0] (means BuyPrice = Prices[0])

            if(prices[i]>buyPrice){
                int Profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, Profit);

            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum Profit which we can make is : "+bestTimeToBuyOrSellStock(prices));
    }
}
