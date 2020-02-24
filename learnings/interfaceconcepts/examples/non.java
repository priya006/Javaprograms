package learnings.interfaceconcepts.examples;

import java.util.Arrays;

public class non {



    static int[] inputArray = {0,0 };
    static int  inputArrayLength =  inputArray.length;
    //static int[] outputArray = new int[inputArray.length];
    static int[] outputArray = getSqauresOfArray(inputArray);

    public static void main(String[] args){


        for(int i  : outputArray)
            System.out.println("The numbers are :"+ i );


    }

    static  int[] getSqauresOfArray(int[] array){

        for(int i = 0; i < inputArrayLength ; i++){

            inputArray[i]  =  inputArray[i]*inputArray[i];

        }

        Arrays.sort(inputArray);
        return inputArray ;
    }


}
