public class binarySearchingDecendingOrder {
    public static void main(String[] args){
            int[] arr={9,8,7,6,5,4,3,3,2};
            int target=8;
            System.out.println(searchElement(arr, target));
    }
    static int searchElement(int[] arr,int target){
        int start=0;    
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target<arr[mid]){
                start=mid+1;
            }else if(target>arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}