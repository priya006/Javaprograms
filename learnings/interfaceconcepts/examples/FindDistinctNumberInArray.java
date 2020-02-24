package learnings.interfaceconcepts.examples;

public class FindDistinctNumberInArray {


    public static int singleNumber(int[] nums) {

        // 0 ^ 0 = 0
        // 1 ^ 1 = 0
        // 1 ^ 0 = 1
        //0 ^ 1 = 1


        //https://leetcode.com/problems/single-number/


        if(nums.length == 0) throw new IllegalArgumentException("Pls give correct input");

        int xorResult = nums[0];


        for (int i = 1; i < nums.length; i++) {

            xorResult = xorResult ^ nums[i];

        }

        return xorResult;

    }


    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 1, 2};  //Think about how this code can handel null values??
        int result = singleNumber(nums);
        System.out.println(result);


    }
}
