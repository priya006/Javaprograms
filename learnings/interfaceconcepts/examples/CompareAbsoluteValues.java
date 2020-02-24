package learnings.interfaceconcepts.examples;

public class CompareAbsoluteValues {

    public static void main(String[] args) {
        int[] array = {45, 12, 85};
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

//Selection sort - If the second element is small then swap with first element
