public class tableOf2 {
    public static void main(String[] args) {
        int a=7;
        table2(a,1);
    }
    static void table2(int i,int multiplier){
        System.out.println(i*multiplier);
        multiplier++;
        if(multiplier==11){
            return;
        }
        table2(i,multiplier);
    }
}
