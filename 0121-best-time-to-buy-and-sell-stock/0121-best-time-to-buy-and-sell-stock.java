class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, min = prices[0];
        int len = prices.length;
        for(int i=1; i< len; i++){
            int p = prices[i] - min;
            if( p > profit)
                profit = p;

            if(min> prices[i])
                min = prices[i];
            
        }

        return profit;
    }
}