package learnings.interfaceconcepts.examples;

public class palinDrome {

    private static boolean ispalindrome = false;
    private static char[] characterArray;

    public static boolean isPalindrome(String s) {

        //madam
        char[] characterArray = s.toCharArray();
        for (int i = s.length() - 1; i < 0; i--) {
            for (int j = 0; j < s.length(); j++) {

                if (characterArray[i] ==characterArray[j])
                    ispalindrome = true;
                else
                    ispalindrome = false;
            }
        }
        return ispalindrome;
    }

    public static void main(String[] args) {

        boolean result = palinDrome.isPalindrome("mam");
        System.out.println(result);

    }

}
