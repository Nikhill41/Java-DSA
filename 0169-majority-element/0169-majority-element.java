class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        int ele=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(count<map.get(nums[i])){
                count=map.get(nums[i]);
                ele=nums[i];
            }
        }
        return ele;
    }
}