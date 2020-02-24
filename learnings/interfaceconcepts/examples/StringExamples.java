package learnings.interfaceconcepts.examples;

public class StringExamples {
    public static void main(String[] args) {

        //String is a Final class. once created the value cannot be altered.Thus String objects are called immutable(Not changeable)

        String str = "RockStar";

        System.out.println(str.endsWith("i"));

        System.out.println(str.replace("Rock","stupid"));
        System.out.println(str.toLowerCase());


    }
}
