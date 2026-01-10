// package Bubble Sort;

import java.util.Arrays;

public class bubblesorting {
    public static void main(String[] args) {
        int[] arr=new int[]{9,8,7,6,5,4,3,2};
        System.out.println(Arrays.toString(bubblesor(arr)));
    }
    static int[] bubblesor(int[] arr){
        for(int i = arr.length-1; i >0 ; i--) {
            int count=0;
            for(int j = 0; j < i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
            //if count==0 means remaining arra is sorted
            if (count==0) {
                return arr;
            }
        }
        return arr;
    }
}
