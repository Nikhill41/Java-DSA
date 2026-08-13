class Solution {
    public int fib(int n) {
        int[] res=new int[n+1];
        fibo(n,res);
        return res[n];
    }
    int fibo(int n, int[] res){
        if(n<=1){
            if(n>=0){
                res[n]=n;
            }
            return n;
        }
        if(res[n]!=0) return res[n];
        int negative1=fibo(n-1,res);
        int negative2=fibo(n-2,res);
        res[n]=negative1+negative2;
        return negative1+negative2;
    }
}