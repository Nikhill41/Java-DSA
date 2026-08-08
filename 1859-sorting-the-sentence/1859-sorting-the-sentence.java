class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" "); 
        String[] res=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int ind = arr[i].charAt(arr[i].length() - 1) - '1';
            res[ind] = arr[i].substring(0, arr[i].length() - 1);
        }
       
        return String.join(" ",res);
    }
}