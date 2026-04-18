package com.codezada.linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {89,90,23,12,98}
        };

        int target = 98;

        int[] ans1 = find(arr, target);
        System.out.println(Arrays.toString(ans1));
    }

    static int[] find(int[][] arr, int target){
        int[] ans = new int[2];
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    ans[0] = i;
                    ans[1] = j;

                    return ans;
                }
            }
        }
        ans[0]=-1;
        ans[1]=-1;
        return  ans;
    }
}
