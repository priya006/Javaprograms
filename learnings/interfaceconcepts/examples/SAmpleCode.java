package learnings.interfaceconcepts.examples;

import java.util.HashMap;
import java.util.Map;

public class SAmpleCode {

    public static void main(String[] args) {


        Map<String, String> dataSet = new HashMap<>();
        dataSet.put("TX","CA");
        dataSet.put("NY","OH");
        dataSet.put("GA","NY");
        dataSet.put("CA","WA");
        dataSet.put("OH","TX");

        sortItenary(dataSet);
    }




    private static void sortItenary(Map<String, String> dataSet) {


        final Map<String, String> tempMap = new HashMap<String, String>();


        // To fill reverse map
        for (Map.Entry<String, String> entry : dataSet.entrySet())
            tempMap.put(entry.getValue(), entry.getKey());



        String entryPoint = null;
        for (Map.Entry<String, String> entry : dataSet.entrySet()) {
            if (!tempMap.containsKey(entry.getKey())) {
                entryPoint = entry.getKey();
                break;
            }
        }


        //After getting the starting point , we can find the next spot

        String destination = dataSet.get(entryPoint);
        while (destination != null) {
            System.out.print(entryPoint + "->" + destination + ", ");
            entryPoint = destination;
            destination = dataSet.get(destination);
        }
    }

}
