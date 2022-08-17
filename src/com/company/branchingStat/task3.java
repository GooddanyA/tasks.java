package com.company.branchingStat;

import java.util.Scanner;

public class task3 {
    /*Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as many times, to what it equals to).
    The input to the program is a positive integer n: the number of the elements of the sequence the program should print.
    Output the sequence of numbers, written in a single line, space-separated.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= a; i++) {
            if (counter == a) {
                break;
            }

            for (int j = 1; j <= i; j++) {
                if (counter == a) {
                    break;
                }

                System.out.print(i + " ");
                counter++;
            }
        }
    }
}
