class searchingDuplicateElementsRoatatedArraylletcode33 {
    public boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return binarySearch(mid,target,nums);
            }else if(mid>start && nums[mid]<nums[mid-1]){
                return binarySearch(mid-1,target,nums);
            }
            if(start<nums.length-1 && nums[start]>nums[start+1]){
                return binarySearch(start,target,nums);
            }else{
                start++;
            }
            if(end>0 && nums[end]<nums[end-1]){
                return binarySearch(end-1,target,nums);
            }else{
                end--;
            }
        }
        return binarySearch(-1,target,nums);
    }
    boolean binarySearch(int peak,int target,int[] nums){
        int start;
        int end;
        if(peak==-1){
            start=0;
            end=nums.length-1;
        }else if(target>=nums[0]){
            start=0;
            end=peak;
        }else{
            start=peak+1;
            end=nums.length-1;
        }
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}