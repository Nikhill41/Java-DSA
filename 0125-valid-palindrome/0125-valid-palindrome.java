class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^0-9a-z]","");
        int st=0;
        int e=s.length()-1;
        while(st<e){
            if(s.charAt(st)!=s.charAt(e)) return false;
            st++;
            e--;
        }
        return true;
    }
}