package learnings.interfaceconcepts.examples;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Lexicograohically {

    public static void main(String[] args) {
        // String smallest = "";
        //  String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        SortedSet<String> sets = new TreeSet();

        for (int startIndex = 0, endIndex = 3; startIndex <= 11 && endIndex <= 12; startIndex++, endIndex++) {


            String output = s.substring(startIndex, endIndex);

            sets.add(output);

        }
        System.out.println(sets.first());
        System.out.println(sets.last());
    }
}


