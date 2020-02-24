package learnings.interfaceconcepts.examples;

import org.junit.Test;

public class bubbleSort
{
    int counter;
    public int[] bubbleSorting(int[] sortedList){

    //bubble sort - very easy

        int i,j,temp = 0;


        for (i = 0; i < sortedList.length - 1; i++) {
            counter++;
            for (j = 0; j < sortedList.length - 1 - i; j++) {

                if (sortedList[j] > sortedList[j + 1]) {

                    temp = sortedList[j];
                    sortedList[j] = sortedList[j + 1];
                    sortedList[j + 1] = temp;
                }

            }

        }
        return sortedList;
    }


    @Test
    public void calculateSorting(){
        int[] sortedList = {2,3,1};
        int[] arr2 =  bubbleSorting(sortedList);

        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }

    }
}
