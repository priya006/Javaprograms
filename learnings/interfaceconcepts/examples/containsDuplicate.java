package learnings.interfaceconcepts.examples;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {


    public static boolean containsDuplicate(int[] nums) {

        boolean containsDuplicate = false;
        int arrayLength = nums.length;

        Set<Integer> hashset = new HashSet<>();


        if (arrayLength <= 0)
            return containsDuplicate = false;

        for (int i = 0; i < arrayLength; i++) {

            if (!hashset.contains(nums[i]))
                hashset.add(nums[i]);
            else
                containsDuplicate = true;
        }

        return containsDuplicate;

    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2};
        boolean containsDuplicate = containsDuplicate(nums);
        System.out.println(containsDuplicate);

    }
}
