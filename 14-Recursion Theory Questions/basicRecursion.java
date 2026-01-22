// package 14-Recursion Theory Questions;

public class basicRecursion {
    public static void main(String[] args) {
        int a=5;
        printfroma(a);
        printUpto(a);
    }
    static void printfroma(int a){
        if(a==0){
            return;
        }
        System.out.println(a);
        printfroma(a-1);
    }
    static void printUpto(int a){
        if(a==0) return;
        printUpto(a-1);
        System.out.println(a);
    }
 
}
