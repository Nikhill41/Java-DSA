// package Cyclic Sort;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr={0,9,8,6,5,3,2,1};
        sortCyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortCyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correIndex=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correIndex]){
                swap(arr, i, correIndex);
            }else{
                i++;
            }
            
        }
    } 
    static void swap( int[] arr,int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
