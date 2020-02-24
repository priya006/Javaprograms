package learnings.interfaceconcepts.examples;

public class FindBiggestElementInArray {
    public static void main(String[] args) {

        int[] array = {28, 3, 15, 93874, 10000, 17, 100, 0, 4, 23, 2};

        int result = findTheLargestElement(array);
        System.out.println(result);
    }


    private static int findTheLargestElement(int[] array) {


/*        int arraySize = array.length;
        int temp = 0;

        for (int i = 0; i < arraySize-1; i++) {

            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;

            }

        }

        temp = array[arraySize - 1];
        return temp;
    }*/
        int arraySize = array.length;
        int temp = 0;

        int greatestElement = array[0];
        for (int i = 0; i < arraySize; i++) {

            if (array[i] > greatestElement)
                greatestElement = array[i];
        }

        return greatestElement;

    }
}