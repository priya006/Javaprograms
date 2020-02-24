package learnings.interfaceconcepts.examples;

import java.util.Scanner;

public class PrimeNumberOrNot {

    public static void main(String[] args) {

        boolean isPrime = true;
        System.out.println("Enter the number to find if its a prime number");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        for (int i = 2; i < inputNumber; i++) {
            if (inputNumber % i == 0)
                isPrime = false;
            break;
        }

        if (isPrime)
            System.out.println("The number is a prime Number");
        else
            System.out.println("The number is NOT a prime Number");
    }
}

