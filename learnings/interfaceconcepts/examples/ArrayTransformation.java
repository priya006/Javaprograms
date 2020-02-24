package learnings.interfaceconcepts.examples;

public class ArrayTransformation {


/*    public static int[] moveZeroes(int[] nums) {
        int arrayLength = nums.length;

        int j = arrayLength - 1;
        for (int i = 0; i < arrayLength; i++) {
            if (nums[i] == 0) {
                nums[j] = nums[i];
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0, 3, 12};
        int[] movedZerosArray = moveZeroes(nums);
        for (int i = 0; i < movedZerosArray.length; i++)
            System.out.println(movedZerosArray[i]);

    }*/


    public static void main(String[] args) {

        int[] arr = {0, 0,1, 3};
        int arrayLength = arr.length;
        int count = 0; // Make note of every non-zero elements in the array

        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] != 0)   // i = 2 //count =1
                arr[count++] = arr[i];

        }
        while (count < arrayLength)
            arr[count++] = 0;

        for (int j = 0; j < arrayLength; j++)
            System.out.println(arr[j]);

    }
}
