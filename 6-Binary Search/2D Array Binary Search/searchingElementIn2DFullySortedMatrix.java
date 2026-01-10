// package 2D Array Binary Search;

import java.util.Arrays;

public class searchingElementIn2DFullySortedMatrix {
    public static void main(String[] args) {
        int[][] matrix=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target=16;
        System.out.println(Arrays.toString(binarySearchOnRows(target, matrix)));

    }
    static int[] binarySearchOnRows(int target, int[][] matrix){
        int rstart=0;
        int rend=matrix.length-1;
        int mid;
        int cstart=0;
        int cend=matrix.length-1;
        while(rstart<=rend){
            mid=rstart+(rend-rstart)/2;
            if(matrix[mid][0]==target){
                return new int[]{mid,0};
            }
            if(matrix[mid][cend]==target){
                return new int[]{mid,cend};
            }
            if(matrix[mid][0]<target){
                rstart=mid;
            }
            if(matrix[mid][rend]<target){
                rstart=mid+1;
            }
            if(matrix[mid][0]>target){
                rend=mid-1;
            }
            if(matrix[mid][cstart]<target && matrix[mid][cend]>target)
                return binarySearch(mid, cstart+1, cend-1, target, matrix);
        }
        return new int[]{-1,-1};
    }


    static int[] binarySearch(int row,int cstart,int cend,int target, int[][] matrix){
        int mid;
        while (cstart<=cend) {
            mid=cstart+(cend-cstart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }else if (matrix[row][mid]<target) {
                cstart=mid+1;
            }else{
                cend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}
