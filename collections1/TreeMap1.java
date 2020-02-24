package collections1;


import java.util.*;


public class TreeMap1 {
    public static void main(String[] args) {

        //Map = HashMap, TreeMap and LinkedHashMap1
        //"Sorting" takes place in ascending order of the key .
        //TreeMap implements NavigableMap interface
        //https://www.baeldung.com/java-treemap#choosing-the-right-map
        //Performance of treemap is bad


        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "pri");
        treeMap.put(2, "anuyhh");
        treeMap.put(1, "ke");
        treeMap.put(5, "val");
        treeMap.put(4, "vslue");

        System.out.print(treeMap);
        System.out.println();
        System.out.println("Largest Key: " +treeMap.lastKey());
        System.out.println("Smallest Key: " +treeMap.firstKey());

    }
}
