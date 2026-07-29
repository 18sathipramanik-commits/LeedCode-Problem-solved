class Solution {
    public int maxProfit(int[] prices) {
       int profit=0;
    int minprofit=Integer.MAX_VALUE;

    for(int i=0;i<prices.length;i++){
        if(prices[i]<minprofit){
            minprofit=prices[i];
        }
        else if(prices[i]-minprofit>profit){
             profit=prices[i]-minprofit;
        }
    }
    return profit;
    }
}