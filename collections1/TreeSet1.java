package collections1;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {

        //Treeset gives the output in "sorted" format. (Ascending format)
        //Duplicate values are not allowed


        SortedSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(55);
        treeSet.add(200);
        treeSet.add(1);
        treeSet.add(1);  //Duplicates dont add
        treeSet.add(2);





        System.out.println(treeSet);

    }

}
