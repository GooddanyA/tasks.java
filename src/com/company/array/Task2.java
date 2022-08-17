package com.company.array;

import java.util.Scanner;
/*Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order.
Elements of the sequence must go one after another.
A single number is assumed to be an ordered sequence with the length = 1.*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();

        }
        int count = 1;
        int max = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array [i] < array [i + 1]) {
                count++;
            }
            else if (array[i] > array[i + 1]){
                count = 1;
            }

            if (max < count) {
                max = count;
            }
        }


        System.out.println(max);
    }
}
