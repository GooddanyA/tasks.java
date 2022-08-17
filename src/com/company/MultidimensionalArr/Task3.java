package com.company.MultidimensionalArr;

public class Task3 {
    /*In this task, you need to implement reverseElements method.
    It should reverse all rows of the twoDimArray as in the example below.*/
    public static void reverseElements(int[][] twoDimArray) {
        int temp;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length / 2; j++) {
                temp = twoDimArray[i][twoDimArray[i].length - j - 1];
                twoDimArray[i][twoDimArray[i].length - j - 1] = twoDimArray[i][j];
                twoDimArray[i][j] = temp;
            }
        }
    }
}
