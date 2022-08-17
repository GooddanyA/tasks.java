package com.company.array;

import java.util.Scanner;

public class Task3 {
 /*Write a program that reads an array of integers and an integer.
 The program must check if the array contains that number.*/
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     boolean result = false;
     int len = scanner.nextInt();
     int[] array = new int[len];
     for (int i = 0; i < len; i++) {
         array[i] = scanner.nextInt();
     }
     int b = scanner.nextInt();

     for (int i = 0; i < len; i++) {
         if (array[i] == b) {
             result = true;
             break;
         }
     }
     System.out.println(result);
 }

}
