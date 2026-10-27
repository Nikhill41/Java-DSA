class Solution {
    public String defangIPaddr(String address) {
        StringBuilder s=new StringBuilder();
        int i=0;
        int l=address.length();
        while(i<l){
            if(address.charAt(i)=='.'){
                s.append('[');
                s.append('.');
                s.append(']');
            }else{
                s.append(address.charAt(i));
            }
            i++;
        }
        return s.toString();
    }
}