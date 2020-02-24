package learnings.interfaceconcepts.examples;

public class ReverseVowels {
    public static void main(String[] args) {

        String result = reverseVowels("hello");
        System.out.println(result);

    }

    //Priya's solution

    public static String reverseVowels(String s) {


        int stringLength = s.length();
        int j = 0;
        StringBuilder reversedVowels = new StringBuilder();
        StringBuilder stringS = new StringBuilder();

        for (int i = 0; i < stringLength; i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) ==
                    'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                reversedVowels.append(s.charAt(i));

        }

        reversedVowels.reverse();
        String reverseVowels = reversedVowels.toString();

        stringS.append(s);

        for (int k = 0; k < stringLength; k++) {

            if (s.charAt(k) == 'a' || s.charAt(k) == 'e' || s.charAt(k) == 'i' || s.charAt(k) == 'o' || s.charAt(k) == 'u') {
                stringS.deleteCharAt(k);
                stringS.insert(k, reverseVowels.charAt(j));
                j++;
            }
        }
        return stringS.toString();

    }

}
