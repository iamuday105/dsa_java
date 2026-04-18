package com.codezada.binarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,120,150,170,200};
        int target = 10;

        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1; //store new start
            end = end + (end - start + 1) * 2;

            start = temp;
        }


        int ans = binarySearch(arr,target,start,end);

        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target, int start, int end){


        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target > arr[mid]){
                start = mid + 1;

            }else {
                end = mid-1;
            }
        }

        return -1;
    }
}

