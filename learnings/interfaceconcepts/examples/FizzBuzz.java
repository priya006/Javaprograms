package learnings.interfaceconcepts.examples;

import org.junit.Test;


public class FizzBuzz {

    public void calculateFizzBuzz() {

        int i;
        for (i = 1; i <= 100; i++) {

            if ((i % 3 == 0) && (i % 5 == 0))
                System.out.println("BOTH");
            else
                System.out.println("1");
        }

    }


    @Test
    public void printFizzBuzz() {

        calculateFizzBuzz();
    }
}
