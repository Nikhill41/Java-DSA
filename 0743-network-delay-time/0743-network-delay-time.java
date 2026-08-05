class Solution {
    public class Pair implements Comparable<Pair>{
        int node;
        int time;
        Pair(int node, int time){
            this.node=node;
            this.time=time;
        }
        public int compareTo(Pair p){
            return this.time-p.time;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Pair>());
        }
        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int time=times[i][2];
            adj.get(u).add(new Pair(v,time));
        }
        int[] timeTaken=new int[n+1];
        Arrays.fill(timeTaken,Integer.MAX_VALUE);
        timeTaken[k]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(k,0));
        while(pq.size()>0){
            Pair top=pq.remove();
            int node=top.node;
            int time=top.time;
            if(time>timeTaken[node]){
                continue;
            }
            for(Pair p:adj.get(node)){
                if(time+p.time<timeTaken[p.node]){
                    timeTaken[p.node]=time+p.time;
                    pq.add(new Pair(p.node,time+p.time));
                }
            }
        }
        int max=-1;
        for(int i=1;i<timeTaken.length;i++){
            if(timeTaken[i]==Integer.MAX_VALUE) return -1;
            max=Math.max(max,timeTaken[i]);
        }
        return max;
    }
}