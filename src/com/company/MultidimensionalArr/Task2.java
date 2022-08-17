package com.company.MultidimensionalArr;
import java.util.Scanner;
public class Task2 {
    /*The cinema has n rows, each row consists of m seats (n and m do not exceed 20).
    A two-dimensional matrix stores the information on the sold tickets: the number 1 means that the ticket for this place is already sold,
    and the number 0 means that the place is available.
    You want to buy k tickets to neighboring seats in the same row. Find whether it can be done.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int a = 0;
        int b = 0;
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] != 0) {
                    a = 0;
                    b = 0;
                } else {
                    a++;
                    if (a == k) {
                        b = i + 1;
                        break;
                    }
                }
            }
            if (a != k) {
                a = 0;
            }
            if (a == k) {
                break;
            }
        }
        System.out.println(b);
    }
}
