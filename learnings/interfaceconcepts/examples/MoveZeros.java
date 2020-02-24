package learnings.interfaceconcepts.examples;

public class MoveZeros {


    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
 /*       int arrayLength = arr.length;
        int count = 0; // Make note of every non-zero elements in the array

        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] != 0)   // i = 2 //count =1
                arr[count++] = arr[i];

        }
        while (count < arrayLength)
            arr[count++] = 0;

        for (int j = 0; j < arrayLength; j++)
            System.out.println(arr[j]);

    }*/


        int count = 0;
        int j = 0;
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArray[j] = arr[i];
                j++;
                count++;
            }
        }
        for (int i = count; i <= arr.length - 1; i++)
            newArray[i] = 0;


        // pls discuss this with anandha

        //This i cant understand. Spent 4 hours on this
        // Question from leet code

        for (int i : newArray)
            System.out.println(i);
    }
}