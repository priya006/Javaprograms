package learnings.interfaceconcepts.examples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;

public class WordCountEngine {


    static String[][] wordCountEngine(String document) {

        Map<String, Integer> map = new LinkedHashMap<>();
        String stringWithNoSpecialCharacters = document.replaceAll("[^a-zA-Z]", "");
        String lowerCasedString = stringWithNoSpecialCharacters.toLowerCase();
        String[] stringWithoutSpace = lowerCasedString.split("");
        int size = stringWithoutSpace.length;  //11[0-10]
        Integer newValue;
        int row = 0;



    /* Practice makes perfect. you'll only
                    get Perfect by practice. just practice */

        for (int i = 0; i < size; i++) {

            if (!map.containsKey(stringWithoutSpace[i]))
                map.put(stringWithoutSpace[i], 1);
            else {
                newValue = map.get(stringWithoutSpace[i]) + 1;
                map.put(stringWithoutSpace[i], newValue);
            }
        }

        int keySize = map.keySet().size();

        String[][] outputArray = new String[keySize][2];
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            outputArray[row][0] = entry.getKey();
            outputArray[row][1] = String.valueOf(entry.getValue());
            row++;
        }

    /*    Arrays.sort(outputArray, new Comparator<String[]>() {
            @Override
            public int compare(String[] arr1, String[] arr2) {

          *//*
          -1 first parameter < second parameter
          0  first == second
          1  first parameter > second parameter*//*


                final String arr2 = arr2[1];
                final String arr1 = arr1[1];

                return arr1.compareTo(arr2);
            }
        });*/

        return outputArray;

    }


    static public void main(String args[]) {
        String[][] outPut = wordCountEngine("Practice makes perfect. you'll only get Perfect by practice. just practice!");
        System.out.println(outPut.toString());
    }




/*
input:  document = "Practice makes perfect. you'll only
                    get Perfect by practice. just practice!"

                    practice makes perfect youll only
                    get perfect by practice just practice

output: [ ["practice", "3"],
          ["perfect", "2"],
          ["makes", "1"],
          ["youll", "1"],
          ["only", "1"],
          ["get", "1"],
          ["by", "1"],
          ["just", "1"] ]  */


}
