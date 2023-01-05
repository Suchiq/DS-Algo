class Solution {

    public int maxProfit(int[] prices) {
        
        
        int min = prices[0];
        int max = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }

            max = prices[i] - min;
            
            if (max > profit) {
                profit = max;
            }
        }

        return profit;
    }
}
