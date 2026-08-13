class Solution {
    public int tribonacci(int n) {
        int[]  dp=new int[n+1];
        trib(n,dp);
        return dp[n];
    }
    int trib(int n,int[] dp){
        if(n==0){
            dp[0]=0;
            return dp[0];
        }
        if(n==1){
            dp[1]=1;
            return dp[1];
        }
        if(n==2){
            dp[2]=1;
            return dp[2];
        }
        if(dp[n]!=0) return dp[n];
        int threeSum=trib(n-1,dp)+trib(n-2,dp)+trib(n-3,dp);
        dp[n]=threeSum;
        return threeSum;
    }
}