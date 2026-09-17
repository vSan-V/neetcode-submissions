class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice>prices[i]){
                buyPrice = prices[i];
            }
            int checkProfit = prices[i]-buyPrice;

            if(checkProfit>maxProfit){
                maxProfit = checkProfit;
            }
        }
        return maxProfit;
    }
}
