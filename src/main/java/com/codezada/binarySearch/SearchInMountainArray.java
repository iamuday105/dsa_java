package com.codezada.binarySearch;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = findPeak(arr);
        int ans = find(arr, target,0,peak);

        if(ans != -1){
            System.out.println(ans);
        }else{
            ans = find(arr, target,peak+1,arr.length-1);

            System.out.println(ans);
        }

    }

    static int findPeak(int[] arr){
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

    static int find(int[] arr, int target, int start, int end){

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
