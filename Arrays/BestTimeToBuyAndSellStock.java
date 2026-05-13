//Leetcode 121
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int n=prices.length;
        int mini=prices[0];
        for(int i=1;i<n;i++){
            maxprofit=Math.max(maxprofit,prices[i]-mini);
            mini=Math.min(mini,prices[i]);
            

        }return maxprofit;
        
    }
}
