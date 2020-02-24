package learnings.interfaceconcepts.examples;

public class OnebitCharacter {
    public static void main(String[] args) {

        //https://leetcode.com/problems/1-bit-and-2-bit-characters/

        int[] bits = {1, 0, 0};
        boolean result = isOneBitCharacter(bits);
        System.out.println(result);

        int nums = 38;
        int[] nums1 = new int[5];
        nums1[0]= 38;




    }


    public static boolean isOneBitCharacter(int[] bits) {
        int i = bits.length - 2;
        while (i >= 0 && bits[i] > 0) i--;
        return (bits.length - i) % 2 == 0;
    }
}
