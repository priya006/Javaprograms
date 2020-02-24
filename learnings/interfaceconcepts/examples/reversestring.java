package learnings.interfaceconcepts.examples;

import org.junit.Test;

public class reversestring {


    char characters;

    public String reverse(String source) {

        if (source == null || source.isEmpty()) {

            return source;
        }

        String reverse = "";

        //how >=0 is working?

        for (int i = source.length() - 1; i >= 0; i--) {

            char characters = source.charAt(i);
            reverse = reverse + characters;
        }

        return reverse;
    }

    @Test
    public void reverse() {

        String reversedString = reverse("priya");
        System.out.println(reversedString);
    }
}
