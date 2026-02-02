// package 15-mergeSortUsingRecursion;
import java.util.*;
public class mergeSortUsingRecursion {
    public static void main(String[] a){
        int[] arr={1,7,6,5,4,3,2,1};
        ;
        System.out.println(Arrays.toString(new mergeSortUsingRecursion().mergeSort(arr)));

    }
    int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr, mid,arr.length));
        return merge(left,right);
        
    }
    static int[] merge(int[] left,int[] right){
        int[] mergeArr=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mergeArr[k]=left[i];
                i++;
                k++;
            }else if(left[i]>right[j]){
                mergeArr[k]=right[j];
                j++;
                k++;
            }else{
                mergeArr[k]=left[i];
                i++;
                k++;
            }
        }
        while(i<left.length){
            mergeArr[k]=left[i];
            i++;
            k++;
        }
        
        while(j<right.length){
            mergeArr[k]=right[j];
            j++;
            k++;
        }
        return mergeArr;
    }
    
}