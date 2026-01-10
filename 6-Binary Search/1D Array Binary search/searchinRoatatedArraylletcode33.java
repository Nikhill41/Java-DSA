class searchinRoatatedArraylletcode33 {
    public int search(int[] nums, int target) {
        return findingPeak(target,nums);
    }
    int findingPeak(int target,int[] nums){
        int start=0;
        int end=nums.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                if(target>=nums[0]){
                    return binarySearch(nums,target,0,mid);
                }else{
                    return binarySearch(nums,target,mid+1,nums.length-1);
                }
            }else if(mid>start && nums[mid]<nums[mid-1]){
                if(target>=nums[0]){
                    return binarySearch(nums,target,0,mid-1);
                }else{
                    return binarySearch(nums,target,mid,nums.length-1);
                }
            }
            if(nums[mid]>=nums[start]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return binarySearch(nums,target,0,nums.length-1);
    }
    int binarySearch(int[] nums,int target,int start,int end){
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}