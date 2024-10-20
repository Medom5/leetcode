class Solution {
    public int maxProfit(int[] prices) {
        int profit=0, maxProfit=0, min  = prices[0];
        for(int i=1; i< prices.length; i++){
            if(prices[i]  - min > profit)
                {   profit = prices[i] - min;
                    maxProfit+=profit;
                    profit = 0;
                }
                    min = prices[i];

        }
        return maxProfit;
    }
}