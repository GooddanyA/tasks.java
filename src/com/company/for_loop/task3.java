package com.company.for_loop;

import java.util.Scanner;

/*Find the number of D, C, B and A grades for the last test on informatics, where n students from a class have successfully passed the test.
The program gets number n as the first line of input and then gets the grades themselves, each on a new line.
The program must output four numbers in a single line: the number of D, C, B, and A grades (in that order),
separated by blank space characters.*/
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;
        for (int i = 0; i <= count; i++) {
            String num = scanner.nextLine();
            if (num.contains("D")) {
                d++;
            }
            if (num.contains("C")) {
                c++;
            }
            if (num.contains("B")) {
                b++;
            }
            if (num.contains("A")) {
                a++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}
