package learnings.interfaceconcepts.examples;

public class BitManipulation {
    public static void main(String[] args) {

        int first = 2;
        int second = 5;
        int third = 2;

        int result = first ^ second ^ third;  //  Exclusive OR (XOR)

        int result1 = 12 ^ 25;

        System.out.println(result);
        System.out.println(result1);


        int problemresult = 2 ^ 2 ^ 1;
        System.out.println(problemresult);

        //if all are distinct

//https://www.vojtechruzicka.com/bit-manipulation-java-bitwise-bit-shift-operations/

        int A = 0;
        int B = 1;

        int AndOperation = A & B; //like mutiples
        System.out.println("AndOperation:" +AndOperation);




        int E = 1;
        int F = 0;

        int OROperation = E | F; //just add
        System.out.println("OROperation:" +OROperation);


    }
}
