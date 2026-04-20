package com.codezada.binarySearch;

public class RBS {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
       int target = 2;
     int pivote = pivoteIndex(arr);

//        System.out.println("pivote"+ pivote);

        if (pivote == -1) {
            System.out.println(find(arr, target, 0, arr.length - 1));
            return;
        }

     int ans1 = find(arr,target, 0, pivote );

     if(ans1== -1){
         int ans2 = find(arr,target,pivote+1, arr.length-1);

         System.out.println(ans2);
     }else {
         System.out.println(ans1);
     }


    }

    static int pivoteIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if( mid < arr.length - 1 && arr[mid]> arr[mid+1]){
                return mid;
            }
            if(mid > 0 && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    static int find(int[] arr, int target ,int start, int end){

//        int start = 0;
//        int end = arr.length - 1;

        if(start > end){
            return -1;
        }

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
