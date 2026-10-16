class Solution {
    public int trap(int[] h) {
        int l=0;
        int r=h.length-1;
        int ans=0;
        int lmax=Integer.MIN_VALUE;
        int rmax=Integer.MIN_VALUE;
        while(l<r){
            lmax=Math.max(lmax,h[l]);
            rmax=Math.max(rmax,h[r]);
            if(lmax<rmax){
                ans+=lmax-h[l++];
            }else{
                ans+=rmax-h[r--];
            }
        }
        return ans;
    }
}