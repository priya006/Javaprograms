package learnings.interfaceconcepts.examples;

public class CountPrime {
    public static void main(String[] args) {


        int result = countPrimes(10);
        System.out.println(result);


    }


    private static int countPrimes(int n) {

        int count = 0;
        if (n <= 0) return 0;

        for (int i = 1; i < n; i++) {

            if (i % 2 != 0)
                count++;
        }
        return count;
    }
}
