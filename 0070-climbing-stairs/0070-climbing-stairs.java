class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return ways(0,n,dp);
    }
    int ways(int currS,int n,int[] dp){
        if(currS>n) return 0;
        if(currS==n) return 1;
        if(dp[currS]!=-1) return dp[currS];
        return dp[currS]= ways(currS+1,n,dp)+ ways(currS+2,n,dp);
    }
}