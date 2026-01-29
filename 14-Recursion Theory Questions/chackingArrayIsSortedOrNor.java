public class chackingArrayIsSortedOrNor {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,5,8};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr,int index){
        if(index==arr.length-1){
        return true;
        }
        return index<arr.length-1 && arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
