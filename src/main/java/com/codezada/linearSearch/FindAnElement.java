package com.codezada.linearSearch;

public class FindAnElement {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};
        int target = 14;

        int ans = find(arr,target);

        if(ans == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: "+ ans);
        }

    }

    static int find(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
