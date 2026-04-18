package com.codezada;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String fruit = sc.next();

         switch(fruit){
            case "Orange": System.out.println("Oragne");
                break;
            case "Mango": System.out.println("Mango");
                break;
            default: System.out.println("Not my favourite fruit");
        }
    }
}
