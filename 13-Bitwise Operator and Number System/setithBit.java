// package 13-Bitwise Operator and Number System;

public class setithBit {
    public static void main(String[] args) {
        int a =10,i=3;
        int bit=1;
        System.out.println(numberIthbit(a,i,bit));
    }
    static int numberIthbit(int a, int i,int bit){
        int res=bit<<(i-1);
        return a|res;
    }
}
