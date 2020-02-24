package learnings.interfaceconcepts.examples;

public class NullPOinterException extends Throwable {


    public static void main(String[] args) {
        int[] arr = new int[4];
        // array of size 4.
        try {


            // this statement causes an exception
            int i = arr[3];
            System.out.println("TRY");
        } catch (ArrayIndexOutOfBoundsException ex) {

            System.err.println(ex.getMessage());
        } finally {
            // the following statement will never execute
            System.out.println("Hi, I want to execute");
        }

        int i = -2147483648;
        Integer j = i;
        System.out.print(j);
    }


}
