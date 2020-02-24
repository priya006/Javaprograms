package learnings.interfaceconcepts.examples;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RecurringString {

    //Find the first repeated character in a string

/*
    String s;
    int i;
    char returnChar;

    public Character recurringCharacter(String S) {

        for (i = 0; i < s.length(); i++)
            returnChar = s.charAt(i);
        if (returnChar == 'A')
            System.out.println("recurring String");
        else
            System.out.println("NO recurring String");

        return returnChar;

    }

    @Test
    public void recurringCharacterTest() {
        s = "geeks";
   char   answer =     recurringCharacter(s);
        System.out.println(answer);
    }
*/

    //The same problem I tried with hashmap but had issues in finding the key when I had the value


   /* public static void main(String[] args) {

        String str = "geeeeeeeeeks";

        int StringLength = str.length();
        Map<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < StringLength; i++) {

            char c = str.charAt(i);


            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);

        }


        for (Integer value : hashMap.values())
            if (value > 1)
                System.out.println(value);
        //get the key corresponsing to that value
        //print the key in the console


    }
*/

    static char firstRepeating(char str[]) {
        // Creates an empty hashset
        HashSet<Character> h = new HashSet<>();

        // Traverse the input array from left to right
        for (int i = 0; i <= str.length - 1; i++) {
            char c = str[i];

            // If element is already in hash set, update x
            // and then break
            if (h.contains(c))
                return c;

            else // Else add element to hash set
                h.add(c);
        }

        return  '\0'; //This means NULL character
    }


    public static void main(String[] args) {

        String str = "geeksforgeeks";

        char[] arr = str.toCharArray();
        System.out.println(firstRepeating(arr));


    }

}
