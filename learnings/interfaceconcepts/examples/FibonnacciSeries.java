package learnings.interfaceconcepts.examples;


public class FibonnacciSeries {


    public static void main(String[] args) {

        //0 1 [1] (2) 3 5 8
        //0 1 2 3 4 5 6

        int inputNumber = 51;
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 0;  //

        int some = -12;
        String toString = String.valueOf(some);
        System.out.println(toString.charAt(0));



        while (thirdNumber < inputNumber) {

            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;

        }

        if (inputNumber == thirdNumber)
            System.out.println("It is a fibonnaci Series");
        else
            System.out.println("It is NOT fibonnaci Series");

    }
}
