class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] fre1=new int[26];
        int[] fre2=new int[26];

        for(int i=0;i<s.length();i++){
            fre1[s.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(fre1));
        for(int i=0;i<t.length();i++){
            fre2[t.charAt(i)-'a']++;
        }
        System.out.print(Arrays.toString(fre2));

        for(int i=0;i<26;i++){
            if(fre1[i]!=fre2[i]) return false;
        }
        return true;
    }
}