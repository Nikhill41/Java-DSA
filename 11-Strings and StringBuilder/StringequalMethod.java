public class StringequalMethod {
    public static void main(String[] args) {
        String str1 = new String("nikhil");
        String str2 = new String("nikhil");

        if (str1.equals(str2)) {
            System.out.println("str1 and str2 have the same content.");
        } else {
            System.out.println("str1 and str2 have different content.");
        }
    }
}
