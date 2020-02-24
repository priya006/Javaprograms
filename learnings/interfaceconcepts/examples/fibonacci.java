package learnings.interfaceconcepts.examples;

import org.junit.Test;

public class fibonacci {

    int result;
    public void series(int N) {

        int t1 = 0;
        int t2 = 1;

        for (int i = 1; i <= N; i++) {

            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }


    }

    @Test
    public void fibonacciSeries() {

        // int answer = series(8);
        //  System.out.println("series" +answer);

        series(8);
    }
}
