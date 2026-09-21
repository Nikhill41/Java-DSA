class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int i=0;
        int j=n-1;

        while(i<j){
            int mid=i+(j-i)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            if(nums[mid]==nums[mid-1]){
                if(mid%2!=0){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
            else if(nums[mid]==nums[mid+1]){
                if( mid%2==0){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
        }


        return nums[i];
    }
}