package learnings.interfaceconcepts.examples;

import org.junit.Test;

public class lamda1 {


    @Test
    public void calculateString() {

        LambdaInterface stringLength = (s) -> s.length();
        System.out.println(stringLength.perform("praise the lord"));

    }
}


//How to have a interface should it be seperate
//How to call the stringLength(variable) to execute the method
//How to capture the length of the string?