public class Overloadingfunction {
    public static void main(String[] args) {
        sum(1,2,5,9);
    }
    ///this cald method or function overloading
    static void sum(int a, int b){
        System.out.println("first function running");
        System.out.println(a+b);
    }
    static void sum(int a,int b,int c){
        System.out.println("second function running");
        System.out.println(a+b+c);
    }
    static void sum(int a,int b, int c, int d){
        System.out.println("third function running");
        System.out.println(a+b+c+d);
    }
}
