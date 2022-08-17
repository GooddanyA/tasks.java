package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    /*A right rotation is an operation that shifts each element of an array to the right. For example, if an array is {1,2,3,4,5} and we right rotate it by 1,
    the new array will be {5,1,2,3,4}.
    If we rotate it by 2, the new array will be {4,5,1,2,3}. It goes like this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.*/
    private static void rotate(int[] arr, int steps) {
        int[] elementsToRotate = arr.clone();
        int step = steps % arr.length;

        for (int j = 0; j < elementsToRotate.length; j++) {
            if (j + step >= elementsToRotate.length) {
                arr[step + j - elementsToRotate.length] = elementsToRotate[j];
            } else {
                arr[j + step] = elementsToRotate[j];
            }
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
