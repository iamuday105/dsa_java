package com.codezada.Arrays;


import java.util.Arrays;

import static com.codezada.Arrays.Swap.swap;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {1,3,34,56,78,90};

        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

}
