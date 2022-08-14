package com.company.whileDoWhile;

import java.util.Scanner;

/*Read an integer number N from the input and print all the squares of positive integers:
less than or equal to N,
in ascending order.
*/
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 1;
        while (b <= a) {
            int f = (int) Math.sqrt(b);
            if (f * f == b) {
                System.out.println(b);
            }
            b++;
        }
    }
}
