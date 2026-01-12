import java.util.*;
public class MultiVariableArguements {
    //it means we can pass infinite values init
    public static void main(String[] args) {
        fun(2,3,54,5,6,5,6,8,8,87,7,5,5,6,8,88,6,56,6,6,6,6,6,7,7,5,4,45,7,7,65,5,67,77,7);
        
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    
}
