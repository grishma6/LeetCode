public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices){
        //Input: prices = [7,1,5,3,6,4]
        //Output: 7
        //Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
        //Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
        //Total profit is 4 + 3 = 7.

        //Input: prices = [1,2,3,4,5]
        //Output: 4
        //Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
        //Total profit is 4.

        //Input: prices = [7,6,4,3,1]
        //Output: 0
        //Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
        int profit = 0;

        // Start from day 1 because we compare with the previous day
        for(int i=1; i<prices.length; i++){
            // If today's price is higher than yesterday's,
            // we can make a profit by buying yesterday and selling today
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}
