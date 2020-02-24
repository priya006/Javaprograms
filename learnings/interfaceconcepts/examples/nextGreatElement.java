package learnings.interfaceconcepts.examples;

public class nextGreatElement {

    static void nextGreatElement(int[] array) {


        int nge = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] < array[j]) {
                    nge = array[j];
                    break;
                }
            }
        }

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i] + "--" + nge);

    }


    public static void main(String[] args) {

        int[] array = {11, 13, 21, 3};
        nextGreatElement(array);

    }
}
