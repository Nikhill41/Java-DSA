class Solution {
    public int smallestIndex(int[] nums) {
        boolean flag=false;
        int ind=nums.length;
       for(int i=0;i<nums.length;i++){
            int sum=0;
            int temp=nums[i];
            while(temp!=0){
                sum+=temp%10;
                temp=temp/10;
            }
            if(sum==i && ind>i){
                flag=true;
                ind=i;
            }
        }
        if(ind==nums.length){
            return -1;
        }else{
            return ind;
        }
    }
}