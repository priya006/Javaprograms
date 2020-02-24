package learnings.interfaceconcepts.examples;

import org.junit.Test;

public class primeNumbersVersion2 {

    boolean flag;

    public void primeNumbers(int N) {



            for (int i = 2; i <= N-1; i++) {

                if (N % i == 0) {
                    flag = true;
                }
            }

                if (flag == true) {
                    System.out.println("This is a NOT prime Number: " + N);
                } else
                    System.out.println("This is  a prime Number: " + N);


    }

    @Test
    public void calculatePrimeNos(){
        primeNumbers(5);

    }
}