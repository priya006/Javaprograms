package learnings.interfaceconcepts.examples;


import java.util.Hashtable;
import java.util.Map;
import java.util.Set;


//Hashtable  similar to HashMap, but is synchronised

public class TryHashtable {

    public static void main(String[] args) {


        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("key1", 1);
        hashtable.put("key2", 100);
        hashtable.put("key3", 200);


        System.out.println(hashtable.containsValue(1004545));

        hashtable.computeIfAbsent("key4", askanandha -> 32493493);
        System.out.println("isEmpty: " + hashtable.isEmpty());

        Set s = hashtable.entrySet();
        Set<String> keys = hashtable.keySet();

        hashtable.putIfAbsent("key4", 999999);
        hashtable.putIfAbsent("key6", 8888);  // this will not enter the value since the key 100 is already present


        hashtable.remove("key1");
        System.out.println("key1 remopved:" +s);

        for (Map.Entry<String, Integer> entry : hashtable.entrySet())
            System.out.println(entry.getKey());


    }
}
