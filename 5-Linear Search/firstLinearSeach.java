// package Linear Search;

public class firstLinearSeach {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=4;
        System.out.println(find(arr,target));
    }
    static boolean find(int[] arr , int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }   
        return false;
    }
}
