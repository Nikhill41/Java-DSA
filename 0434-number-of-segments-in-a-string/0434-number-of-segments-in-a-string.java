class Solution {
    public int countSegments(String s) {
        if(s.trim().equals("")) return 0;
        String[] ans=s.split(" ");
        int count=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i].length()!=0) count++;
        }
        return count;
    }
}