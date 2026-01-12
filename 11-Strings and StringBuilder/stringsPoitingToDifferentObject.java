public class stringsPoitingToDifferentObject {
    public static void main(String[] args) {
        String str1 = new String("nikhil");
        String str2 = new String("nikhil");

        if (str1 == str2) {
            System.out.println("str1 and str2 point to the same object in memory.");
        } else {
            System.out.println("str1 and str2 point to different objects in memory.");
        }
    }
}