// package 6-Binary Search;

public class greatestElementSmallerOrEqualToTarget {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,8,9};
        int target=7;
        System.out.println(findingElement(arr, target));
    }
    static int findingElement(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int mid;
        int answer=end;
        while (start<=end) {
            mid=start+(end-start)/2;
            if(arr[mid]<=target){
                answer=arr[mid];
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return answer;
    }
}
