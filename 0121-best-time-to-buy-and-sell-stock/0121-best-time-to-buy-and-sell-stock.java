class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int maxPro=0;
        int l=0;
        for(int r=1;r<prices.length;r++){
            if(prices[l]<prices[r]){
                maxPro=Math.max(prices[r]-prices[l],maxPro);
            }else{
                l=r;
            }
        }
        return maxPro;
    }
}