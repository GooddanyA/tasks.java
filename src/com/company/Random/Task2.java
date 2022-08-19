package com.company.Random;

import java.util.Random;
import java.util.Scanner;

public class Task2 {/*You are given three numbers: n , a and b.
Your task is to output the sum of the first n random numbers in a range from a to b inclusively.
The seed of the generator should be set as a + b.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Random r = new Random(a + b);
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += r.nextInt(b - a + 1) + a;
        }
        System.out.println(res);
    }
}
