package com.company.algoritmsHakerRank;
import java.io.*;
public class UpperOrDown {


    static class Result {

        /*
         * Complete the 'countingValleys' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER steps
         *  2. STRING path
         */

        public static int countingValleys(int steps, String path) {
            if (path.length() == steps) {
                int countSteps = 0;
                int temp = 0;
                String[] pathArray = path.split("");
                for (String s : pathArray) {
                    if (s.equals("U")) {
                        temp++;
                    } else if (s.equals("D")) {
                        temp--;
                    }
                    if (temp == -1 && s.equals("D")) {
                        countSteps++;
                    }
                }
                return countSteps;

            } else {
                return 0;
            }

        }

    }

     static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int steps = Integer.parseInt(bufferedReader.readLine().trim());

            String path = bufferedReader.readLine();

            int result = Result.countingValleys(steps, path);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
