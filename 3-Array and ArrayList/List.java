// package Array and ArrayList;

import java.util.*;

public class List {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(8);
        list.addFirst(5);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(returning(list));
    }
    static ArrayList<Integer> returning(ArrayList<Integer> list){
        Collections.reverse(list);
        return list;
    }
    
}
