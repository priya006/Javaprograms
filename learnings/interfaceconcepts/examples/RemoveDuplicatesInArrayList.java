package learnings.interfaceconcepts.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInArrayList {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>(10);



        for (int i = 0; i < 10; i++) {

            myList.add(i, "a");
        }

        Set<String> hashSet = new HashSet<>(myList);
        List<String> listWithoutDuplicatesUsingHashSet = new ArrayList<>(hashSet);

    //insertion order willl be distuirbed when you use hashset
        System.out.println(myList.size() + "\t");
        System.out.println(myList + "\t");
        System.out.println(listWithoutDuplicatesUsingHashSet + "\t");
        System.out.println(listWithoutDuplicatesUsingHashSet.size() + "\t");

    }

    //set does not allow duplicate elements
    //ArrayList allows duplicate elelemnts
    //if you dont specify index in arraylist when you add its adds in the end
    //Arraylist shrunk  automatically and increase size automatically when needed (Amazing)
}
