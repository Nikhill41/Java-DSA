public class chreckingTheOrderOfTheArray {
    public static void main(String[] args){
            int[] arr={9,8,7,6,5,4,3,3,2};
            // int[] arr={1,2,3,4,5,6,7,8,9};
            int target=8;
            System.out.println(searchElement(arr, target));
    }
    static int searchElement(int[] arr,int target){
        int start=0;    
        int end=arr.length-1;
        int mid;
        boolean isAscending=arr[start]<arr[end];
        while(start<=end){
            mid=start+(end-start)/2;
            if(target<arr[mid]){
                if(isAscending){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if(target>arr[mid]){
                if(isAscending){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                return mid;
            }
        }

        return -1;
    }
}