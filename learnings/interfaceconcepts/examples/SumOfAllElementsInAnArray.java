package learnings.interfaceconcepts.examples;

public class SumOfAllElementsInAnArray {

    //Elements which are divisible by 2 are actually summed up and displayed

    //   private static int totalSum = 0;

/*    private static int findSumOfElements(int K, int[] arr) {

        if (arr.length == 0) return 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % K == 0)
                totalSum += arr[i];


        }


        return totalSum;*/


    private static int findSumOfElements(int[] array) {

        int arrayLength = array.length;
        int TotalSum = 0;

        for (int i = 0; i < arrayLength; i++) {

            if (array[i] % 2 == 0)

                TotalSum += array[i];


        }

        return TotalSum;
    }


    public static void main(String[] args) {

        int[] arr = {4, 6, 7, 2};
        int totalSum = findSumOfElements(arr);
        System.out.println(totalSum);

    }
}
