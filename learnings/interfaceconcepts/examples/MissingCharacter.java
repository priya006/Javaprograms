package learnings.interfaceconcepts.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//https://leetcode.com/problems/find-the-difference/

public class MissingCharacter {
    public static char findTheDifference(String s, String t) {

 /*       int comparedResult = s.compareTo(t);
        char missingCharacter = (char) comparedResult;

        return missingCharacter;*/




        //Algorithm to solve the problem with hashmap

        //Map<Character,Integer> hashMap = new HashMap<>();
        //create hashmap smallHash  and bighash
        //now traverse s using s.charAt(i) add all characters to  smallHash
        //now traverse t using t.charAt(i) add all charceters to bighashmap

        Map<Character, Integer> smallHashMap = new HashMap<>();
        Map<Character, Integer> bigHashMap = new HashMap<>();
        Character missingCharacter = '\0';

        for (int i = 0; i < s.length(); i++) {

            smallHashMap.put(s.charAt(i), smallHashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            bigHashMap.put(t.charAt(j), bigHashMap.getOrDefault(t.charAt(j), 0) + 1);
        }

        for (Character bigKeySet : bigHashMap.keySet()) {

            if (!smallHashMap.containsKey(bigKeySet)) {
                missingCharacter = bigKeySet;
                break;
            }

        }

        return missingCharacter;

    }


    public static void main(String[] args) {

        char missingCharacter = findTheDifference("a", "aab");
        System.out.println(missingCharacter);

    }

}
