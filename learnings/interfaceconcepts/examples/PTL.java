package learnings.interfaceconcepts.examples;

import java.util.Arrays;
import java.util.HashSet;

public class PTL {

   /* private static Integer[] result;

    private static Integer[] intersection(Integer[] firstArray, Integer[] secondArray) throws NullPOinterException {


        //Set<Integer> s1 = new HashSet<>(Arrays.asList(firstArray));
        //Set<Integer> s2 = new HashSet<>(Arrays.asList(secondArray));
        //s1.retainAll(s2);

        if(firstArray == null ||secondArray == null)  throw new NullPOinterException();

        HashSet<Integer> firstSet = new HashSet<>();
        for (int i : firstArray) {

            firstSet.add(i);
        }

        HashSet<Integer> secondSet = new HashSet<>();
        for (int i : secondArray) {

            if (firstSet.contains(i)) {
                secondSet.add(i);
            }

            //Iterate through Second Set and convert to int array and return

            result = new Integer[secondSet.size()];
            int j = 0;

            for (int n : secondSet) {

                result[j++] = n;
            }


            //  return s1.toArray(new Integer[s1.size()]);

        }
        return result;
    }


    public static void main(String[] args) throws NullPOinterException {


        Integer[] firstArray = {1,1,1};
        Integer[] secondArray = {};

        Integer[] output = intersection(firstArray, secondArray);

        for (Integer value : output) {

            System.out.println(value);

        }*/





    /*You’re given two arrays of positive integer numbers: A and B.
   The numbers in A and B are unique, so, technically A and B are sets.
   Write a function that finds the intersection of A and B and returns it as a sorted array.
   And please also state the complexity of the method.
Example:
A: [2, 4, 9, 1, 3, 5]
B: [6, 5, 1, 8, 9]
Result: [1, 5, 9]
*/


//1. Get the input array as hash set and get the input as array List - Array 1 and Array 2
// 2.  A1. retainAll(A2)
// return A1.toArray(new Integer[A1.size())]

// print the out put using enhanced for loop

// With out using retain ALL how to find the intersection (Previous idea)

//Two array A1 and A2 . To use two for loops and if(A[i] == B[j]) then add to the resutArray[i]


//My own implmentation:

//Check if the Key in HAshSetA conains in Hashset B if true. Then add the key to the result Array


    private static Integer[] intersection(Integer[] firstArray, Integer[] secondArray) {


//Set<Integer> s1 = new HashSet<>(Arrays.asList(firstArray));
//Set<Integer> s2 = new HashSet<>(Arrays.asList(secondArray));


        //s1.retainAll(s2);

        HashSet<Integer> firstSet = new HashSet<>();
        for (int i : firstArray) {

            firstSet.add(i);
        }

        HashSet<Integer> secondSet = new HashSet<>();
        Integer[] result = new Integer[secondSet.size()];
        for (int i : secondArray) {

            if (firstSet.contains(i)) {
                secondSet.add(i);
            }



            //Iterate through Second Set and convert to int array and return


             i = 0;

            for (int n : secondSet) {

                result[i++] = n;
            }


            //  return s1.toArray(new Integer[s1.size()]);

        }
        return result;
    }


    public static void main(String[] args) {


        Integer[] firstArray = {2, 4, 9, 1, 3, 5};
        Integer[] secondArray = {6, 5, 1, 8, 9};

        Integer[] b = Arrays.copyOf(firstArray, firstArray.length);


        Integer[] output = intersection(firstArray, secondArray);

        for (Integer value : output) {

            System.out.println(value);

        }

/*

        for (Integer value : output) {

            System.out.println(value);

        }
*/

    }
/*

        Test cases:
        ---------

        1. Check  how it behaves when the user gives negative values
        2. Check how the method behaves with duplicate values
        3. Check if the forst array has empty {} input and second array has values in it  - Expect the out to be {}
        4.Check if the first array is {} and second array has vallue - expected out put would be empty
        5.Check if the input array 1 and input array 2 has size = 1000 - expected out come is the run time complexity will be more (It cannot be in ms)
        6.Check if  both input arrays has zeros - The output will have a zero
        7.Say input array1 has {6,3,4,2} and second array is {2} the expected out come is {2}
        8.The first array has {1,2,3} and b array has {1,2,3} check c has {1,2,3}
        9. If input array 1 has {2,3,8} and array2 has {9,0} the expected out come {}
        10. Check if the user inputs "null" for first array  and "null" for second array - Expecting to see null pointer exception

*/

    }
