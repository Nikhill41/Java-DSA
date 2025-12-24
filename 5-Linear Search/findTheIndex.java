// import java.util.*;
public class findTheIndex {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int target=9;
        System.out.println(findIndex(arr,target));
    }
    static int findIndex(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    
}
