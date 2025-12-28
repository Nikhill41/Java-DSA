public class RoatedArrayfindingPeakElementInRotatedarray {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        if(nums.length==1 && nums[0]==target){ System.out.println(1); System.exit(0);}
        if(nums.length==1 && nums[0]!=target){ System.out.println(-1); System.exit(0);}
        System.out.println("hii");
        System.out.println(findingPivotElement(nums));
        System.out.println("hii");
    }
    static int findingPivotElement(int[] nums){
        int start=0;
        int end=nums.length-1;
        int mid;
        int ans=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid<end && nums[mid]>=nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }

            if(nums[mid]>=nums[start]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}
