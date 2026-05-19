package com.codezada.homework.firstjava;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
//        1.write a program to print whether a number is even or odd, also take input from the user.

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if(num%2 == 0){
//            System.out.println("Even number");
//        }else {
//            System.out.println("Odd number");
//        }


//        2.Take name as input and print a greeting message for that particular name.

//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//
//        System.out.println("Hello "+ name + " Welcome to codezada!");

//        3.Write a program to input principle, time, and rate (P,T,R) from the user and find simple interest.

//        Scanner sc = new Scanner(System.in);
//        int P = sc.nextInt();
//        int R = sc.nextInt();
//        int T = sc.nextInt();
//
//
//        int SI = (P*R*T)/100;
//
//        System.out.println("SI " + SI);

//        4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions).

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        System.out.println("Enter operator");
//        char op = sc.next().trim().charAt(0);
//
//        int ans=0;
//
//      if(op == '+'){
//          ans = num1 + num2;
//      }
//      if(op == '-'){
//            ans = num1 - num2;
//      }
//      if(op == '*'){
//            ans = num1 * num2;
//      }
//      if(op == '/'){
//            ans = num1 / num2;
//      }
//
//        System.out.println("ans is: "+ ans);


//        6.Input currency in rupees and output in USD.

//         Scanner sc = new Scanner(System.in);
//         double rupees = sc.nextDouble();
//
//        System.out.println(rupees * 95.97);

//        7.To calculate Fibonacci Series up to n numbers.

//        0 1 1 2 3 5 8 13 21
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int a=0;
//        int b=1;
//        int i = 2;
//
//        while(i<=n){
//           int temp = b;
//           b = a+ b;
//           a = temp;
//
//           i++;
//
//        }
//        System.out.println("nth fibonacci no:"+ b);


//       8. To find out whether the given String is Palindrome or not.
//
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//
////        reverse a string
//        String reverseString= "";
//
//        for(int i=s.length()-1; i>=0;i--){
////            System.out.print(s.charAt(i));
//            reverseString += s.charAt(i);
//
//
//
//        }
//
//        System.out.println("Reversed String: " + reverseString);
//
//
//        System.out.println(s.compareTo(reverseString) == 0);

//        9.To find Armstrong Number between two given number.

//            Scanner sc = new Scanner(System.in);
//            int num = sc.nextInt();
//
//            int original = num ;
//            int sum = 0;
//
//            while (num>0){
//                int digit = num%10;
//
//                sum = sum + (digit * digit * digit);
//
//                num = num/10;
//            }
//
//            if(original == sum){
//                System.out.println("Armstrong number");
//            }else {
//                System.out.println("Not an Armstrong number");
//            }





//        10.count digit in a number;

//        int num = 123435363;
//        int count = 0;
//        while(num>0){
//            int digit = num % 10 ;
//
//            if(digit == 3){
//                count++;
//            }
//             num = num/10;
//        }
//        System.out.println(count);

//        11.Reverse a number

//        int num = 12345;
//
//       int reverse = 0;
//        while(num >0){
//            int rem = num %10;
//
//            reverse = reverse * 10 + rem;
//
//            num = num/10;
//        }
//
//        System.out.println(reverse);



    }

}
