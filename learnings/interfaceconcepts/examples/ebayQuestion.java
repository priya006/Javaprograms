
package learnings.interfaceconcepts.examples;

public class ebayQuestion {
/*
    public static void main(String[] args) {


    }


    private static int reverseTheNumber(int number) {

        if (number > 0) {

            int lastDigit = number % 10; // 456 % 10
            int nextDigits = number / 10; //456/10 = 45
            nextDigits * 10;

            int lastSecondDigit = nextDigits / 10;  // 45 /10 = 4


            return lastDigit * 100;
        }*/


    static int reversDigits(int num)
    {
        int rev_num = 0;
        while(num != 0)
        {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    // Driver code
    public static void main (String[] args)
    {
        int num = 123;
        System.out.println("Reverse of no. is "
                + reversDigits(num));
    }

}



