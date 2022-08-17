package com.company.branchingStat;

import java.util.Scanner;

public class task2 {
/*Write a program that inputs a sequence of integer numbers in a loop and calculates their sum under the following conditions:
1) if a new number is 0, the program must stop the loop and output the accumulated sum;
2) if the sum is equal to or exceeds the limit of 1000, the program must also stop reading the numbers and output the value equal to the sum minus 1000.*/
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    for (int i = 0; i >= 0; i++) {
        int a = scanner.nextInt();
        if (a == 0) {
            break;
        }
        sum += a;
        if (sum >= 1000) {
            sum -= 1000;
            break;

        }
    }
    System.out.println(sum);
}

}
