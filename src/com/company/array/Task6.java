package com.company.array;

import java.util.Scanner;

public class Task6 {
/*Write a program that reads an array of ints and outputs the number of "triples" in the array.
A "triple" is three consecutive ints in increasing order differing by 1 (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not).
Triples may overlap. For example, the sequence 1, 2, 3, 4, 5 contains three triples: 1, 2, 3; 2, 3, 4; and 3, 4, 5.*/
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int len = scanner.nextInt();
    int[] array = new int[len];
    for (int i = 0; i < len; i++) {
        array[i] = scanner.nextInt();

    }
    int count = 0;
    for (int i = 0; i < array.length - 2; i++) {
        if (array[i + 2] - array[i + 1] == 1 && array[i + 1] - array[i] == 1) {
            count++;
        }

    }
    System.out.println(count);
}
}
