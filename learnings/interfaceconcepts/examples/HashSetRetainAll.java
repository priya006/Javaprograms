package learnings.interfaceconcepts.examples;

import java.util.HashSet;
import java.util.Set;

public class HashSetRetainAll {
    public static void main(String[] args) {

        //Will hashset allow null pls find out?????
        //addArraylist instead of hasset for collection



        Set<Character> hashSetA = new HashSet<>();

        hashSetA.add('a');
        hashSetA.add('b');
        hashSetA.add('c');
        hashSetA.add('\0');


        Set<Character> hashSetB = new HashSet<>();

        hashSetB.add('z');


        System.out.println(hashSetA.retainAll(hashSetB));
        System.out.println(hashSetA);


    }
}
