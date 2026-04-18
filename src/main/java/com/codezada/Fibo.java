package com.codezada;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth number :");
        int n= sc.nextInt();
        int p = 0;
        int i= 1;
        int count = 2;

        while(count<=n){

            int temp = i;
            i= p+i;
            p= temp;

            count++;
        }
        System.out.println("nth fibonacci no:"+ i);
    }
}
