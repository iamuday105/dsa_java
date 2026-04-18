package com.codezada.linearSearch;

//public class SumOfDuplicates {
//    public static void main(String[] args) {
//        int[] arr = {12,23,45,67,9,9,9,14};
//        int sum = 0;
//
//      for(int i=0;i<arr.length;i++) {
//         for(int j=0; j<i;j++){
//             if(arr[i] ==  arr[j]){
//                 sum = sum + arr[i];
//                 break;
//             }
//         }
//      }
//        System.out.println(sum);
//    }
//}


//public class SumOfDuplicates {
//    public static void main(String[] args) {
//        int[] arr = {12,9,23,45,67,9,9,9,9,14};
//        int sum = 0;
//
//        for(int i = 0; i < arr.length; i++) {
//
//            boolean isFirst = true;
//
//            // check if this is first occurrence
//            for(int j = 0; j < i; j++){
//                if(arr[i] == arr[j]){
//                    isFirst = false;
//                    break;
//                }
//            }
//
//            if(isFirst){
//                int count = 0;
//
//                // count full frequency
//                for(int j = 0; j < arr.length; j++){
//                    if(arr[i] == arr[j]){
//                        count++;
//                    }
//                }
//
//                if(count > 1){
//                    sum += arr[i] * count;
//                }
//            }
//        }
//
//        System.out.println(sum);
//    }
//}


import java.util.HashSet;

public class SumOfDuplicates {
    public static void main(String[] args) {
        int[] arr = {12,23,45,67,9,9,14};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(int num : arr){
            if(!seen.add(num)){
                duplicate.add(num);
            }
        }

        int sum = 0;
        for(int num : duplicate){
            sum += num;
        }

        System.out.println(sum);
    }
}