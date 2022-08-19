package com.company.Random;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    /*Your job is to find the seed between A and B (both inclusive) that produces N pseudorandom numbers from 0 (inclusive) to K (exclusive).
    It should also have the maximum of these N numbers to be the minimum among all maximums of other seeds in this range.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int maxSeed = 0;
        int res;
        int count = 0;
        int minSpeed = (int) Double.POSITIVE_INFINITY;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {

            Random r = new Random(i);
            for (int j = 0; j < n; j++) {
                res = r.nextInt(k);

                if (maxSeed <= res) {
                    maxSeed = res;
                }
            }
            if (minSpeed > maxSeed) {
                minSpeed = maxSeed;
                count = i;
            }
            maxSeed = 0;
        }
        System.out.println(count);
        System.out.println(minSpeed);
    }
}
