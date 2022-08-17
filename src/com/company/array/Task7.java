package com.company.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    /*Write a program that reads an array of ints named a and cyclically shift the elements of the array to the right:
    a[0] goes to the place of a[1],
    a[1] goes to the place of a[2], ..., and the last element goes to the place of a[0]).*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        Integer[] array = new Integer[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();

        }

        List<Integer> list = Arrays.asList(array);
        Collections.rotate(list, 1);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}
