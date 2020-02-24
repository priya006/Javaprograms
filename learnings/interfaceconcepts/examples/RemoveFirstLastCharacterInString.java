package learnings.interfaceconcepts.examples;

public class RemoveFirstLastCharacterInString {

    public static void main(String[] args) {

        String words = "Geeks for geeks";
        String words1 = "";

        String[] stringSplitted = words.split(" ");

        for (String str : stringSplitted) {
            words1 += str.substring(1, str.length() - 1)+ " ";

        }
        System.out.println(words1);
    }
}
