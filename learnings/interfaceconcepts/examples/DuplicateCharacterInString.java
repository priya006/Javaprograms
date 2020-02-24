package learnings.interfaceconcepts.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateCharacterInString {

    //anand - a,a  & n,n
    //input a string
    //declare a hashmap<Character,Integer> key being the character, value being the frequency/occurence
    //if(map.containsKey(key))
    //frequency++;
    //else  map.put(key,value)
    //map.get(key) > 1 print

    private static Map<Character, Integer> map = new HashMap();


    static void findDuplicateCharacters(String s) {

        char key = '\0';
        Integer value;

        for (int i = 0; i < s.length(); i++) {

            key = s.charAt(i);
            if (map.containsKey(key)) {
                value = map.get(key) + 1;
                map.put(key, value);
            } else
                map.put(key, 1);

        }

        System.out.println(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();

            if (value > 1)
                System.out.println("key:" + key + "value:" + value);

        }

    }

    public static void main(String[] args){
        findDuplicateCharacters("progg");

    }
}
