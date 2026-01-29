public class leetcode387 {
    public static void main(String[] args){
        String s="leetcodel";
        System.out.println(nonRepeating(s));
    }
    static int nonRepeating(String s){
          int[] count=new int[256];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]==1){
               return i;
            }
        }
        return -1;
    }
     
}
