package learnings.interfaceconcepts.examples;

import org.junit.Test;

import java.net.URL;

public class PalindromeString {

    public boolean reverseString(String str) {


        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder stringReversed = stringBuilder.reverse();

        String convertToString = stringReversed.toString();

        if (str.equals(convertToString))

            return true;

        else
            return false;
    }
    @Test
    public void reverseTheString() {
        boolean isApalindrome = reverseString("malayalam");
        System.out.println("This string is a palindrome: " + isApalindrome);

       // URL url = String.class.getResource("String.class");
       // System.out.println(url);

    }
}
