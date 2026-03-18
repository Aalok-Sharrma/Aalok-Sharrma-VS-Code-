package DAY_9_Array.D9_19_Question_D9_20_Answers;

// It is a My Code For Best Time To Buy Or Sell Stock

public class Q_A_3_2_Best_Time_To_Buy_Or_Sell_Stock {
    
    public static boolean Best_Time_To_Buy_Or_Sell_Stock(int Prices[]){

        int BuyPrice  = Prices[0];
        int SellPrice = 0;
        int Profit = 0;

        for(int i=1; i<Prices.length; i++){
            if(Prices[i]<BuyPrice){
                BuyPrice = Prices[i];
            }
            if(Prices[i]>SellPrice){
                SellPrice = Prices[i];
            }
        }
        Profit = SellPrice - BuyPrice;
        System.out.println("Our Total Profit is : "+Profit);

        if(Profit>0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int Prices[] = {7,1,5,3,6,4};
        System.out.println("We maked some Profit : "+Best_Time_To_Buy_Or_Sell_Stock(Prices));
    }
}
