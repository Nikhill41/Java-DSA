import java.util.*;
public class leetcode344 {
    public static void main(String[] args) {
        char[] chara=new char[]{'h','e','l','l','e','h'};
        int i=0;
        int j=chara.length-1;
        while(i<j){
            char temp=chara[i];
            chara[i]=chara[j];
            chara[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(chara));
    }
}
