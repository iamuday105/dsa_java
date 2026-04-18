package com.codezada;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(4343,34,3,5,34,43,43,43,4,3,4,3,4,34,3);
        multiple(34, 56, "uday" , "rahul","jay");
    }

    static void multiple(int a, int b, String ...d){
        System.out.println((a*b) + Arrays.toString(d));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
