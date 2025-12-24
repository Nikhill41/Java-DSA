import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[][] arr={{1,2,4,6},{7,6,4,5,6},{4,6,4,6,54,5}};
        int target=5;
        int[] index=findindex(arr , target);
        System.out.println(Arrays.toString(index));
    }
    static int[] findindex(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
