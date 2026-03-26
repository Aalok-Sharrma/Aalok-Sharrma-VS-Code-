package DAY_9_Array;

// It is a My Code For Best Time To Buy Or Sell Stock

public class D9_18_2_Best_Time_To_Buy_Or_Sell_Stock {
    
    public static boolean bestTimeToBuyOrSellStock(int prices[]){

        int buyPrice  = prices[0];
        int sellPrice = 0;
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i]<buyPrice){
                buyPrice = prices[i];
            }
            if(prices[i]>sellPrice){
                sellPrice = prices[i];
            }
        }
        profit = sellPrice - buyPrice;
        System.out.println("Our Total Profit is : "+profit);

        if(profit>0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("We maked some Profit : "+bestTimeToBuyOrSellStock(prices));
    }
}
