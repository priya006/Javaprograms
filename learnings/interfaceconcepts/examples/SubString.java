package learnings.interfaceconcepts.examples;

public class SubString {

    static boolean isSubstring(String string1, String string2) {
        char c;
        char d;
        boolean match = true;
        for (int i = 0; i < string1.length(); i++) {
            c = string1.charAt(i);
            for (int j = 0; j < string2.length(); j++) {
                d = string2.charAt(j);
                if (c != d) {
                    match = false;
                } else {
                    match = true;
                }
            }
        }
        return match;
    }



    public static void main(String args[]) {

        String string1 = "ant"; //first

        

        String string2 = "tyant\r";
        if (isSubstring(string1, string2)) {
            System.out.println("The first string is a substring of the second.");
        } else {
            System.out.println("The first string is NOT a substring of the second.");
        }
    }
}
