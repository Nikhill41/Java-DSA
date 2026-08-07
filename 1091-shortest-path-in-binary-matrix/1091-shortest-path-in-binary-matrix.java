class Solution {
    public class Triplets implements Comparable<Triplets>{
        int row,col,dis;
        Triplets(int row, int col, int dis){
            this.row=row;
            this.col=col;
            this.dis=dis;
        }
        public int compareTo(Triplets p){
            return Integer.compare(this.dis,p.dis);
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        int[][] minDis=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(minDis[i],Integer.MAX_VALUE);
        }
        minDis[0][0]=1;
        PriorityQueue<Triplets> pq=new PriorityQueue<>();
        pq.add(new Triplets(0,0,1));

        while(pq.size()>0){
            Triplets front=pq.remove();
            int row=front.row;
            int col=front.col;
            int currDis=front.dis;
            if(currDis>minDis[row][col]){
                continue;
            }
            if(row>0){//left
                if(grid[row-1][col]==0 && minDis[row-1][col]>currDis+1){
                    minDis[row-1][col]=currDis+1;
                    pq.add(new Triplets(row-1,col,currDis+1));
                }
            }
            if(row>0 && col>0){//left and up
                if( grid[row-1][col-1]==0 && minDis[row-1][col-1]>currDis+1){
                    minDis[row-1][col-1]=currDis+1;
                    pq.add(new Triplets(row-1,col-1,currDis+1));
                }
            }
            if(col>0){// up
                if(grid[row][col-1]==0 && minDis[row][col-1]>currDis+1){
                    minDis[row][col-1]=currDis+1;
                    pq.add(new Triplets(row,col-1,currDis+1));
                }
            }
            if(row>0 && col<n-1){//up and right
                if( grid[row-1][col+1]==0 && minDis[row-1][col+1]>currDis+1){
                    minDis[row-1][col+1]=currDis+1;
                    pq.add(new Triplets(row-1,col+1,currDis+1));
                }
            }
            if(col<n-1){//right
                if(grid[row][col+1]==0 && minDis[row][col+1]>currDis+1){
                    minDis[row][col+1]=currDis+1;
                    pq.add(new Triplets(row,col+1,currDis+1));
                }
            }
            if(row<n-1 && col<n-1){//down and right
                if( grid[row+1][col+1]==0 && minDis[row+1][col+1]>currDis+1){
                    minDis[row+1][col+1]=currDis+1;
                    pq.add(new Triplets(row+1,col+1,currDis+1));
                }
            }
            if(row < n-1){ // down
                if(grid[row+1][col] == 0 && minDis[row+1][col] > currDis+1){
                    minDis[row+1][col] = currDis+1;
                    pq.add(new Triplets(row+1, col, currDis+1));
                }
            }
            if(row<n-1 && col>0){// left and down
                if( grid[row+1][col-1]==0 && minDis[row+1][col-1]>currDis+1){
                    minDis[row+1][col-1]=currDis+1;
                    pq.add(new Triplets(row+1,col-1,currDis+1));
                }
            }
        }
        return minDis[n-1][n-1]==Integer.MAX_VALUE?-1:minDis[n-1][n-1];
    }
}