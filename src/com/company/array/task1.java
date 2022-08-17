package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
/*Implement a method for sorting a given array of integers in the ascending order.*/
    public static void sort(int[] numbers) {
        Arrays.sort(numbers);
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}
