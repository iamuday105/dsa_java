package com.codezada.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
//        syntax
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(12);
//        list.add(45);
//        list.add(78);
//        System.out.println(list.contains(12));
//
//        System.out.println(list);

//        MultiDimention ArrayList

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<3 ; i++){
            list.add(new ArrayList<>());
        }

        for(int i =0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);


    }
}
