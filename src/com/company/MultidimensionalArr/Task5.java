package com.company.MultidimensionalArr;

import java.util.Scanner;

public class Task5 {
    /*Given the number n, not greater than 100, create a matrix of size n×n and fill it using the following rule. Numbers 0 should be stored on the primary (main) diagonal.
     The two diagonals, adjacent to the primary one, should contain numbers 1. The next two diagonals should contain numbers 2; etc.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n++;
        int[][] arr = new int[n][n];
        int zero = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = zero;
                zero++;
            }
            zero = i + 1;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                arr[i + 1][j + 1] = arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
