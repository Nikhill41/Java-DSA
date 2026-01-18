// package binarySearchInRecursion;

public class findTargetUsingRecursion {
    public static void main(String[] args) {
        int[] arr={1,4,6,8,9};
        int target=9;
        int start=0;
        int end=arr.length-1;
        System.out.println(searchUsingRecursion(arr,target,start,end));
    }
    static int searchUsingRecursion(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]<target){
            return searchUsingRecursion(arr, target, mid+1, end);
        }else{
            return searchUsingRecursion(arr, target, start, mid-1);
        }
        
        
    }
}
