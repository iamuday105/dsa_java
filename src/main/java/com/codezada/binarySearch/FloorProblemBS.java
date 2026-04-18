package com.codezada.binarySearch;

public class FloorProblemBS {
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

        return end;
    }
}


// If dublicates exits then solution =================>>>>>>>>>>>

//class Solution {
//    public int findFloor(int[] arr, int x) {
//        // code here
//        int start = 0;
//        int end = arr.length-1;
//
//        if(x<arr[start]){
//            return -1;
//        }
//
//        int ans = -1;
//
//        while(start<=end){
//            int mid = start + (end-start)/2;
//
//            if(arr[mid] == x){
//                ans = mid;
//                start = mid +1;
//            }
//            else if(x > arr[mid]){
//                ans = mid;
//                start = mid+1;
//            }else{
//                end = mid-1;
//            }
//        }
//
//
//        return ans;
//    }
//}
