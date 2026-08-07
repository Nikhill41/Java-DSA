class Solution {
    public class Pair implements Comparable<Pair>{
        int node,dis;
        Pair(int node,int dis){
            this.node=node;
            this.dis=dis;
        }
        public int compareTo(Pair p){
            return this.dis-p.dis;
        }
    }
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Pair>());
        }
        int[][] minDis=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(minDis[i],Integer.MAX_VALUE);
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int dis=edges[i][2];
            adj.get(u).add(new Pair(v,dis));
            adj.get(v).add(new Pair(u,dis));
        }
        for(int i=0;i<n;i++){
            bfs(i,distanceThreshold,adj,minDis);
        }
        int resultMin = Integer.MAX_VALUE;
        int[] reachableCity=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(minDis[i][j]!=0 && minDis[i][j]!=Integer.MAX_VALUE){
                    count++;
                }
            }
            reachableCity[i]=count;
            resultMin=Math.min(resultMin,count);
        }
        int ind=0;
        for(int i=0;i<n;i++){
            if(reachableCity[i]==resultMin){
                ind=Math.max(i,ind);
            }
        }
        return ind;

    }

    void bfs(int i, int disTh,List<List<Pair>> adj,int[][] minDis){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(i,0));
        minDis[i][i]=0;
        while(pq.size()>0){
            Pair front=pq.remove();
            int currNode=front.node;
            int currDis=front.dis;
            if(currDis>disTh || currDis>minDis[i][currNode]){
                continue;
            }
            for(Pair p:adj.get(currNode)){
                int totalDis=currDis+p.dis;
                if(totalDis<minDis[i][p.node] && totalDis<=disTh ){
                    minDis[i][p.node]=totalDis;
                    pq.add(new Pair(p.node,totalDis));
                }
            }
        }
    }
}