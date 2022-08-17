package com.company.array;

import java.util.Scanner;

public class Task10 {
    /*In some country, there are N companies, and the law of that country says that the taxes of each company are individual and appointed by the president.
    The president wants to know which company pays the most taxes.
    But sadly, none of the president's proxies know math very well, so this work is transferred to you.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] income = new int[n];
        int max = 0;
        int company = 0;

        for (int i = 0; i < n; i++) {
            income[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int tax = income[i] * scanner.nextInt();
            if (tax > max) {
                max = tax;
                company = i + 1;
            }
        }
        System.out.println(company);
    }
}
