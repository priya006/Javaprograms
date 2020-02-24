package learnings.interfaceconcepts.examples;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        String[][] twoDArray = {{"A", "B", "C"}, {"d", "E", "F"}};

        //twoDArray[2][3] - print

        for (int row = 0; row < 2; row++) {

            for (int col = 0; col < 3; col++) {

                System.out.println(twoDArray[row][col].toLowerCase());
            }
        }

    }



}
