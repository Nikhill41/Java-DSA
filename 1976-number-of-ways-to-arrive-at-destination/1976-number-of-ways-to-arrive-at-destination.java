class Solution {
    int M=(int)1e9+7;
    public class Pair implements Comparable<Pair>{
        int node;
        long time;
        Pair(int node,long time){
            this.time=time;
            this.node=node;
        }
        public int compareTo(Pair p){
            return Long.compare(this.time,p.time);
        }
    }
    public int countPaths(int n, int[][] roads) {
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Pair>());
        }
        for(int i=0;i<roads.length;i++){
            int u=roads[i][0];
            int v=roads[i][1];
            int time=roads[i][2];
            adj.get(u).add(new Pair(v,time));
            adj.get(v).add(new Pair(u,time));
        }
        long[] result=new long[n];
        int[] countPath=new int[n];
        Arrays.fill(result,Long.MAX_VALUE);
        result[0]=0;
        countPath[0]=1;
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0,0));
        while(pq.size()>0){
            Pair front=pq.remove();
            int currNode=front.node;
            long currTime=front.time;

            for(Pair p:adj.get(currNode)){
                if(currTime+p.time<result[p.node]){
                    result[p.node]=currTime+p.time;
                    pq.add(new Pair(p.node,currTime+p.time));
                    countPath[p.node]=countPath[currNode];
                }else if(currTime+p.time==result[p.node]){
                    countPath[p.node]=(countPath[p.node]+countPath[currNode])%M;
                }
            }

        }
        return countPath[n-1];
    }
}