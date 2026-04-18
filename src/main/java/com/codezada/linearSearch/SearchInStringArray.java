package com.codezada.linearSearch;

public class SearchInStringArray {
    public static void main(String[] args) {
        String[] str = {"uday","kunal", "jay", "rahul", "kishor"};
        String target = "jay";

        int ans = find(str,target);

        if(ans == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: "+ ans);
        }
    }

    static int find(String[] str, String target){
        for(int i=0; i< str.length;i++){
            if(target == str[i]){
                return i;
            }
        }
        return -1;
    }
}
