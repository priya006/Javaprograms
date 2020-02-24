package learnings.interfaceconcepts.examples;

public class FirstMaximumLengthOfEvenWord {

    public static void main(String[] args) {

        String words = "this7676767676767676787878787878 is a test string767676";
        String maximumLengthString = findMaximumLengthOfEvenWords(words);
        System.out.println(maximumLengthString);

    }


    private static String findMaximumLengthOfEvenWords(String str) {
        int eachWordLength;
        int maximumLength = 0;
        String maximumLengthString = null;
        String[] stringWithoutSpace = str.split(" ");


        if (str.length() == 0) return null;

        for (int i = 0; i < stringWithoutSpace.length; i++) {
            eachWordLength = stringWithoutSpace[i].length();
            if (eachWordLength % 2 == 0 && eachWordLength > maximumLength) {
                maximumLength = eachWordLength;
                maximumLengthString = stringWithoutSpace[i];
            }
        }

        return maximumLengthString;
    }
}


// Make the program to return the word