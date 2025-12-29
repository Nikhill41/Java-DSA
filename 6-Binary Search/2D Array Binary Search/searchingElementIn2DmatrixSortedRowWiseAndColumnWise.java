// package 2D Array Binary Search;

public class searchingElementIn2DmatrixSortedRowWiseAndColumnWise {
    public static void main(String[] args) {
        int[][] matrix=new int[][]{{10,20,30,40},{15,25,35,45},
        {28,29,37,49},{33,34,38,50}};
        int target=37;
        int row=0;
        int col=matrix.length-1;
        while (row<=matrix.length-1 && col>=0) {
            if(matrix[row][col]>target){
                col--;
            }else if(matrix[row][col]<target){
                row++;
            }else{
                System.out.println("Target fount in row "+row+" and column "+col);
                System.exit(0);
            }
        }
        System.out.println("not found");
    }
}