package com.company.Random;

import java.util.Random;
import java.util.Scanner;

public class Task1 {/*For the given numbers K, N, and M find the first seed that is greater than or
 equal to K where each of N Gaussian numbers is less than or equal to M.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        boolean stillSearching = true;
        do {
            Random random = new Random(k);
            for (int i = 1; i <= n; i++) {
                double randomNumber = random.nextGaussian();
                if (randomNumber > m) {
                    k++;
                    break;
                }
                if (i == n) {
                    stillSearching = false;
                }
            }
        } while (stillSearching);
        System.out.println(k);
    }
}
