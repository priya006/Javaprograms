package learnings.interfaceconcepts.examples;


public class IndexEqualsValueSearch {


    static int indexEqualsValueSearch(int[] arr) {


        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            if (arr[i] == i) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {-8, 0, 2, 5};
        int index = indexEqualsValueSearch(arr);
        System.out.println(index);

    }


}
