package com.codezada.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Scanner str = new Scanner(System.in);
//        Syntax
//        datatype[] variable_name = new dattype[size];
//        int[] arr1 = new int[5];
//        int[] arr = {12,34,55,66,34,22,33};

//        arr1[0] = 23;
//        arr1[1] =34;
//        arr1[2] =78;

//        for(int i=0;i<arr1.length;i++){
//            arr1[i] = sc.nextInt();
//        }
//
//        for(int num : arr1){
//            System.out.print(num + " ");
//        }
//
//        System.out.println(Arrays.toString(arr1));


//        String[] str1 = new String[5];
//
//        for(int i=0;i<str1.length;i++){
//            str1[i] = str.next();
//       }
//
//        System.out.println(Arrays.toString(str1));


//        2D array

//        23, 45, 12, 17,
//        67, 56, 34, 23,
//        90, 89, 67, 56


        int[][] arr = new int[3][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

//        System.out.println(Arrays.toString(arr));


//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


//        for(int[] row : arr){
//            for(int element: row){
//                System.out.print(element + " ");
//            }
//            System.out.println();
//        }

//        for(int[] a : arr){
//            System.out.println(Arrays.toString(a));
//        }

        }
    }


