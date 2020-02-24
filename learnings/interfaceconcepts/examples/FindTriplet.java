package learnings.interfaceconcepts.examples;

public class FindTriplet {
    static boolean isTriplet(int[] array) {
        boolean isTriplet = false;
        for (int i = 0; i < array.length; i++)

            for (int j = i + 1; j < array.length; j++)


                for (int k = j + 1; k < array.length; k++)

                    if (array[i] * array[i] + array[j] * array[j] == array[k] * array[k])
                        isTriplet = true;

        return isTriplet;
    }


    public static void main(String[] args) {
        int[] array = {10, 4, 6, 12, 5};
        boolean result = isTriplet(array);
        System.out.println(result);
    }
}
