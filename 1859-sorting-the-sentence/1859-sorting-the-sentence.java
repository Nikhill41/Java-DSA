class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" "); 
        String[] res=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int ind = arr[i].charAt(arr[i].length() - 1) - '1';
            res[ind] = arr[i].substring(0, arr[i].length() - 1);
        }
        System.out.println(Arrays.toString(res));
        StringBuilder st=new StringBuilder();
        for(int i=0;i<res.length;i++){
            st.append(res[i]);
            if(i<res.length-1){st.append(" ");
            }
        }
        return st.toString();
    }
}