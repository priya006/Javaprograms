package learnings.interfaceconcepts.examples;

import org.junit.Test;

public class primeNumbers {

    boolean flag;

    public void primeNos(int N) {

        if (N % 2 == 0) {
            flag = false;
        } else
            flag = true;

        if (flag == true) {

            System.out.println("This number is a Prime: " + N);
        }
        else
            System.out.println("This number is NOT a Prime: " + N);
    }


    @Test
    public void findPrimeNos() {

        primeNos(13);
    }
}