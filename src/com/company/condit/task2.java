package com.company.condit;

import java.util.Scanner;
// Find whether a given year is a leap year.
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        final int four = 4;
        final int fourH = 400;
        final int hundred = 100;
        final int zero = 0;
        int a = sc.nextInt();
        if (a % four == zero && a % hundred != zero || a % fourH == zero) {
            System.out.println("Leap");
        } else {
            System.out.print("Regular");
        }
    }
}
