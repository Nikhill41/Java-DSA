// package 2D Array Binary Search;

public class searchingElementIn2Dmatrix {
    public static void main(String[] args) {
        int[][] matrix=new int[][]{{10,20,30,40},{15,25,35,45},
        {28,29,37,49},{33,34,38,50}};
        int target=37;
        System.out.println(binarySearch(matrix, target));
    }
    static int  binarySearch(int matrix[][],int target){
        for(int i=0;i<matrix.length;i++){
            int start=0;
            int end=matrix.length;
            int mid;
            while (start<=end) {
                mid=start+(end-start)/2;
                if(matrix[i][mid]<target){
                    start=mid+1;
                }else if(matrix[i][mid]>target){
                    end=mid-1;
                }else{
                    return matrix[i][mid];
                }
            }
        }
        return -1;
    }
}
