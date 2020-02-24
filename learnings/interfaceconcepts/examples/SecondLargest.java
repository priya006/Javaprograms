package learnings.interfaceconcepts.examples;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {45, 51,51, 28, 75, 49, 42};
        int result = findSecondLargestNumber(arr);
        System.out.println(result);
    }


    private static int findSecondLargestNumber(int[] arr) {

        //stated by assuming
        int firstlargest, secondLargest;


        if (arr[0] > arr[1]) {
            firstlargest = arr[0];
            secondLargest = arr[1];
        } else {
            firstlargest = arr[1];
            secondLargest = arr[2];

        }

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > firstlargest) {
                secondLargest = firstlargest;
                firstlargest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] < firstlargest)

                secondLargest = arr[i];
        }

        return secondLargest;

    }
}
