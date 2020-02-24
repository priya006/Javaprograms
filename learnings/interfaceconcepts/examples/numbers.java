package learnings.interfaceconcepts.examples;

import org.junit.Test;

public class numbers {



        public void sum() {

           // String[] fruit = new String[5000];
            Integer totalItems = 5000;
            Integer pageSize = 1000;
            for (int startAt = 0; startAt < totalItems; startAt = startAt+pageSize) {
                System.out.println((startAt) );
            }
        }


    @Test
    public void someTest() {

        sum();

    }

}