// package 13-Bitwise Operator and Number System;

public class findIthBitOfNumber {
    public static void main(String[] args) {
        int a=10;
        int i=4;
        findIthBitOfNumber obj=new findIthBitOfNumber();
        System.out.println(obj.ithBit(a,i));
    }
    static int ithBit(int a,int i){
        int res=a&(1<<(i-1));
        res=res>>i-1;
        return res;
    }
}
