class Solution {
    public int maxProfit(int[] prices) {
        // kadane algo
        int n = prices.length;
        int maxProfit = 0;
        int sum = 0;

        for(int i=1;i<n;i++){
            int currDiff = prices[i]-prices[i-1];
            sum = Math.max(currDiff, sum+currDiff);
            maxProfit = Math.max(sum,maxProfit);
        }
        return maxProfit;
    }
}