package com.codezada;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 455337353;
         int count =0;
        while(n>0){
            int rem = n%10;
            if(rem == num){
                count++;
            }

            n = n/10;
        }
        System.out.println(count);

    }
}
