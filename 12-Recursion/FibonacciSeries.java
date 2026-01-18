// package 12-Recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        //print the fibonacci series  10 number using recursion;
        System.out.println(fibonacci(4));

    }
    static int fibonacci(int i){
        if(i<=1){
        return i;
        }
        // System.out.println(i);
        return fibonacci(i-1)+fibonacci(i-2);
    }
}
