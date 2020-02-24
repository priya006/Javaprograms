package learnings.interfaceconcepts.examples;

public class RotateArray {

    //Use two empty boxes lastDigit and temp


    public static void rotate(int[] nums, int k) {
        int temp, lastDigit;
        for (int i = 0; i < k; i++) {
            lastDigit = nums[nums.length - 1];
                for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = lastDigit;
                lastDigit = temp;
            }
        }
    }


    public static void main(String[] args) {

        int[] array = {1, 2, 3};



        rotate(array, 2);
        for (int i : array)
            System.out.println(i);

    }


}
