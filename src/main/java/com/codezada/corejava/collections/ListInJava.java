package com.codezada.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {
    public static void main(String[] args) {
//        int[] arr = new int[10];

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(80);

        System.out.println(list.get(1));
        System.out.println(list.size());

//        for(int i=0; i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        list.remove(1);

        list.add(1,50);

        list.set(1,90);

        for(int n : list){
            System.out.println(n);
        }

        System.out.println(list);

        System.out.println(list.contains(5));
    }
}
