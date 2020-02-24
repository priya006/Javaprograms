package learnings.interfaceconcepts.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array {

    private static int[] myArray;


    static public void main(String args[]) {

        int[] inputarr = {0, -1, -2, 2, 1};

        String s = "0394090349409034934545sljdlsjdlsjdfljdf934893489384dksjkhfkdfhkdhfdjk4938938430394090349409034934545sljdlsjdlsjdflj";


        System.out.println("tag"+s.length());
        int k = 1;


        int[][] pairs = findPairsWithGivenDifference(inputarr, k);
        for (int row = 0; row < pairs.length; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.printf("pair: " + pairs[row][col]);
                System.out.println("");
            }

        }




    }

    static public int[][] findPairsWithGivenDifference(int[] inputarr, int k) {

        int inputArraySize = inputarr.length;
        List<int[]> arrayList = new ArrayList<>();


        for (int i = 0; i < inputArraySize; i++) {
            for (int j = i + 1; j <= inputArraySize - 1; j++) {
                if (k + inputarr[j] == inputarr[i]) {
                    int[] myArray = {inputarr[j], inputarr[i]};
                    arrayList.add(myArray);
                }
            }
        }

        int[][] twoDimensional = new int[arrayList.size()][2];
        for (int row = 0; row < arrayList.size(); row++) {
            twoDimensional[row] = arrayList.get(row);
        }

        return twoDimensional;
    }






    //O(n2) + O(n) --> O(n2)

    //calculate big O-N
    // calculate memory space

    //Pls update suyasha
    //i made myArray as private static variable so made it global and move the declaration from findPairsWithGivenDifference to globally
    //There was typo in for loop in line 38
    //Changed this line  twoDimensional[row] = arrayList[row];   to  twoDimensional[row] = arrayList.get(row);
}


/*

input:  arr = [0, -1, -2, 2, 1], k = 1
        output: [[1, 0],
         [0, -1],
          [-1, -2],
           [2, 1]]

        input:  arr = [1, 7, 5, 3, 32, 17, 12], k = 17
        output: []*/
