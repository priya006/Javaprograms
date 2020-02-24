package learnings.interfaceconcepts.examples;

import java.util.Scanner;

public class DoWhile {

    static int userInput;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter a number: ");
            if (input.hasNextInt())
            userInput = input.nextInt();
        }

        while (userInput <= 10);
        System.out.println("Integer greater than 10 detected!");


    }
}
