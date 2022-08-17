package com.company.for_loop;

import java.util.Scanner;

public class task4 {
    /*Write a program that reads two numbers a and b
   from the keyboard and calculates and outputs to the console the
   arithmetic average of all numbers from the interval [a; b]
   [a;b],which are divisible by 3.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double average = 0;
        int count = 0;
        for (; a <= b; a++) {
            if (a % 3 == 0) {
                average += a;
                count++;
            }
        }
        average = average / count;
        System.out.println(average);
    }
}
