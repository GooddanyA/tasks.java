package com.company;

import java.util.Scanner;
/*Write a program that reads an array of int's and checks if the array is
 sorted ascending (from smallest to largest number).*/
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        boolean a = true;
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                a = true;
            } else {
                a = false;
                break;
            }
        }
        System.out.println(a);
    }
}
