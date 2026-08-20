class Solution {
    int result=0;
    int freeSpace;
    int n;
    int m;
    public int uniquePathsIII(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int startI=-1;
        int startJ=-1;
        freeSpace=0;
        int count=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    startI=i;
                    startJ=j;
                }
                if(grid[i][j]!=-1) freeSpace++;
            }
        }
        backtrack(grid,startI,startJ,count);
        return result;
    }
    void backtrack(int[][] grid,int i,int j,int count){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==-1) return;
        if(grid[i][j]==2){
            if(count==freeSpace){
                result++;
            }
            return;
        }
        int original=grid[i][j];
        grid[i][j]=-1;
        backtrack(grid,i,j-1,count+1);
        backtrack(grid,i-1,j,count+1);
        backtrack(grid,i,j+1,count+1);
        backtrack(grid,i+1,j,count+1);
        grid[i][j]=original;
    }
}