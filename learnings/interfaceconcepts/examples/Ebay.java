package learnings.interfaceconcepts.examples;

import java.util.Arrays;
import java.util.HashSet;


public class Ebay
{
    static HashSet<Integer> hashSetA = new HashSet<>();
    static HashSet<Integer> hashSetB = new HashSet<>();


    public static void main(String[] args){
        int[] arr1 = {2, 4, 9, 1, 3, 5};
        int[] arr2 = {6, 5, 1, 8, 9};


        int[] solutionArray =     findIntersectionOfNumbers(arr1,arr2);
        for(int i  : solutionArray)
            System.out.println(i);

    }


    static  int[]   findIntersectionOfNumbers(int[] arr1, int[] arr2){


        for(int i = 0; i < arr1.length; i++){

            hashSetA.add(arr1[i]);

        }

        int[] resultArray = new int[hashSetA.size()];

        for(int j = 0; j < arr2.length; j++){

            hashSetB.add(arr2[j]);

        }

        for(int i = 0; i < arr1.length; i++){

            int j = 0;
            if(hashSetA.retainAll(hashSetB)){

                hashSetA.contains(hashSetB);
                resultArray[j] =  arr1[i];
                j++;
            }

        }

        Arrays.sort(resultArray);
        return resultArray;
    }









}
