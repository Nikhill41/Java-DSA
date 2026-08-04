class Solution {
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> adj=new ArrayList<>();
        int[] inD=new int[n];//for indegree
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<pre.length;i++){
            int v=pre[i][0];
            int u=pre[i][1];
            adj.get(u).add(v);
            inD[v]++;
        }
        System.out.println(adj+"    "+Arrays.toString(inD));
        Queue<Integer> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(inD[i]==0){
                q.add(i);
            }
        }

        while(q.size()>0){
            int front=q.remove();
            ans.add(front);// if all are visited then added to ans
            for(int i=0;i<adj.get(front).size();i++){
                inD[adj.get(front).get(i)]--;//in degree cannot be in - because the parent element is one indegree
                if(inD[adj.get(front).get(i)]==0){//if degree is more than 0 means there any another path exist to visit this node
                    q.add(adj.get(front).get(i));
                }
            }
        }
        return ans.size()==n;
    }
}