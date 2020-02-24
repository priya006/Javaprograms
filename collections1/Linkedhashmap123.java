package collections1;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Linkedhashmap123 {




        public static void main(String[] args) {


            LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();


            linkedHashMap.put("Priya", 1);
            linkedHashMap.put(null, 2);
            linkedHashMap.put("", 2);
            linkedHashMap.put("zero", 0);
            linkedHashMap.put("zero", 1);  //Here the value 0 is replaced by 1


            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext())
                System.out.println(it.next());

        }
    }



