public class rotaionCountOfArray {
    public static void main(String[] args) {
        int[] arr={2,3,6,12,15,18};
        System.out.println(rotationCount(arr));
    }
        static int rotationCount(int[] arr){
            int start=0;
            int end=arr.length-1;
            int mid;
            while (start<=end) {
                mid=start+(end-start)/2;
                if(mid<end && arr[mid]>arr[mid+1]){
                    return mid+1;
                }else if(mid>start && arr[mid]<arr[mid-1]){
                    return mid;
                }
                if (arr[mid]>=arr[start]) {
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            return 0;
        }
}
