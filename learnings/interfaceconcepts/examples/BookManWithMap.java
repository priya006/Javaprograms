package learnings.interfaceconcepts.examples;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.function.BiConsumer;

public class BookManWithMap {


/*    You have been given a map which holds book name and book author. One author might have several different books. But books are unique. Now, write a function which will return you a Map which will have the author name as unique and all the books he has written as values.

    Book Map=["Java"-->"John", "C#"-->"Rob", "Ruby"-->"John", "Rails"-->"Rob"]
    This should return a Map which has the following:
            ["John"-->{"Java","Ruby"}
        "Rob"--{"C#","Rails"}]*/


    public static Map<String, List<String>> mapping(Map<String, String> map) {


        Map<String, List<String>> hm = new HashMap<>();

        List<String> listRob = new ArrayList<>();

        List<String> listJohn = new ArrayList<>();
        Set<String> set = map.keySet();



        String key, tempValue;

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            key = it.next();
            tempValue = map.get(key);
            if (tempValue == "Rob") {
                listRob.add(key);
                hm.put("Rob", listRob);
            }
            if (tempValue == "John") {
                listJohn.add(key);
                hm.put("John", listJohn);
            }
        }
        return hm;


        //  Iterator it = map.keySet().iterator();

        /*while (it.hasNext()) {
            for (String key : map.keySet()) {
                value = map.get(key);

                if (value == "Rob")
                    listRob.add(key);

                else
                    listJohn.add(key);
                hm.put("Rob", listRob);
                hm.put("Rob", listJohn);
            }
        }

        return hm;*/

    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Java", "John");
        map.put("C#", "Rob");
        map.put("Ruby", "Rob");
        map.put("Rails", "Rob");
        map.put("Rails", "Rob232");


        mapping(map).forEach(new BiConsumer<String, List<String>>() {
            @Override
            public void accept(String s, List<String> strings) {
                // no - op
            }
        });
//        mapping(map).forEach((key, value) -> System.out.println(key + "->" + value));
        mapping(map).forEach((x, y) -> System.out.println(x + " " + y));


        int a = 1;
        int b = 1;


        int c = a++ + b++;
        System.out.println(c);


    }

}
