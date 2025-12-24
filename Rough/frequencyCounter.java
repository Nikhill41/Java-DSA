import java.util.*;
public class frequencyCounter{
    public static void main(String[] args) {
        String s="Nikhil";
        s=s.toLowerCase();
        int[] fre=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            // System.out.println(ch);
            fre[ch-'a']++;
        }
        System.out.println(Arrays.toString(fre));
    }
}