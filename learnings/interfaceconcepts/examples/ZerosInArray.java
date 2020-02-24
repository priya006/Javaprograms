package learnings.interfaceconcepts.examples;

import java.util.Arrays;

public class ZerosInArray {

    //movezerosinarray

    public static void main(String[] args) {

        int count = 0;
        int[] array = {0, 1, 0, 3, 12};
        Arrays.sort(array);




        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0)
                count++;
            else if (array[i] > 0)
                array[count++] = array[i];
        }

        for (int c : array)
            System.out.println(c);
        //System.out.println(count);
    }
}
