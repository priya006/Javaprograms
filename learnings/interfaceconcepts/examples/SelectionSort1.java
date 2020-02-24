package learnings.interfaceconcepts.examples;

public class SelectionSort1 {

    private static void sort(int[] array) {

        int temp = 0;
        int arrayLength = array.length;


        for (int i = 0; i < arrayLength; i++) {
            int min_idx = i; //Assume
            for (int j = i + 1; j < arrayLength; j++) {


                if (array[min_idx] > array[j])
                    min_idx = j;

                if (i != min_idx) {

                    temp = array[min_idx];
                    array[i] = array[min_idx];
                    array[i] = temp;
                }


            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 1};
        sort(array);

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

    }
}
