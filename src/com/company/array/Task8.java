package com.company.array;

import java.util.Scanner;

public class Task8 {
/*Write a program that reads an array of ints and
finds the index of the first maximum in that array.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > a) {
                a = array[i];
            }
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] == a) {
                System.out.println(i);
                break;
            }
        }
    }
}
