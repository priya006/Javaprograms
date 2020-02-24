package learnings.interfaceconcepts.examples;

public class ExampleProblem {

    public static void main(String[] args) {

        int result = reverseTheNumber(123);
        System.out.println(result);
    }


    private static int reverseTheNumber(int number) {


        int reverse_num = 0;
        int appleSauce = 0;
        while (appleSauce > 0) {

            reverse_num = number % 10; // 456 % 10 //6(ans)
            appleSauce = number / 10; //456/10 = 45

        }

        return reverse_num;

    }

}