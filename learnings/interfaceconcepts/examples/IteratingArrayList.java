package learnings.interfaceconcepts.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratingArrayList {

    public static void main(String[] args) {
    List<Integer> arrayLists = new ArrayList(5);


        for (int i = 0; i < 5; i++) {

            arrayLists.add(i);
        }

        System.out.println("Before reverse:" + arrayLists);
        Collections.reverse(arrayLists);
        System.out.println("After Reverse:" + arrayLists);

        Iterator iterator = arrayLists.iterator();

        while (iterator.hasNext()) {

            for (int i = 0; i < arrayLists.size(); i++) {

            }

        }


    }



}
