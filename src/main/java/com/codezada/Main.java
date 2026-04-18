package com.codezada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    Learning patterns ====================>>>>>>>>>>>>>>
//        1)Square pattern
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int col = sc.nextInt();

//        int num = sc.nextInt();
//
//        for(int i=0; i<num;i++){
//            for(int j=0;j<num;j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
//
//      2) Rectangular pattern


//
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        3) Hollow square pattern

//        for(int i=0;i<row;i++){
//            for(int j=0; j<col;j++){
//                if(i==0 || j==0 || i==row-1 || j== col-1){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//        }

//        4) Hollow Rectangular pattern

//        for(int i=0;i<row;i++){
//            for(int j=0; j<col;j++){
//                if(i==0 || j==0 || i==row-1 || j== col-1){
//                    System.out.print("* ");
//                }else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//        }

//        5)Hald Pyramid

//        for(int i=0; i<row;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        6)Inverted Half Pyramid

//        for(int i=0;i<row;i++){
//            for(int j=0;j<row-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//          7)Hollow Half Pyramid

//        for(int i=0; i<row;i++){
//            for(int j=0;j<i+1;j++){
//
//                if(j==0 || i== row-1 || j==i){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//          8) Inverted Hollow Half Pyramid

//        for(int i=0; i<row;i++){
//            for(int j=0;j<row-i;j++){
//                if(j==0 || i==0 || j== row-i-1){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//        9)Numeric half pyramid

//        for(int i=0;i<row;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print(j+1+" ");
//            }
//            System.out.println();
//        }

//        10)Inverted numeric pyramid

//        for(int i=0;i<row;i++){
//            for(int j=0;j<row-i;j++){
//                System.out.print(j+1+" ");
//            }
//            System.out.println();
//        }

//        11)Full Pyramid

//        for(int i=0; i<row;i++){
//            int k=0;
//            for(int j=0; j<(row*2)-1;j++){
//                if(j<row-i-1){
//                    System.out.print("  ");
//                }else{
//                    if(k<2*i+1){
//                        System.out.print("* ");
//                    }else{
//                        System.out.print("  ");
//                    }
//                    k++;
//                }
//            }
//            System.out.println();
//        }

//        12)Inverted full pyramid

        for(int i=0; i<row;i++){
            int k=0;
            for(int j=0; j<(row*2)-1;j++){
                if(j<i+1-1){
                    System.out.print("  ");
                }else{
                    if(k<((row*2)-(2*i+1))){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                    k++;

                }

            }
            System.out.println();
        }


    }

}