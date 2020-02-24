package learnings.interfaceconcepts.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashset {

    public static void main(String[] args) {
        int[] arrA = {2, 3, 5, 6, 100};
        int[] arrB = {2, 9, 0, 6, 100};


        Set<Integer> common = findCommonElements(arrA, arrB);
        System.out.println(common);



    }



    private static Set<Integer> findCommonElements(int[] arrA, int[] arrB) {


        Set<Integer> hashSetA = new HashSet<>();
        Set<Integer> hashSetB = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();
        Integer commonElement = null;

        for (int i = 0; i < arrA.length; i++) {

            hashSetA.add(arrA[i]);
            hashSetB.add(arrB[i]);

        }

        for (Integer keyA : hashSetA) {

            if (hashSetB.contains(keyA))
                commonSet.add(keyA);
        }

        



        //See how iteration works in hashset and record it

        return commonSet;
    }


}


//read BST and prepare for interview
//  then sort this problem hashset an d record
