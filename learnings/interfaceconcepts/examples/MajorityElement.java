package learnings.interfaceconcepts.examples;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {


    private static int majorityElement(int[] nums) {
        Integer value;
        int highestValue = 0;
        Integer majorityEntry = 0;
        Map<Integer, Integer> map = new HashMap<>();


        if (nums.length == 0) return 0;

        for (int i : nums) {

            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            value = entry.getValue();
            if (value > highestValue) {
                highestValue = value;
                majorityEntry = entry.getKey();
            }
        }
        return majorityEntry;

    }

    public static void main(String[] args) {

        int[] array = {3,3,4,6,6,6};

        int majorityElement = majorityElement(array);
        System.out.println(majorityElement);


     /*   String s = "abcde";
        StringBuilder sb = new StringBuilder(s);
      StringBuilder ssdd = sb.deleteCharAt(0);
        System.out.println(ssdd);


        s.equals(ssdd);*/


    }
}
