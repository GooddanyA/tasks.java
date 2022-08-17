package com.company.array;

import java.util.Scanner;

public class Task9 {
    /*Write a program that reads an unsorted array of integers and two numbers n and m.
    The program must check if n and m occur next to each other in the array (in any order).*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == m && array[i + 1] == n) {
                result = true;
                break;
            } else if (array[i] == n && array[i + 1] == m) {
                result = true;
                break;
            } else {
                result = false;
            }

        }
        System.out.println(result);
    }
}

