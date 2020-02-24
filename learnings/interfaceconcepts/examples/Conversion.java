package learnings.interfaceconcepts.examples;

public class Conversion {
    public static void main(String[] args) {

        String str = "priya";
        int i = 10;
        String j = "10";
        char c = '\0';

        StringBuilder stringBuilder = new StringBuilder("hello"); //StringBuilder object


        System.out.println(String.valueOf(stringBuilder));//converting object to a string
        System.out.println(Integer.parseInt(j)); // it should print 10 as int

        System.out.println( Integer.toString(i)); //convert integer to string
        System.out.println( Character.toString('a'));//convert character to string

    }
}
