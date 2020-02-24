package learnings.interfaceconcepts.examples;

public class PerfectNumber {

    private static int divisors = 0;
    private static boolean checkPerfectNumber(int num) {

        //Walkthrough the numbers from i = 1 to i < num in for loop and find num % i
        // if( num % i == 0) It means the given number is divisible by i
        // Add all divisors and  put that in a variable ( divisors += i)
        // if all the  summed  divisors is equal to the given number  then return true and break from the if loop
        // else return false;
        //You will do all the above code only when num > 0

        if (num == 0) return false;

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                divisors += i;

            }

            if (divisors == num) {

                return true;
            }



        }
        return false;
    }




}
