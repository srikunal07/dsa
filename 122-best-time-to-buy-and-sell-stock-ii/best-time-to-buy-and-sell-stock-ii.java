class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        // Traverse through the array and accumulate profit whenever there is an increase
        for (int i = 1; i < prices.length; i++) {
            // If the price on the current day is higher than the previous day, we add the difference to maxProfit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        
        return maxProfit;
    }
}
