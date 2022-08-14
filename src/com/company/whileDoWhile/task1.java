package com.company.whileDoWhile;
import java.util.Scanner;
/*You are given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
 As input, the program gets the number of elements in the sequence, and then the elements themselves.
 In the sequence, there is always an element divisible by 4.
 The number of elements does not exceed 1000. The program should print a single number: the maximum element of the sequence divisible by 4.*/
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int max = 0;
        int count = 1;
        while (count < a) {
            int b = scanner.nextInt();
            if (b % 4 == 0 && b > max) {
                max = b;
            }
            count++;
        }
        System.out.println(max);
    }
}
