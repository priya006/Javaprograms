package learnings.interfaceconcepts.examples;

import java.util.Arrays;

public class eb {


    public void sortArray(int[] inputArray) {



        int size = inputArray.length;
        int[] resultArray = new int[size];
        int[] sortedArray;

        for (int i = 0; i < inputArray.length; i++) {
            resultArray[i] = inputArray[i] * inputArray[i];

        }

         Arrays.sort(resultArray);

    }
}
