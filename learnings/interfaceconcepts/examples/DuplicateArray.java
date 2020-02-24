package learnings.interfaceconcepts.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {

    // This is ebay question asked by sonali
    public static void main(String[] args) {

        //int[] sampleInput = {1, 3, 6, 5, 8, 1, 6};
        int[] sampleInput = {1, 1, 1, 5, 6, 7, 2, 2, 2};  //empty array
        ArrayList<Integer> duplicatedNumbersAndTimes = findDuplicates(sampleInput);
        for (int duplicatedNumbersAndTime : duplicatedNumbersAndTimes) {
            System.out.println("The duplicated number in the array is : " + duplicatedNumbersAndTime);
        }

    }


    private static ArrayList<Integer> findDuplicates(int[] arr) {
        int arraySize = arr.length;
        int newValue;
        int duplicatedNumber = 0;
        int duplicatedTimes = 0;
        Map<Integer, Integer> myMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (arraySize > 0) {

            for (int i = 0; i < arraySize; i++) {
                if (!myMap.containsKey(arr[i])) {
                    myMap.put(arr[i], 1);
                } else {
                    newValue = myMap.get(arr[i]) + 1;
                    myMap.put(arr[i], newValue);
                }
            }

            for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
                if (entry.getValue() > 1) {
                    duplicatedNumber = entry.getKey();
                    duplicatedTimes = entry.getValue();
                    arrayList.add(duplicatedNumber);
                    arrayList.add(duplicatedTimes);
                }

            }

        } else
            System.out.println("Enter a valid array");
        return arrayList;
    }

    //O(n) + O(n) = 2O(n) --> O(n)

    //calculate big O-N
    // calculate memory space
}
