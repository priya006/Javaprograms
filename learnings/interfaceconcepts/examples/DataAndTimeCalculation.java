package learnings.interfaceconcepts.examples;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DataAndTimeCalculation {

    /*
         * Complete the 'findDay' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER month
         *  2. INTEGER day
         *  3. INTEGER year
         */
    public static String findDay(int year, int month, int day) {

        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        String dayofweek = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US);

        return dayofweek;

    }

}


class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("outputfile21.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int year = Integer.parseInt(firstMultipleInput[0]);

        int month = Integer.parseInt(firstMultipleInput[1]);

        int day = Integer.parseInt(firstMultipleInput[2]);

        String res = DataAndTimeCalculation.findDay(year, month, day);

        bufferedWriter.write(res);


        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}