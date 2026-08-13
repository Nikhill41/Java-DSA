class Solution {
    public int tribonacci(int n) {
        if(n<=1) return n;
        int a=0;
        int b=1;
        int c=1;
        for(int i=0;i<n;i++){
            int temp=a+b+c;
            a=b;
            b=c;
            c=temp;
        }
        return a;
    }
}