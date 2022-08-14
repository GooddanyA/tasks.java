package com.company.for_loop;
import java.util.Scanner;
/*Find the sum of numbers divisible by 6 in the given sequence of natural numbers.
The first line of the input is the number of elements in the sequence; the next lines are the elements themselves.
It is guaranteed that there is always a number divisible by 6 in the sequence.*/

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < b; i++) {
            int a = scanner.nextInt();
            if (a % 6 == 0) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
