class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr=0;
        int pos=-1;
        int total=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            curr+=diff;
            total+=diff;
            if(curr<0){
                pos=i;
                curr=0;
            }
        }
        if(total<0){
            return -1;
        }
        return pos+1;
    }
}