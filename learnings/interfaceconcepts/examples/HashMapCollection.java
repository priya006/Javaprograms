package learnings.interfaceconcepts.examples;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {

    public void iteratingMap() {

        Map<String, String> inputMap = new HashMap();
        inputMap.put("1", "priya");
        inputMap.put("2", "sonali");


        for (Map.Entry<String, String> entry : inputMap.entrySet()) {
            System.out.println(inputMap.entrySet());
            //   System.out.println(entry.getValue());
            // System.out.println(entry);

        }
    }

    @Test
    public void testMap() {
        iteratingMap();

    }
}
