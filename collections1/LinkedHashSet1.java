package collections1;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {
    public static void main(String[] args) {

        //Insertion order preserved and duplicates are not allowed

        Set linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(1);
        linkedHashSet.add(2);


        System.out.println(linkedHashSet);

    }
}
