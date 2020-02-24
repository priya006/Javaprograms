package learnings.interfaceconcepts.examples;

public class SquareRoot1 {

    // Returns floor of square root of x
    static int floorSqrt(int x) {
        // Base cases
        if (x == 0 || x == 1)
            return x;

        // Staring from 1, try all numbers until
        // i*i is greater than or equal to x.
        int i = 1, result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    //Math.round(num)  This is a good one to round

    // Driver program
    public static void main(String[] args) {
        int x = 11;
        System.out.print(floorSqrt(x));

        String s = "priya";
        StringBuilder sb = new StringBuilder();
        sb.append(s);

        sb.delete(0,2);
        System.out.println(sb.toString());

    }

}
