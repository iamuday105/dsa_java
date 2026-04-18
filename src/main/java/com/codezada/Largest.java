package com.codezada;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        int max= a;
//        if(a>b){
//            max = a;
//        }else{
//            max=b;
//        }
//
//        if(c>max){
//            max = c;
//        }
//
//        System.out.println("Max number is :"+ max);

        int max= Math.max(c,Math.max(a,b));

        System.out.println("Max number is :"+ max);

    }
}
