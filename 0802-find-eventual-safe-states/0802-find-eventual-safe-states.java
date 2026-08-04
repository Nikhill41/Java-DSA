class Solution {

    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n = graph.length;

        boolean[] vis = new boolean[n];
        boolean[] pathVis = new boolean[n];
        boolean[] safe = new boolean[n];

        for(int i = 0; i < n; i++){
            if(!vis[i]){
                dfs(i, graph, vis, pathVis, safe);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(safe[i]){
                ans.add(i);
            }
        }

        return ans;
    }

    boolean dfs(int node,
                int[][] graph,
                boolean[] vis,
                boolean[] pathVis,
                boolean[] safe){

        vis[node] = true;
        pathVis[node] = true;

        for(int next : graph[node]){

            if(!vis[next]){
                if(dfs(next, graph, vis, pathVis, safe))
                    return true;
            }
            else if(pathVis[next]){
                return true;
            }
        }

        pathVis[node] = false;
        safe[node] = true;

        return false;
    }
}