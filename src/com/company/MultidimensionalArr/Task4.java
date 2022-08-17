package com.company.MultidimensionalArr;

import java.util.Scanner;

public class Task4 {
    /*Your task is to draw a star on the n×n field using the symbols .
 and *. n is odd and doesn't exceed 15.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] arr = new String[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || j + 1 == Math.round(n / 2.0) || i + 1 == Math.round(n / 2.0) || i + j == n - 1) {
                    arr[i][j] = "* ";
                    System.out.print(arr[i][j]);
                } else {
                    arr[i][j] = ".";
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
