class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return destination(0,0,m,n,dp);
    }
    int destination(int r, int c, int m, int n,int[][] dp){
        if(r>=m || c>=n) return 0;
        if(m-1==r && n-1==c) return 1;
        if(dp[r][c]!=-1) return dp[r][c];
        return dp[r][c]= destination(r+1,c,m,n,dp)+destination(r,c+1,m,n,dp);
    }
    
}