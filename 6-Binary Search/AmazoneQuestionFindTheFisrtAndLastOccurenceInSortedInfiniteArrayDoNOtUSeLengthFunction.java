public class AmazoneQuestionFindTheFisrtAndLastOccurenceInSortedInfiniteArrayDoNOtUSeLengthFunction {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,12,13,14,15,16,17,18,19};
        int target=12;
        int[] result=(checkingTheWindowInWhichElementExist(arr, target));
        System.out.println(result[0]+" "+result[1]);
    }
    static int[] checkingTheWindowInWhichElementExist(int[] arr,int target){
        int start=0;
        int end=start+1;
        while(arr[end]<target){
            start=end+1;
            end=((end+1)*2)-1;
        }
        return applyingBianrySearchInFixWindow(start, end,target, arr);
    }
    static int[] applyingBianrySearchInFixWindow(int start,int end, int target ,int[] arr){
        int start2=start;
        int end2=end;
        int mid;
        int i=-1;
        int j=-1;
        while (start<=end) {
            mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                i=mid;
                end=mid-1;
            }
        }
        while (start2<=end) {
            mid=start+(end2-start2)/2;
            if(arr[mid]<target){
                start2=mid+1;
            }else if(arr[mid]>target){
                end2=mid-1;
            }else{
                j=mid;
                start2=mid+1;
            }
        }
        return new int[]{i,j};
    }
}
