package learnings.interfaceconcepts.examples;

public class AddDigits {

    private static int onesPlace;
    private static int newNum;

    public static void main(String[] args) {


        int result = addDigits(10);
        System.out.println(result);


    }


    public static int addDigits(int num) {

        while (num > 9) {

            int newNum = 0;
            while (num > 0) {
                onesPlace = num % 10;
                newNum += onesPlace;
                num /= 10;
            }

            num = newNum;
        }
        return num;
    }
}
