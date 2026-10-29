class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int maxend=nums[0];
        for(int i=1;i<nums.length;i++){
            maxend=Math.max(nums[i],maxend+nums[i]);
            res=Math.max(res,maxend);
        }
        return res;
    }
}