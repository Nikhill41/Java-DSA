public class searchInStrings {
    public static void main(String[] args) {
        String name="Nikhil";
        char target='l';
        System.out.println(searchchar( name, target));

    }
    static int searchchar(String name, char target){
        for(int i=0;i<name.length();i++){
                if(name.charAt(i)==target){
                    return i;
                }
            } 
            return -1;
    }
}
