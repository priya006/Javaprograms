package learnings.interfaceconcepts.examples;

import java.util.HashMap;

public class FirstUniqueCharacter {


    private static int findIndexOfUniqueCharacter(String str) {


        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        int stringLength = str.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < stringLength; i++) {
            char c = str.charAt(i);
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < stringLength; i++) {
            if (hashMap.get(str.charAt(i)) == 1)
                return i;
        }


        return -1;  //This is a false condition
    }


    public static void main(String[] args) {

        String s = "lloopp";
        int result = findIndexOfUniqueCharacter(s);
        System.out.println(result);



    }
}
