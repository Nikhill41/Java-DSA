class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return Minimum(0,0,m,n,grid,dp);
    }
    int Minimum(int r,int c,int m, int n, int[][] grid,int[][] dp){
        if(r>=m) return Integer.MAX_VALUE;
        if(c>=n) return Integer.MAX_VALUE;
        if(r==m-1 && c==n-1) return grid[r][c];
        if(dp[r][c]!=-1) return dp[r][c];
        int down=Minimum(r+1,c,m,n,grid,dp);
        int up=Minimum(r,c+1,m,n,grid,dp);
        int min=Math.min(down,up);
        dp[r][c]=grid[r][c]+min;
        return dp[r][c];
    }
}