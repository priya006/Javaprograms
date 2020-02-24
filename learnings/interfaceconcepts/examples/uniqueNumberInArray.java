package learnings.interfaceconcepts.examples;

public class uniqueNumberInArray {


/*    private static int getUniqueNumber(int[] arr) {

        int uniqueNumber = 0;
        int result;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                result = (arr[i] ^ arr[j]);
                System.out.println("XOR Result =" + (arr[i] ^ arr[j]));
                if (result == 0) {
                    uniqueNumber = arr[i];
                    break;
                }
            }
        }

            return uniqueNumber;

        }*/

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 5, 6, 7};

        int totalXor = 0;
        int Xor = 0;
        for (int i = 1; i <= array.length + 1; i++)
            totalXor ^= i;
        for (int i : array)
            Xor ^= i;


        int result = totalXor ^ Xor;
        System.out.println("Missing Number:" + result);

    }
}

