package learnings.interfaceconcepts.examples;


public class RemoveELEMENT {

    //Tell how many duplicates in the array has to be removed to make the array a distinct one with no duplicates.

    public static void main(String[] args) {

        int[] array = {1,1,1,1,1,1,90,100};


        int result = removeElement(array, 1);
        System.out.println(result);

    }


    private static int removeElement(int[] nums, int val) {

        int arrayLength = nums.length;
        int count = 0;
        for (int i = 0; i < arrayLength; i++) {

            if (nums[i] == val)
                count++;
        }
       // System.out.println(count);

        return count-1;
    }

}
