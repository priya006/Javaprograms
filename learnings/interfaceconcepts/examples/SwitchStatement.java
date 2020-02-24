package learnings.interfaceconcepts.examples;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {


        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (input.hasNext()) {
            switch (userInput) {
                case 1:
                    System.out.println("Got 1");
                    break;

                case 66:
                    System.out.println("Got 66");
                    break;

                default:
                    System.out.println("Got something else");
                    break;
            }

        } else
            input.nextLine();
    }
}