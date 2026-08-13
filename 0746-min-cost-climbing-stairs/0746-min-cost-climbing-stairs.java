class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(costMin(cost,n-1,dp),costMin(cost,n-2,dp));
    }
    int costMin(int[] cost, int index, int[] dp){
        if(index==0 || index==1) return cost[index];
        if(dp[index]!=-1) return dp[index];
        int min=Math.min(costMin(cost,index-1,dp),costMin(cost,index-2,dp));
        dp[index]=min+cost[index];
        return min+cost[index];
    }
}