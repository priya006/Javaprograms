package learnings.interfaceconcepts.examples;


public class UniqueCharacters {


    public static void main(String[] args) {
        findUniqueCharacters("pariya");
    }


    private static void findUniqueCharacters(String str) {

        int StringLength = str.length();
        boolean isUnique = true;
        if (StringLength > 0) {
            for (int i = 0; i < StringLength; i++) {
                for (int j = i + 1; j < StringLength; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        isUnique = false;
                        break;
                    }
                }
                if (!isUnique)
                    break;
            }

            if (isUnique) {
                System.out.println("They have Unique Characters");
            } else {
                System.out.println("They DONT have Unique Characters");
            }
        }
    }
}


//I could not get "They DONT have Unique Characters" which means once i get isUnique =
// false once i want to break the loop
//simple issue with if condition

//Implement an algorithm to determine if a string has all unique characters. What if you
// can not use additional data structures?
