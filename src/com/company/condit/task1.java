package com.company.condit;

import java.util.Scanner;
/* think of chocolate as an N x M rectangle divided into little segments: N segments in length and M in width.
Each segment is 1x1 and unbreakable.
Find out whether it is possible to break off exactly K segments from the chocolate with a single straight line: vertical or horizontal.*/
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if (n * m > k) {
            if (k % n == 0 || k % m == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
