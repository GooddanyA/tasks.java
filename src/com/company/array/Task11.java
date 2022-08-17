package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    /*There are two boxes on the table. The first box has a size of X1 x Y1 x Z1, and the second box has a size of X2 x Y2 x Z2.
You need to determine whether one of the boxes can be put inside the other. It should go in without sticking out.
You can rotate both boxes as you want.*/
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int [] array = new int[3];
            Integer[] array2 = new Integer[3];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            for (int i = 0; i < array2.length; i++) {
                array2[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            Arrays.sort(array2);
            if (array[0] > array2[0] && array[1] > array2[1] && array[2] > array2[2]) {
                System.out.println("Box 1 > Box 2");
            } else if (array[0] < array2[0] && array[1] < array2[1] && array[2] < array2[2]) {
                System.out.println("Box 1 < Box 2");
            } else {
                System.out.println("Incompatible");
            }
        }
}
