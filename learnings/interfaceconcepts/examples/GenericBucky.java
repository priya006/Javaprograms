package learnings.interfaceconcepts.examples;

public class GenericBucky {


    public static void main(String[] args) {

        Integer[] iarray = {2, 6, 4};
        Character[] ichar = {'A', 'B', 'C'};

        printME(iarray);
        printME(ichar);

    }

    public static <T> void printME(T[] x) {

        for (T i : x) {

            System.out.printf("%s", i);
            System.out.println();

        }
    }


/*    public static void printME(Character[] ichar) {

        for (Character c : ichar) {

            System.out.println("This is an character " +c);

        }
    }*/

}
