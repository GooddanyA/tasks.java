package com.company.for_loop;

import java.util.Scanner;

/*Print the sum of all integers from a to b including both.
It is guaranteed that a < b in all test cases.*/

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
