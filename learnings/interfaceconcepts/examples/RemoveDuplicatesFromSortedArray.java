package learnings.interfaceconcepts.examples;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {


        int[] nums = {-1,-1,2};

        int result = removeDuplicates(nums);

        System.out.println(result);
    }


    private static int removeDuplicates(int[] nums) {

        int count = 0;
        if (nums.length == 0)
            return 0;

        for (int j = 0; j < nums.length - 1; j++) {

            if (nums[j] != nums[j + 1]) {
                count++;
                //  nums[count] = nums[j];
            }
        }


        return count + 1;
    }


}
