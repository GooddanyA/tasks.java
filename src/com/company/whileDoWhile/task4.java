package com.company.whileDoWhile;
/*For its input, the program gets a sequence of non-negative integers; each integer is written in a separate line.
The sequence ends with an integer 0; when the program reads 0,
it should end its work and output the length of the sequence (not counting the final 0).
*/
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (scanner.nextInt() != 0) {
            a++;
        }
        System.out.println(a);
    }
}
