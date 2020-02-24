package learnings.interfaceconcepts.examples;

public class FibonacciSeries {

    public static void main(String[] args) {
        int index = 2;
        int result = findTheNumber(index);
        System.out.println(result);
    }

    private static int findTheNumber(int index) {

        //Find the number in the series for the index

        int[] seriesArray = new int[index];

        int firstNumber = seriesArray[0] = 0; //firstNumber
        int secondNumber = seriesArray[1] = 1; //secondNumber


        int thirdNumber = firstNumber + secondNumber;

        for (int i = 2; i < index; i++) {

            seriesArray[i] = thirdNumber;

            if (seriesArray[i] != thirdNumber) {

                secondNumber = thirdNumber;
                firstNumber = secondNumber;
            } else
                return thirdNumber;

        }
            return 0;
    }

}
