public class SmallestElementGreaterOrEqual {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11,13,15,16,18,19,20,21};
        int target=40;
        System.out.println(findingElement(arr,target));
    }
    static int findingElement(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int answer=0;
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>=target){
                answer=arr[mid];
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return answer;
    }
}