package learnings.interfaceconcepts.examples;

import java.util.HashSet;
import java.util.Set;

public class hash {

    private static Set<Integer> hashSetA = new HashSet<>();
    private static Set<Integer> hashSetB = new HashSet<>();
    private static Set<Integer> commonSet = new HashSet<>();


    public static void main(String[] args){


        int[] arr1 = {1};
        int[] arr2 = {1,3,5};


        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        Set<Integer> answers = findCommonElemnents(arr1, arr2);

        for(int i =0; i < arr2Length; i++)
            System.out.println("Common elements are" + commonSet);

    }


    static  Set<Integer> findCommonElemnents(int[] arr1, int[] arr2){

        for(int i =0; i < arr1.length; i++)
        {

            hashSetA.add(arr1[i]);

        }

        for(int i =0; i < arr2.length; i++)
        {

            hashSetB.add(arr2[i]);

        }



        for( Integer hashsetB1    : hashSetB){
            if(hashSetA.contains(hashsetB1))
                commonSet.add(hashsetB1);
        }

        return commonSet;

    }




}
