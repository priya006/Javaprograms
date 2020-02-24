package comparator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {
    public static void main(String[] args) {


        List<Integer> arrayList = new ArrayList();

        arrayList.add(2);
        arrayList.add(51);
        arrayList.add(1);


        Comparator<Integer> compimpl = new Compimpl();

        Collections.sort(arrayList, compimpl);


        for (int i : arrayList)
            System.out.println(i);


    }
}
