package learnings.interfaceconcepts.examples;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    private static char key;


    static Map isAnagram(String a) {


        if (a == null || a.equals("")) {

            System.out.println("String is empty or null");
        }

        Map<Character, Integer> toFindAnagram = new HashMap<>();

        if (a != null && a != "") {

            for (int i = 0; i < a.length(); i++) {

                key = a.charAt(i);

                if (!toFindAnagram.containsKey(key)) {

                    toFindAnagram.put(key, 1);
                } else {
                    Integer frequency = toFindAnagram.get(key);
                    toFindAnagram.put(key, ++frequency);
                }
            }

        }
        return toFindAnagram;
    }

    public static void main(String[] args) {


        System.out.println(isAnagram("malayalam"));

    }
}

