package com.company.method;

import java.util.Scanner;

public class Task1 {
/*Implement a method that checks whether a given English letter is a vowel or not.
The input may be in any case.*/
    public static boolean isVowel(char ch) {
        return "aoueiAOUEI".contains(String.valueOf(ch));
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
