package com.codezada.linearSearch;
import java.lang.String;

public class SearchInString {
    public static void main(String[] args) {
        String str = "udaybhan";

        char target = 'h';

        int ans = find(str, target);

        if(ans == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: "+ ans);
        }

    }

    static int find(String str, char target){
        for(int i=0; i <= str.length()-1;i++){
            if(target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }


}
