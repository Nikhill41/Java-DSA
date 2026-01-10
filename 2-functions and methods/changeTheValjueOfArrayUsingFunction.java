import java.util.*;
public class changeTheValjueOfArrayUsingFunction{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,67};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeValue(int[] nums){
        nums[0]=99;
    }
   
}