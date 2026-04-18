package com.codezada.binarySearch;

import java.util.Arrays;

public class SearchB {
    public static void main(String[] args) {
      int[] nums = {5,7,7,8,8,8,10};
       int target = 8;

       int[] ans = {-1,-1};

       Boolean firstIndex = true;

       ans[0] = find(nums,target,true);
       ans[1] = find(nums,target,false);

        System.out.println(Arrays.toString(ans));

    }

    static int find(int[] nums, int target, Boolean firstIndex){
       int start =0;
       int end = nums.length -1;
       int ans = -1;
       while(start <= end){
           int mid = start + (end - start)/2;

          if (nums[mid] == target){
              ans = mid;
              if(firstIndex){
                  end = mid -1;
              }else{
                  start = mid + 1;
              }

          } else if (target > nums[mid]) {
              start = mid + 1;

          }else {
              end = mid -1;
          }
       }
       return ans;

    }


}
