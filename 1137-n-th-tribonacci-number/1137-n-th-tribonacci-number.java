class Solution {
    public int tribonacci(int n) {
        int[]  dp=new int[n+1];
        return  trib(n,dp);
    }
    int trib(int n,int[] dp){
        if(n<=1) return n;
        if(n==2) return 1;
        if(dp[n]!=0) return dp[n];
        int threeSum=trib(n-1,dp)+trib(n-2,dp)+trib(n-3,dp);
        dp[n]=threeSum;
        return threeSum;
    }
}