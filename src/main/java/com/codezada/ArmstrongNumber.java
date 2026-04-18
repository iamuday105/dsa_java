package com.codezada;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int original = num; // store original number
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}