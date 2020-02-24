package learnings.interfaceconcepts.examples;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class SumOfSquareNumbers {

    public static void main(String[] args) {

        /*boolean isavalidSumOfSquares = judgeSquareSum(10);
        System.out.println(isavalidSumOfSquares);*/


        int[] a = {2, 3, 4, 5, 6};
        int[] b = {1, 0, 0, 0, 0, 1, 0, 0};
        System.out.println(cellCompete(b, 1));

//        System.out.println(generalizedGCD(1, a));


    }


    public static List<Integer> cellCompete(int[] states, int days)
    {
        // WRITE YOUR CODE HERE
        int length = states.length;
        Integer[] outPut = new Integer[length + 2];
        outPut[0] = 0;
        outPut [length + 1] = 0;
        Integer[] returnArray = new Integer[states.length];

        int count = 1;
        for (int a : states)
        {
            outPut[count] = a;
            count++;
        }

        for (int i = 0 ; i < days ; i++)
        {
            int counter = 0;
            for (int j = 1 ; j < outPut.length - 1 ; j++) {
                if (outPut[j - 1] == outPut[j + 1])
                    returnArray[counter] = 0;
                else
                    returnArray[counter] = outPut[j];
                counter++;
            }
        }


        return Arrays.asList(returnArray);

    }

    public static int generalizedGCD(int num, int[] arr)
    {
        Arrays.sort(arr);
        int divisor = arr[0];
        boolean GCD = true;
        for (int a: arr)
        {
            if (a % divisor != 0)
                GCD = false;
        }

        if (GCD)
            return divisor;
        else
            return 1;
    }
    //

}
