class Solution {
    public String reverseWords(String s) {
        if(s.length()==0) return "";
        StringBuilder st=new StringBuilder(s);
        int start=0;
        int end=0;
        for(int i=0;i<=s.length();i++){
            if( i==s.length() || st.charAt(i)==' '){
                end=i-1;
                int left=start,right=end;
                while(left<right){
                    char temp=st.charAt(left);
                    st.setCharAt(left,st.charAt(right));
                    st.setCharAt(right,temp);
                    left++;
                    right--;
                }
                start=i+1;
            }

        }
        return st.toString();
        
    }
}