package learnings.interfaceconcepts.examples;

import java.util.Arrays;

public class MergeSortedArray {


    private static int[] mergeArray(int[] nums1, int m, int[] nums2, int n) {

        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int[] nums3 = new int[nums1Length + nums2Length];
        int k = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 0; i < nums1Length; i++) {
            for (int j = 0; j < nums2Length; j++) {
                while (k < nums1Length + nums2Length) {

                    if (nums1[i] < nums2[j]) {
                        nums3[k] = nums1[i];
                        break;

                    } else
                        nums3[k] = nums2[j];

                    k++;
                }
            }
        }

        return nums3;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};

        int[] result = mergeArray(arr1, 4, arr2, 4);
        for (int a : result)
            System.out.print(a);
    }
}
