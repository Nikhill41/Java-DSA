class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder st=new StringBuilder(s);
        while(i<j){
            if(isVowel(st.charAt(i))){
                while(i<j ){
                    if(isVowel(st.charAt(j))){
                        char temp=st.charAt(i);
                        st.setCharAt(i,st.charAt(j));
                        st.setCharAt(j,temp);
                        j--;
                        break;
                    }
                    j--;
                }
                
            }
            i++;
            
        }
        return st.toString();
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }else{
            return false;
        }
    }
}