import java.util.*;
public class cyclicSort1{
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        CyclicSort(arr);
        // System.out.println(missingNumber(arr));
        System.out.println(Arrays.toString(arr));
    }
    static void CyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
    }
    // static List<Integer> missingNumber(int[] arr){
    //     List<Integer> missing=new ArrayList<>();
    //     for(int i=0;i<arr.length;i++){
    //         if(i!=arr[i]-1){
    //             missing.add(i+1);
    //         }
    //     }
    //     return missing;
    // }
}