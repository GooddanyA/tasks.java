package com.company.whileDoWhile;

import java.util.Scanner;
/*A user inputs a long positive number m.
You need to find out what is the smallest int number n such that n! > m.*/
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long res = 1;
        int mult = 1;

        while (res <= number) {
            mult++;
            res *= mult;
        }

        System.out.print(mult);
    }
}
