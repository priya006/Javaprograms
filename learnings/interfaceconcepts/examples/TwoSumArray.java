package learnings.interfaceconcepts.examples;

public class TwoSumArray {


    public static int[] twoSum(int[] nums, int target) {

        int numsLength = nums.length;
        int sumOfTwoElementsInArray = 0;


        for (int i = 0; i < numsLength; i++) {

            for (int j = i + 1; j < numsLength; j++) {

                sumOfTwoElementsInArray = nums[i] + nums[j];


                if (sumOfTwoElementsInArray == target) {
                    return new int[]{i, j};
                }


            }





        }
        //throw new IllegalArgumentException("No two sum solution"); // remeber this one


        return new int[]{}; // Empty array

    }


    public static void main(String[] args) {

        int[] nums = {3,2,4};
        int[] result = twoSum(nums, 6);

        for (int i : result)
            System.out.println(i);

    }

}
