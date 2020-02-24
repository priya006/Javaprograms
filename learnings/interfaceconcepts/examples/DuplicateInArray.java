package learnings.interfaceconcepts.examples;

import org.junit.Test;


public class DuplicateInArray {

    public boolean duplicateArray() {

        int[] sampleInput = new int[]{1,  0,0,  2, 4,4};

        for (int i = 0; i < sampleInput.length; i++)
            for (int j = 1; j < sampleInput.length-2; j++) {
                if (sampleInput[i] == sampleInput[i + j])
                    // System.out.println("You have a duplicate in the given Array");
                    return true;


            }

//        String s = "0394090349409034934545sljdlsjdlsjdfljdf934893489384dksjkhfkdfhkdhfdjk4938938430394090349409034934545sljdlsjdlsjdflj";
//
//
//        System.out.println(s.length());

        return false;


    }


    @Test
    public void findDuplicateArrayTest() {

        boolean answer = duplicateArray();
        System.out.println(answer);
    }
}
