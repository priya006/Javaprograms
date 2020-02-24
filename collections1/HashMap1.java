package collections1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        //Hashmap allows only one null key and multiple null values
        //If the map previously contained a mapping for the key, the old value is replaced.

        hashMap.put("Priya", 1);
        hashMap.put(null, 2);
        hashMap.put("", 2);
        hashMap.put("zero", 0);
        hashMap.put("zero", 1);  //Here the value 0 is replaced by 1


        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext())
            System.out.println(it.next());


    }
}
