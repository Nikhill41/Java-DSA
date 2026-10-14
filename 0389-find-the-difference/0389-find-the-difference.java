class Solution {
    public char findTheDifference(String s, String t) {
       double resS=0;
       double resT=0;
       int i=0;
       while(i<s.length()){
            resS+=s.charAt(i);
            resT+=t.charAt(i);
            i++;
       }
        resT+=t.charAt(i);
        return (char)(resT-resS);

    }
}