package learnings.interfaceconcepts.examples;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        //Write an application that asks the user to enter the number '5' and loops over and over until '5' is entered.

        int userInput = 0;

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);


        while (userInput != 5) {

            userInput = input.nextInt();

        }

        System.out.println("Got it");
    }
}
