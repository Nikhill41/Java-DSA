import java.util.*;
public class leetcode1930{
    public static void main(String[] args){
        Solution count=new Solution();
        System.out.println(count.countPalindromicSubsequence("1234567"));

    }
}
class Solution {
    public int countPalindromicSubsequence(String s) {
        if(s.length()==3){
            String st=new StringBuilder(s).reverse().toString();
            if(s.equals(st)){return 1;}
            else{return 0;}
        }
        Set<String> set=new HashSet<>();
        for(int i=0;i<s.length()-2;i++){
            for(int j=i+1;j<s.length();j++){
                for(int k=j+1;k<s.length();k++){
                    String str1=""+s.charAt(i)+s.charAt(j)+s.charAt(k);
                    System.out.println(str1);
                    String str2=new StringBuilder(str1).reverse().toString();
                    // System.out.println(str2);
                    if(str1.equals(str2)){
                    set.add(str1);
                    }
                 }
            }
        }
    System.out.println(set);
    return set.size();
    }
}