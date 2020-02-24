package learnings.interfaceconcepts.examples;

import org.junit.Test;

public class SwitchCase {

    public void statement(String str) {

        String day = null;

        switch (str) {

            case "monday":

                day = "monday";
                break;

            case "Tuesday":
                day = "Tuesday";
                break;


            default:
                day = "defaultDay";
                break;

        }


        System.out.println("Today is: " + day);

    }


    @Test
    public void testSwitchStatement() {

        statement("");

    }

}
