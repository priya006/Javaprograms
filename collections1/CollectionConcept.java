package collections1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionConcept {


    //Array could not hold many elemnts so collection is used
    //Collection(interface) -> List(Interface) -> ArrayList(Class)
    //Collection does not have index- Thats is the down side of it


    public static void main(String[] args) {


        Collection<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(51);
        arrayList.add(1);


        for (Integer i : arrayList)
            System.out.println(i);


    }
}
