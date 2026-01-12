import java.util.Arrays;

public class StringBuilderOperations {
        public static void main(String[] args) {
            StringBuilder str=new StringBuilder();
            for(int i = 65; i < 97; i++) {
                str.append((char)(i));//it append in str every character
            }
            System.out.println(str.toString());
            StringBuilder str1=new StringBuilder("Nikhil");
            str1.deleteCharAt(0);
            System.out.println(str1.toString());
            str1.delete(2, 4);
            System.out.println(str1.toString());
            String stri="jhbsefsfrg,g,egerg,erh,eh,eegbeger,he,heghreh,herhh";
            String[] strings=stri.split(",");//split only can apply on the string and store the only in array because it return only the array
            System.out.println(Arrays.toString(strings));
        }
    }
