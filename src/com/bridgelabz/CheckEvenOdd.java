package com.bridgelabz;

import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to check even or odd : ");
            int num = sc.nextInt();
            if (num % 2 == 0){
                System.out.println(num + " : is an even number");
            }
            else {
                System.out.println(num + " : is an odd number");
            }
    }
}
