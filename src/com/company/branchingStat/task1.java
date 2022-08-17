package com.company.branchingStat;

import java.util.Scanner;

public class task1 {
    /*A bus tour of Europe has been very successful.
    Due to an increase in the number of people who want to go on a tour, the tour company decided to increase the height of the bus.
    The new height of the bus is exactly N centimeters. But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these bridges.
    Can you find out if this will happen?*/
    static String successMessage = "Will not crash";
    static String failMessage = "Will crash on bridge %s";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var busHeight = scanner.nextInt();
        var bridgesCount = scanner.nextInt();
        var currentBridge = 1;
        var bridgeFailed = 0;

        while (currentBridge < bridgesCount) {
            if (busHeight >= scanner.nextInt()) {
                bridgeFailed = currentBridge;
                break;
            }
            currentBridge++;
        }

        System.out.println(bridgeFailed == 0 ? successMessage : String.format(failMessage, bridgeFailed));
    }
}
