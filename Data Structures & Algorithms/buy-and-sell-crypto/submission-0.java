class Solution {
    public int maxProfit(int[] prices) {
        
        int left = 0; // best day to buy
        int profit = 0;

        for(int right=0; right < prices.length; right++){ // best day to sell
            while(prices[left]>prices[right]){
                left++;
            }
            profit = Math.max(profit,prices[right] - prices[left]);
        }        
        return profit;
    }
}
