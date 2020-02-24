package learnings.interfaceconcepts.examples;

import java.util.Arrays;

public class Incomm {

    public static void main(String[] args) {


        String input = "(a+b)";


        int val = input.charAt(0);
        System.out.println(val);
        int lengthOftheString = input.length();
        for (int i = lengthOftheString - 1; i >= 0; i--) {
            char character = input.charAt(i);


            System.out.println(character);
        }
    }


}
