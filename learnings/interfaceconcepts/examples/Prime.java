package learnings.interfaceconcepts.examples;

import org.junit.Test;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Prime {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger isPrime = new BigInteger(n);

        if(isPrime.isProbablePrime(1)) {
            System.out.print("prime");
        }else if(isPrime.isProbablePrime(0)) {
            System.out.print("not prime");
        }
    }

}


