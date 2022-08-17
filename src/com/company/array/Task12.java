package com.company.array;

import java.util.Scanner;

public class Task12 {
    /*Write a program that reads an array of ints and outputs the maximum
     product of two adjacent elements in the given array of non-negative numbers.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int count = array[i] * array[i + 1];
            if (max < count) {
                max = count;
            }
        }
        System.out.println(max);
    }
}
