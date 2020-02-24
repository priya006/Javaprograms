package learnings.interfaceconcepts.examples;

public class SquareRoot {

    public static void main(String[] args) {


        boolean result = isPerfectSquare(25);
        System.out.println(result);
    }


    private static boolean isPerfectSquare(int num) {

        boolean isPerfectSquare = false;

        if (num < 0) return false;

        for (int i = 1; i < num; i++) {

            int square = i * i;
            if (square == num) {
                isPerfectSquare = true;
                break;

            }
        }
        return isPerfectSquare;
    }
}
