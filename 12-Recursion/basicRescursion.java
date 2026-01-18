// package 12-Recursion;
public class basicRescursion {
    public static void main(String[] args) {
        //priting number upto five using recursion
        printNumbers(1);
    }
    static  void printNumbers(int n){
        System.out.println(n);
        if(n==10) {
            return;
        }
        printNumbers(n+1);
        
    }
}
