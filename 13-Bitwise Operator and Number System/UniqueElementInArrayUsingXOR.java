// package 13-Bitwise Operator and Number System;

public class UniqueElementInArrayUsingXOR {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,2,1,3,6,4};
        System.out.println(uniuqe(arr));
    }
    static int uniuqe(int[] arr){
        int uniqueElement=0;
        for(int n:arr){
            uniqueElement=uniqueElement^n;//here it will store every number if same number matches then it will remove borh numbers so only single appearence numbers will remian
        }
        return uniqueElement;
    }
}
