package com.codezada;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 878687;
        int reverseNumber=0;
        while(n>0){
            int rem = n%10;
            reverseNumber = (reverseNumber*10) + rem;

            n=n/10;

        }
        System.out.println(reverseNumber);
    }
}
