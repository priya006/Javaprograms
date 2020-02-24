package learnings.interfaceconcepts.examples;

import java.util.Arrays;

public class UserInput {

    static int[] difference = new int[8];

    // Returns the distance between the two closest numbers.
    static int[] distClosestNumbers(int[] numbers) {

        Arrays.sort(numbers);
        //{3,7,9,15,50,65,98,99}

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1])
                difference[i - 1] = numbers[i] - numbers[i - 1];

        }
        return difference;

    }

    public static void main(String[] args) {
        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
        int[] result = distClosestNumbers(testArray);
        System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
    }
}
