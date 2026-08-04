class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<List<Integer>> revG=new ArrayList<>();
        int[] inD=new int[n];//in degree of nodes
        for(int i=0;i<n;i++){
            revG.add(new ArrayList<>());
        }
        // reverse the grapg directions to apply th kahn's algorithm
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                inD[i]++;
                revG.get(graph[i][j]).add(i);
            }
        }
        System.out.println(revG);
        System.out.println(Arrays.toString(inD));
        //now applying kahn's algorithms
        Queue<Integer> q=new LinkedList<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(inD[i]==0){
                q.add(i);
            }
        }
        while(q.size()>0){
            int front=q.remove();
            res.add(front);
            for(int i=0;i<revG.get(front).size();i++){
                inD[revG.get(front).get(i)]--;
                if(inD[revG.get(front).get(i)]==0){
                    q.add(revG.get(front).get(i));
                }
            }
        }

        Collections.sort(res);
        return res;
    }
}