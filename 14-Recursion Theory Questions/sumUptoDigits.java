// package 14-Recursion Theory Questions;

public class sumUptoDigits {
    public static void main(String[] args) {
        System.out.println(sumUptoDigit(5));
    }
    static int sumUptoDigit(int n){
        if(n<=1) return 1;
        return n+sumUptoDigit(n-1);
    }
}
