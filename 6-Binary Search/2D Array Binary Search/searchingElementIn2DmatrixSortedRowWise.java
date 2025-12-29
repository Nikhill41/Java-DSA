// package 2D Array Binary Search;
//if sorted only row wise
public class searchingElementIn2DmatrixSortedRowWise {
    public static void main(String[] args) {
        int[][] matrix=new int[][]{{10,20,30,40},{15,25,35,45},
        {28,29,37,49},{33,34,38,50}};
        int target=37;
        System.out.println(findingTargetInMatrix(matrix, target));
    }
    static int findingTargetInMatrix(int[][] matrix, int target){
        for(int i=0;i<matrix.length;i++){
            if(target >=matrix[i][0] && target<=matrix[i][matrix.length-1]){
                int ans=binarySearch(i,target, matrix);
                if(ans!=-1){
                    System.out.println("Element find in "+i+" row");
                    return ans; 
                }
            }
        }
        return -1;
    }
    static int binarySearch(int i,int target,int matrix[][]){
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
        return -1;
    }
}
