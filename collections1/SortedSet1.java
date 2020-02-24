package collections1;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {


    //[1,2,3,4] --> The set will always be sorted
    //SortedSet is an interface


    public static void main(String[] args) {


        SortedSet sortedSet = new TreeSet();

        sortedSet.add(115);
        sortedSet.add(100);
        sortedSet.add(101);
        sortedSet.add(103);
        sortedSet.add(104);
        sortedSet.add(107);
        sortedSet.add(110);


        System.out.println("First: " + sortedSet.first());
        System.out.println("Last: " + sortedSet.last());
        System.out.println("Headset " + sortedSet.headSet(104)); //Lesser than 104
        System.out.println("Tailset" + sortedSet.tailSet(104)); //It includes 104 as well
        //System.out.println("Subset: "+sortedSet.subSet(103,110));//numbers greater than 103 and includes 103 and less than 110
        System.out.println("comparator: " + sortedSet.comparator()); //since we are using natural sorting order this method returns null


        System.out.println("The objects are sorted in below order: ");
        System.out.println();
        for (Object s : sortedSet)
            System.out.println(s);

    }
}
