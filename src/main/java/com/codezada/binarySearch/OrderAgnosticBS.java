package com.codezada.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int[] arr = {48,36,20,14,12,11,9,6,4,2};
        int target = 12;

        int ans = find(arr, target);
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + ans);
        }

    }
    static int find(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        Boolean Asc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(Asc){
                if(target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }

            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}




