package learnings.interfaceconcepts.examples;

public class reverseNumber {

    public static void main(String[] args) {


        int inputNumber = 123;
        int revertedNumber = 0;
        while (inputNumber > 0) {
            revertedNumber = revertedNumber * 10 + inputNumber % 10;
            inputNumber /= 10;
        }
        System.out.println(revertedNumber);

    }


}
