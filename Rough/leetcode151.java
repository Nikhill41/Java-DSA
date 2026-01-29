public class leetcode151 {
    public static void main(String[] args) {
     String s="hello world";
        System.out.println(reverseWords(s));
    }
    
    static String reverseWords(String s) {
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' || i==0){
                int j=i;
                while(j<=s.length()-1 && (i!=j && s.charAt(j)!=' ') ){

                    str=str+(s.charAt(j));
                    j++;
                    // if(s.charAt(j)==' '){
                    //     break;
                    // }
                }
            }
        }
        return str;
    
}
}
