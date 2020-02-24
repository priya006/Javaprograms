package learnings.interfaceconcepts.examples;

import java.util.Arrays;

public class NonDecreasingOrder {


    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 4, 5, 6, 6};
        int[] squaresOfNumbersInNonDecreasingOrder = getSquaresInNonDecreasingOrder(arr);
        for (int i = 0; i <= arr.length; i++)
            System.out.println(squaresOfNumbersInNonDecreasingOrder[i]);
    }

    private static int[] getSquaresInNonDecreasingOrder(int[] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] >= arr[i]) {
                arr[i] = arr[i] * arr[i];  //[16,1,0,9,100]
            }
        }
        Arrays.sort(arr);
        return arr;
    }

    //calculate big O-N = O(n)
    // calculate memory space
}
