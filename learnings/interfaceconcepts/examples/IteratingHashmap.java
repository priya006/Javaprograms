package learnings.interfaceconcepts.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingHashmap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("key1", "value1");
        map.put("key2", "value2");

        //HashMap allows one null key and any number of null values.

        map.put("key3", "");
        map.put("", "");
        map.put("", "");
        map.put("", "sdsd");
        map.put("", "sdsddsdsdsd");
        map.put("sds", "");


        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        //  Iterator it = map.entrySet().iterator();


        while (it.hasNext()) {
            Map.Entry<String, String> pair = it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }


}
