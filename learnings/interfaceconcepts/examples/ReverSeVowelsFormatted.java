package learnings.interfaceconcepts.examples;

import java.util.ArrayList;
import java.util.List;

public class ReverSeVowelsFormatted {

    //Anandha's solution

    public static void main(String[] args) {

        String result = reverseVowels("eat");
        System.out.println(result);

    }

    public static String reverseVowels(String input) {

        final List<Character> vowels = getVowels();
        final int stringLength = input.length();
        final StringBuilder reversedVowels = new StringBuilder();
        final StringBuilder result = new StringBuilder(); //which I am going to output
        result.append(input);




        for (int i = 0; i < stringLength; i++) {

            char chartAtIndex = input.charAt(i);
            if (vowels.contains(chartAtIndex))
                reversedVowels.append(chartAtIndex);
        }

        final String reverseVowels = reversedVowels.reverse().toString();

        for (int i = 0, j = 0; i < stringLength; i++) {
            if (vowels.contains(input.charAt(i))) {
                result.deleteCharAt(i);
                result.insert(i, reverseVowels.charAt(j));
                j++;
            }
        }
        return result.toString();
    }

    private static List<Character> getVowels() {
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        return vowels;
    }
}
