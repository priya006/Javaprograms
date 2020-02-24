package learnings.interfaceconcepts.examples;

public class LengthOfLastWord {

    private static int lastStringLength = 0;

    //I made assumption that the string is always more than two words with spaces in between. Example: "a" you cant do that


    public static void main(String[] args) {

        int result = lengthOfLastWord("Welcome to India");
        System.out.println(result);


    }
    public static int lengthOfLastWord(String s) {

        String[] splittedString = s.split(" ");
        int splittedStringLength = splittedString.length;

        if (splittedStringLength > 1) {
            String lastString = splittedString[splittedStringLength - 1];
            lastStringLength = lastString.length();

        }
        return lastStringLength;
    }
}
