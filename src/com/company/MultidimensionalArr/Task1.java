package com.company.MultidimensionalArr;

import java.util.Scanner;

public class Task1 {
    /*Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise,
     by recording the result into the new array m×n in size.*/
    public static  void printRectangleArray(int[][] a) {
        for (int[] row : a) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateRectangleArray(int[][] a, int n, int m) {
        int[][] rotatedArray = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                rotatedArray[i][(n - 1) - j] = a[j][i];
            }
        }
        return rotatedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        printRectangleArray(rotateRectangleArray(a, n, m));
    }
}
