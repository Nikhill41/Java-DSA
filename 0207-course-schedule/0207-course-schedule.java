class Solution {
    public boolean canFinish(int n, int[][] pre) {
        boolean[] vis=new boolean[n];
        boolean[] pathVis=new boolean[n];
        List<List<Integer>> adj=new ArrayList<>();
        for(int  i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<pre.length;i++){
            int u=pre[i][0];
            int v=pre[i][1];
            adj.get(v).add(u);
        }
        System.out.println(adj);
        for(int i=0;i<n;i++){
            if(!vis[i]){
                if(!dfs(i,vis,pathVis,adj)){
                    return false;
                }
            }
        }
        return true;
    }
    boolean dfs(int node,boolean[] vis, boolean[] pathVis,List<List<Integer>> adj){
        vis[node]=true;
        pathVis[node]=true;
        for(int i=0;i<adj.get(node).size();i++){
            if(!vis[adj.get(node).get(i)]){
                if(!dfs(adj.get(node).get(i),vis,pathVis,adj)){
                    return false;
                }
            }else if(pathVis[adj.get(node).get(i)]==true){
                return false;
            }
        }
        pathVis[node]=false;
        return true;
    }
}