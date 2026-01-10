// package 8-Selection Sort;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr={6,5,3,2,99,88,88,88,9,8,9,0};
        System.out.println(Arrays.toString(SelectionSort(arr)));
    }
    static int[] SelectionSort(int[] arr){
        
        for(int i=arr.length-1; i>=0;i--){
            int max=Integer.MIN_VALUE;
            int maxIndex=0;
            for(int j=0;j<=i;j++){
                if(max<arr[j] ){
                    max=arr[j];
                    maxIndex=j;
                }
            }
            arr[maxIndex]=arr[i];
            arr[i]=max;
        }
        return arr;
    }
}
