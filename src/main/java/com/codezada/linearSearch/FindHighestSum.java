package com.codezada.linearSearch;

import java.util.ArrayList;

public class FindHighestSum {
    public static void main(String[] args) {
       int[][] accounts = {{1,5},{7,3},{3,5}};

        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<accounts.length;i++){
            int sum =0;
            for(int j=0; j<accounts[i].length;j++){
                sum = accounts[i][j] + sum;
            }
            list.add(sum);

        }

        for(int i=0;i<list.size();i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        System.out.println(max);
    }
}


//1295. Find Numbers with Even Number of Digits

//class Solution {
//    public int findNumbers(int[] nums) {
//
//        int count=0;
//
//        for(int n : nums){
//            int digitCount = 0;
//            while(n>0){
//                n = n/10;
//                digitCount++;
//            }
//            if(digitCount%2 == 0){
//                count++;
//            }
//
//        }
//        return count;
//
//    }
//}
