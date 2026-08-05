class Solution {
    public class Triplets implements Comparable<Triplets>{
        int row,col,effort;
        Triplets(int row,int col, int effort){
            this.row=row;
            this.col=col;
            this.effort=effort;
        }
        public int compareTo(Triplets p){
            return Integer.compare(this.effort,p.effort);
        }
    }
    public int minimumEffortPath(int[][] h) {
        int m=h.length;
        int n=h[0].length;
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=Integer.MAX_VALUE;
            }
        }
        ans[0][0]=0;
        PriorityQueue<Triplets> pq=new PriorityQueue<Triplets>();
        pq.add(new Triplets(0,0,0));

        while(pq.size()>0){
            Triplets front=pq.remove();
            int row=front.row;
            int col=front.col;
            int effort=front.effort;
            if (effort > ans[row][col]) {
                continue;
            }
            if(row>0){  // up direction
                int e=Math.abs(h[row-1][col]-h[row][col]);
                e=Math.max(e,effort);
                if(e<ans[row-1][col]){
                    ans[row-1][col]=e;
                    pq.add(new Triplets(row-1,col,e));
                }
            }
            if(row<m-1){  // down direction 
                int e=Math.abs(h[row+1][col]-h[row][col]);
                e=Math.max(e,effort);
                if(e<ans[row+1][col]){
                    ans[row+1][col]=e;
                    pq.add(new Triplets(row+1,col,e));
                }
            }
            if(col>0){  // left direction
                int e=Math.abs(h[row][col-1]-h[row][col]);
                e=Math.max(e,effort);
                if(e<ans[row][col-1]){
                    ans[row][col-1]=e;
                    pq.add(new Triplets(row,col-1,e));
                }
            }
            if(col<n-1){  // right direction
                int e=Math.abs(h[row][col+1]-h[row][col]);
                e=Math.max(e,effort);
                if(e<ans[row][col+1]){
                    ans[row][col+1]=e;
                    pq.add(new Triplets(row,col+1,e));
                }
            }
        }
        return ans[m-1][n-1];
    }
}