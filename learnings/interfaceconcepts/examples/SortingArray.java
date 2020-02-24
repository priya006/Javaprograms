package learnings.interfaceconcepts.examples;


import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {

        int[] arr = {10,1,0,5};


        int tmp;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {


                if (arr[i] > arr[j]) {

                    tmp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = tmp;
                  //  count = count + 1;

                }
            }

        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));

    }
}
