package com.company.whileDoWhile;

import java.util.Scanner;
/* Given natural number n not exceeding 1_000_000, generate a sequence of integers, described in the Collatz conjecture:
If n is an even number, divide it in half; if it is odd, multiply it by 3 and add 1.
Repeat this operation until we get the number 1 as a result.
For example, if the number n = 17, then the sequence looks as the following:
 */
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print(a + " ");
        while (a != 1) {
            if (a % 2 == 0) {
                a = a / 2;
            } else {
                a = a * 3 + 1;
            }
            System.out.print(a + " ");
        }
    }
}
