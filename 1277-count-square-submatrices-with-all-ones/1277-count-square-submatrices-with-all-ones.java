class Solution {
    public int countSquares(int[][] mat) {
        int count=0;
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0) continue;
                if(i>0 && j>0){
                    mat[i][j]+=min(mat[i-1][j],mat[i][j-1],mat[i-1][j-1]);
                }
                count+=mat[i][j];
            }
        }
        return count;
    }
    public int min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
}