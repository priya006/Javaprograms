package learnings.interfaceconcepts.examples;

public class NondecreasingArray {

    //Find if the array is in ascending order then return true else false
    //If atleast one element is (i+1) < (i)  then i will say it is not ascending order and break out the loop to minimize the run time


    private static boolean isAscendingOrder(int[] array) {


        int arrayLength = array.length;
        boolean isAcending = true;

        for (int i = 0; i < arrayLength - 1; i++) {

            if (array[i + 1] < array[i]) {
                isAcending = false;
                break;
            } else if (array[i + 1] == array[i]) {
                isAcending = false;
                break;
            } else
                isAcending = true;


        }


        return isAcending;


    }






/*

    private static boolean isNonDecreasingArray(int[] arr) {

        if (arr.length == 0) return false;
        int count = 0;

        //assume array starts from 1

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                count++;
        }

        if (count == 1)
            return true;

        return false;
    }


*/

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 0};
        boolean result = isAscendingOrder(arr);
        System.out.println(result);

    }

}
