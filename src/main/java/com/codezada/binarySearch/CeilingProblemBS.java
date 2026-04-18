package com.codezada.binarySearch;

public class CeilingProblemBS {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;

      int ans = find(arr,target);

        System.out.println(ans);

    }

    static int find(int[] arr, int target){

        int start=0;
        int end = arr.length-1;

        if(target > arr[end]){
            return -1;
        }

        while(start<=end){
            int mid = start + (end- start)/2;

            if(arr[mid] == target){
                return mid;
            } else if (target > arr[mid]) {
                start = mid +1;

            }else{
                end = mid-1;
            }

        }

        return start;
    }


}
