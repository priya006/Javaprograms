package learnings.interfaceconcepts.examples;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Multiple {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if (N < 20) {

            for (int i = 1; i <= 10; i++) {

                Integer multipliedResult = N * i;
                System.out.printf("%d x %d = %d%n", N, i, multipliedResult);
            }
        } else
            System.out.println("Enter a Number less than 20");
        scanner.close();
    }
}
