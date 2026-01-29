public class leetcode1342 {
    public static void main(String[] a) {
        System.out.println(steps(23,0));

    }
    static int steps(int n,int stepse){
        if(n==0){
            return stepse;
        }
        if(n%2==0){
            return steps(n/2,stepse+1);
        }
        return steps(n-1,stepse+1);
    }

}
