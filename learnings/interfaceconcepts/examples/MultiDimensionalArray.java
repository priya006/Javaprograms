package learnings.interfaceconcepts.examples;

public class MultiDimensionalArray {

    public static void main(String[] args) {


        int[][] secondArray = {
                {9, 11, 12},
                {9, 11, 12,14},
                {9, 11, 12,14,15,16},
                {9, 11, 12,14,23}
        };

        display(secondArray);
    }

    public static void display(int[][] inputArray) {

        System.out.println("First table" + "\n\n");

        for (int row = 0; row < inputArray.length; row++) {

            for (int column = 0; column < inputArray[row].length; column++) {
               // System.out.print(inputArray[row][column] + "\t");
            }

       /*     System.out.println();
            System.out.println("inputaaraylengthROW: " + inputArray[row].length);*/

        }
        System.out.println("inputaaraylength: " + inputArray.length);

    }
}
