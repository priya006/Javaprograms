package learnings.interfaceconcepts.examples;

public class FirstLargest {

    private static int findFirstLargest(int[] array) {

        int firstLargest = array[0];

        if (array.length == 0) return 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] > firstLargest)
                firstLargest = array[i];

        }
        return firstLargest;
    }


    public static void main(String[] args) {

        int[] array = {14, 2, 16, 10, 200};

        int firstLargest = findFirstLargest(array);
        System.out.println(firstLargest);
    }
}
