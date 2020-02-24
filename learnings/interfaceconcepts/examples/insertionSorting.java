package learnings.interfaceconcepts.examples;

import org.junit.Test;

public class insertionSorting

{
    int[] temp = new int[2];

    public void doSorting(int[] arr) {


        for (int i = 1; i < arr.length; i++) {

            for (int j = i+1; j >arr.length; j--) {

                if (arr[j-2] < arr[j-1] )
                {   temp[i] = arr[j];}

                    System.out.print(temp[i]);

            }



        }

    }

    @Test
    public void sortedList() {
        int[] arr = {4, 1};
        doSorting(arr);

    }

}
