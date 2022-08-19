package com.company.files;
import java.io.FileNotFoundException;
import java.lang.*;
import java.util.*;
import java.io.File;
public class Task1 {
    public static void main(String[] args) {
        String date = "dataset_91069.txt";
        long[] date1 = new long[68];
        int[] date2 = new int[67];
        File file = new File(date);
        int temp = 0;
        try (Scanner scanner = new Scanner((file))) {
            String a;
            long max = 0;
            for (int i = 0; i < date1.length; i++) {
                while (scanner.hasNext()) {
                    a = scanner.nextLine();
                    String c;
                    c = a.replaceAll("[^\\d]", " ");
                    if (c.equals("               ")) {
                        continue;
                    } else {
                        String num = c.replaceAll("[^\\d]", "");
                        String h = num.substring(4, 14);
                        String j = num.substring(0, 4);
                        long k = Long.parseLong(h);
                        int m = Integer.parseInt(j);

                        date1[i] = k;
                        date2[i] = m;
                        break;
                    }

                }
            }

            for (int kum = 0; kum < date1.length - 1; kum++) {
                if (max < date1[kum + 1] - date1[kum]) {
                    max = date1[kum + 1] - date1[kum];
                    if(temp < date2[kum]){
                        temp = date2[kum];
                    }

                }

            }
            System.out.println(temp+1);

        }catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(("No file found " + date));
        }
    }
}
