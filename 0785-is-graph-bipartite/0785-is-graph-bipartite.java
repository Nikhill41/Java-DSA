class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(!dfs(i,0,graph,color)){
                    return false;
                }
            }
        }
        return true;
    }

    boolean dfs(int i, int curColor,int[][] graph ,  int[] color){
        color[i]=curColor;
        for(int j=0;j<graph[i].length;j++){
            int neigbour=graph[i][j];
            if(color[neigbour]==-1){
                if(!dfs(neigbour,1-curColor,graph,color)){
                    return false;
                }
            }else if(color[neigbour]==curColor){
                return false;
            }
        }
        return true;
    }
}

