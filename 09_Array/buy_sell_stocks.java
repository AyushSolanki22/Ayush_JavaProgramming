public class buy_sell_stocks {
    public static void buyAndSellStocks(int prices[]) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        int profit=0;
        // sell price = prices[i];

        for (int i=0; i<prices.length; ++i) {
            if (buyPrice<prices[i]) {
                profit=prices[i]-buyPrice;  //today's profit
                maxProfit=Math.max(maxProfit, profit);
            }
            else {
                buyPrice=prices[i];     //buy day 
            }
        }
        System.out.println("Buy price= "+buyPrice);
        System.out.println("Max Profit: "+maxProfit);

    }
    public static void main(String[] args) {
        int prices[]= {7,1,5,3,6,4};

        buyAndSellStocks(prices);
    }
}
