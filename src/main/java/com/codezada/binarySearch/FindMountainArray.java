package com.codezada.binarySearch;

public class FindMountainArray {


    public static void main(String[] args) {
        int[] arr = {2,4,5,6,10,12,8,7,4,1};

        int ans = find(arr);
        System.out.println(ans);
    }

    static int find(int[] arr){
        int start=0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else if (arr[mid] < arr[mid+1]) {
                start = mid + 1;
            }
        }
        return start;
    }

}
